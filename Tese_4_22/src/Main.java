import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个整数");
        int n = scanner.nextInt();
        //System.out.println(fact(n));
        //System.out.println(sum2(n));
        //print1(n);
        //System.out.println(sum3(n));
        System.out.println(fib(n));

    }

    public static int fib(int n) {
        //递归求斐波那契数列的第 N 项
        if (n <= 2) {
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }

    public static int sum3(int n) {
        //输入一个非负整数，返回组成它的数字之和
        if (n <= 9) {
            return n;
        }
        return n % 10 + sum3(n / 10);
    }

    public static void print1(int n) {
        //打印一个数字的每一位，如果1234打印 1 2 3 4

        if (n <= 9) {
            System.out.println(n);
            return ;
        }
        print1(n / 10);
        System.out.println(n % 10);
    }

    public static int sum2(int n) {
        //求1+2+3+4....+n的和
        if(n == 1) {
            return 1;
        }

        return  n + sum2(n-1);
    }

    public static int fact(int n) {
        //求n的阶乘
        if (n == 1) {
            return 1;
        }
        return n * fact(n-1);
    }

    public static void main1(String[] args) {
        /*
         在同一个类中定义多个方法：要求不仅可以求2个整数的最大值，还可以求3个小数的最大值？
         */
        int a = 10;
        int b = 20;

        double d1 = 1.5;
        double d2 = 2.5;
        double d3 = 3.5;

        //System.out.println(isMax(a, b));
        //System.out.println(isMax(d1, d2, d3));

        System.out.println(sum1(a, b));
        System.out.println(sum1(d1, d2, d3));

    }

    public static int sum1 (int a, int b) {
        //求2个整数数相加的和
        return a+b;
    }

    public static double sum1(double a, double b, double c) {
        //求三个小数相加的和
        return a + b + c;
    }

    public static int isMax(int a, int b) {
        return Math.max(a, b);
    }

    public static double isMax(double a, double b, double c) {
        double m = Math.max(a, b);
        return Math.max(m, c);
    }
}
