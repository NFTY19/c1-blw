package task4_guess;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Game game = new Game();
        System.out.println("欢迎来到猜字游戏，请输入一个数：");
        while (true) {
            int x = in.nextInt();
            if (game.guess(x) == 0) {
                System.out.println("恭喜你，猜对了！");
                break;
            }else if (game.guess(x) == 1) {
                System.out.println("猜大了噢，再试一下吧！");
            }else if (game.guess(x) == -1) {
                System.out.println("猜的有点小，再试一下吧！");
            }
        }
    }
}
