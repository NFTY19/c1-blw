# Java 第二次学习总结



## 简谈Java




Java是一门面向对象编程语言，不仅吸收了C语言的各种优点，还摒弃了C里难以理解的多继承、指针等概念，因此Java语言具有功能强大和简单易用两个特征。 Java语言作为静态面向对象编程语言的代表，极好地实现了面向对象理论，允许程序员以优雅的思维方式进行复杂的编程。




#### 而与 c++ 作对比


   JAVA和C++都是面向对象语言。也就是说，它们都能够实现面向对象思想（封装，继乘，多态）。而由于c++为了照顾大量的C语言使用者， 而兼容了C，使得自身仅仅成为了带类的C语言，多多少少影响了其面向对象的彻底性！JAVA则是完全的面向对象语言，它句法更清晰，规模更小，更易学。它是在对多种程序设计语言进行了深入细致研究的基础上，据弃了其他语言的不足之处，从根本上解决了c++的固有缺陷。





## 语言只是工具，算法才是程序设计的灵魂


  算法在计算机科学中的地位很重要，在很多大公司的笔试面试中，算法掌握程度的考察都占据了很大一部分。其实考算法，并不是为了考，而是为了在探讨算法的过程中，考察和验证一个人是否聪明，是否基本功扎实，是否能够顺畅沟通，是否能够快速反应和学习。

### 常见算法

* 二分搜索 Binary Search 
* 宽度优先搜索 Breadth First Search 
* 深度优先搜索 Depth First Search
* 分治 Divide Conquer 
* 回溯法 Backtracking 
* 双指针 Two Pointers 
* 动态规划 Dynamic Programming 
* 快排 Quick Sort



### 推荐书籍


#### 入门
**《大话数据结构》**  		

**《算法图解》**

#### 进阶
**《算法竞赛入门经典》**

**《挑战程序设计竞赛》**





### dfs算法模板：
``` java
static int n, m;//n:有几个数  m:要几个 
static boolean used[ ];//是否用过 
int ans[ ];//答案 
static void dfs(int u){
    if (全局判断){//到头就走 
        做要做的事
        return ;//退出 
    }
    for (int i = 开始的地方; i <= n; i++)//从上一个数开始依次增加，枚举每一种情况 
        if (used[i] == 0) {//判断是否用过
            加入结果 设为用过
            dfs(u + 1);//下一个数字 
            回溯：回到没用过
            }
    return ;//退出 
}
public static void main(){

    输入 初始化
    dfs(1);//开始搜索，从1开始 
}
```





### dfs例题



```java
package task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    /*
      三数之和：给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a, b，c ，使得 a + b + c =target。请你找出所有满足条件且不重复的三元组。
     */

    private static List<List<Integer>> lists = new ArrayList<>();
    private static List<Integer> list = new ArrayList<>();

    public static List<List<Integer>> threeSum(int[] nums, int target) {
        dfs(nums,target,1,0, 0);//直接暴力搜索
        return lists;
    }

    public static void dfs(int[] nums, int target, int deep, int now, int index) {
        if (deep <= 3) {//判断循环条件
            for (int i = index; i < nums.length; i++) {
                list.add(nums[i]);
                dfs(nums,target,deep+1,now+nums[i],i+1);//递归
                list.remove(deep-1);//回溯
            }
        }
        else if (now == target) {
            List<Integer> temp = new ArrayList<>(list);
            boolean judge = true;//创建辅助变量
            for (List<Integer> l : lists) {
                if (l.containsAll(temp)) {
                    judge = false;
                    break;
                }
            }
            if (judge) lists.add(temp);//判断符合条件的加入到答案集合中
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入n的值：");
        int n = in.nextInt();
        int[] nums = new int[n];

        System.out.println("请输入原数组：");
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        System.out.println("请输入目标值：");
        int target = in.nextInt();

        List<List<Integer>> lists = threeSum(nums, target);
        System.out.println(lists);
    }
}
```






### 本周例题：
```java
package task3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    /*
        给你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集

        由小学数学可知，真子集的个数为2^n个（每个元素都有两种可能，放与不放）。
        暴力深搜，没啥可解释的。 直接看代码
     */
    static ArrayList<Integer> ans = new ArrayList<>();

    static void dfs(int[] num, int now, int length) {
        for (int i = now; i <= length; i++) {
            ans.add(num[i]);//加入
            System.out.print(ans);//输出
            dfs(num, i+1, length);//递归
            ans.remove(ans.size()-1);//回溯
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] num = new int[10010];//老样子，先开个大数组
        int length = 0;//记录长度
        while (in.hasNextInt()) {
            num[++length] = in.nextInt();//依次传入
        }
        System.out.print(ans);
        dfs(num, 1, length);
    }

}
```
