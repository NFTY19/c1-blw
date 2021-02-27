package task11;

class Info        //定义信息类
{
    private String name = "nfty" ;        //定义name属性
    private String content = "拥有好人卡" ;        //定义content属性
    private boolean flag = false ;    //设置标志位


    public synchronized void set(String name, String content){
        if(!flag){        //方法每次执行的时候都检查一下标志位状态，从而判断时候进行生产
            try{
                super.wait() ;
            }catch(InterruptedException e){
                e.printStackTrace() ;
            }
        }
        this.setName(name) ;        //设置名称
        try{
            Thread.sleep(300) ;
        }catch(InterruptedException e){
            e.printStackTrace() ;
        }
        this.setContent(content) ;    // 设置内容
        flag = false ;        //改变标志位,表示可以取走
        super.notify() ;    //唤醒线程
    }

    public synchronized void get(){
        if(flag){        ////方法每次执行的时候都检查一下标志位状态，从而判断时候进行取出
            try{
                super.wait() ;
            }catch(InterruptedException e){
                e.printStackTrace() ;
            }
        }
        try{
            Thread.sleep(300) ;
        }catch(InterruptedException e){
            e.printStackTrace() ;
        }
        System.out.println(this.getName() +
                " --> " + this.getContent()) ;
        flag = true ;    //改变标志位,表示可以生成
        super.notify() ;
    }

    public void setName(String name){
        this.name = name ;
    }

    public String getName(){
        return this.name ;
    }

    public void setContent(String content){
        this.content = content ;
    }

    public String getContent(){
        return this.content ;
    }
}

class Producer implements Runnable        //通过Runnable实现多线程
{
    public Info info;        //保存Info引用
    public Producer(Info info){
        this.info = info ;
    }

    public void run(){
        boolean flag = false ;    //定义标记位
        for(int i = 0; i < 50; i++){
            if(flag){
                this.info.set("nfty", "拥有好人卡") ;
                flag = false ;
            }else{
                this.info.set("vs", "Code") ;
                flag = true ;
            }
        }
    }
}

class Consumer implements Runnable{        //消费者类
    private Info info;
    public Consumer(Info info){
        this.info = info ;
    }

    public void run(){
        for(int i = 0; i < 50; i++){
            this.info.get() ;
        }
    }
}

//测试代码
public class MultThread {
    public static void main(String[] args){
        Info info = new Info() ;    //实例化Info对象
        Producer pro = new Producer(info) ;    //生产者
        Consumer con = new Consumer(info) ;    //消费者
        new Thread(pro).start() ;
        new Thread(con).start() ;
    }
}
