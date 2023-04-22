import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        /*
        青蛙跳台阶问题
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入台阶的数量");
        int n = scanner.nextInt();
        int sum = frogJump(n);
        System.out.println("青蛙跳"+n+"级台阶一共有"+sum+"总跳法");

    }

    //青蛙跳台阶问题研究过后发现本质上就是一个斐波那契数列。
    public static int frogJump(int n) {
        if (n <= 2) {
            return 1;
        }
        return frogJump(n-1) + frogJump(n-2);
    }

    public static void main1(String[] args) {
        /*
        递归求解汉诺塔问题
         */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        hanoiTower(n, 'A', 'B', 'C');
    }

    public static void hanoiTower(int n, char a, char b, char c) {
        if (n == 1) {
        move(a,c);
        return;
        }
        hanoiTower(n-1, a, c, b);//a上面的n-1个柱子 由a借助c移到b
        move(a, c);                 //剩下的一个移动到c上
        hanoiTower(n-1, b, a, c);//b上面的n-1个柱子再借助a移动到C上
    }

    public static void move (char x, char y) {
        System.out.println(x+" -> "+y);
    }
}
