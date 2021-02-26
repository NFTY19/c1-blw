package task10;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Task10 {
    /*
        java中的多线程并发还是Java中比较难的一个点，想完全弄懂还是有些麻烦的

        创建两个线程 A 和 B，让他们交替打印 0 到 10 的所有整数，其中 A 线程打印偶数，B 线程
        打印奇数(以下代码参考于网络)
     */
    public static volatile int flag = 0; //volatile修饰变量保证对线程的可见性
    private static final int N  = 10;
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();//声明一个锁对象，
        Condition c = lock.newCondition();//创建这个锁对应的一个条件变量

        Thread r1 = new Thread( //线程A用来输出偶数
                ()->{
                    while(flag<=N){
                        try{
                            lock.lock();//首先获取锁
                            if(flag%2==1){//如果当前值为奇数，就将线程阻塞挂起
                                c.await();//将当前线程挂起
                            }
                            System.out.println(Thread.currentThread().getName()+"打印:"+flag);
                            flag++;//自增1
                            c.signal(); //唤醒其他因为这个条件而被被挂起的线程
                        }catch(InterruptedException e){
                            e.printStackTrace();
                        }finally{
                            //这里必须在finally代码块中来释放锁，防止应其他异常导致线程中断，但是锁					    //却没有释放，导致出现死锁
                            lock.unlock();
                        }
                    }
                }
        );

        Thread r2 = new Thread(//线程B用来输出奇数
                ()->{
                    while(flag<N){
                        try{
                            lock.lock();//首先获取锁
                            if(flag%2==0){//如果当前值为偶数，就将线程阻塞挂起
                                c.await();
                            }
                            System.out.println(Thread.currentThread().getName()+"打印:"+flag);
                            flag++;//自增1
                            c.signal();
                        }catch(InterruptedException e){
                            e.printStackTrace();
                        }finally{
                            lock.unlock();
                        }
                    }
                }
        );
        r1.setName("线程A");
        r2.setName("线程B");
        r1.start();
        r2.start();
    }
}
