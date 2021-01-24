import java.util.Scanner;

public class Task4_numsOrd {
    public static void main(String[] args) {
        //给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的
        //相对顺序。
        int[] nums = new int[10001];//开辟一个大数组
        int length = 0;//记录当前需要处理的数组长度
        System.out.println("请输入原数组,以非数值停止：");

        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()){
            nums[++length] = in.nextInt();//输入的数保存在数组中
        }
        int L = length;//记录总长度

        for (int j = 1; j <= length; j++) {
            while(nums[j] == 0){   //判断当前元素是否为0
                int i = j;
                if(j > length)  break;//判断跳出循环，防止死循环
                for (; i <= length; i++) {
                    nums[i] = nums[i + 1];//把当前为0的后面元素依次前移
                }
                length--;//第length个元素已经处理完毕，只需要处理前面length-1个元素
            }
        }

        for (int i = 1; i <= L; i++) {
            System.out.print(nums[i] + " ");
        }

    }
}
