import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        float f = 1.5f;
        float f2 = 2.5f;
        float f3 = 3.5f;
        System.out.println(add(a, b));
        System.out.println(add(f, f2, f3));
    }
    public static int add(int a, int b) {
        return a + b;
    }

    public static float add(float a, float b, float c) {
        return a + b + c;
    }


    public static void main4(String[] args) {
        /*
        在同一个类中定义多个方法：要求不仅可以求两个整数的最大值，
        还可以求两个小数的最大值，以及两个小数和一个整数的大小关系
         */
        int a = 10;
        int b = 20;
        double c = 10.5;
        double d = 20.5;
        System.out.println("a和b的最大值是"+(isMax(a, b)));
        System.out.println(isMax(a, d, c));

    }
    public static double isMax(double a, double b) {
        if (a > b) {
            return a;
        }else if (a < b) {
            return b;
        }else {
            return a;
        }
    }
    public static double isMax(double a, double b, double c) {
        double m = Math.max(a, b);
        return Math.max(m, c);
    }

    public static void main3(String[] args) {
        /*
        求斐波那契数列的第n项。迭代实现
         */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(fib(n));
    }
    public static int fib(int n) {
        if(n <= 2) {
            return 1;
        }
        int a = 1;
        int b = 1;
        int tmp = 0;
        for (int i = 3; i <= n; i++) {
            tmp = a+b;
            a = b;
            b = tmp;
        }
        return tmp;
    }

    public static void main2(String[] args) {
        /*
        求n的阶乘
         */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(fac(n));//n的阶乘
        System.out.println(facNum(n));//n阶乘的和

    }
    public static int fac(int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        return sum;
    }

    public static int facNum(int n) {
        int num = 0;
        for (int i = 1; i <= n; i++) {
            num += fac(i);
        }
        return num;
    }


    public static void main1(String[] args) {
        /*
        创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3。
        要求：在max3这个函数中，调用max2函数，来实现3个数的最大值计算
         */
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(isMax(a, b));
        System.out.println(isMax(a, b, c));
    }
    public static int isMax(int a, int b) {
       return Math.max(a, b);
    }
    public static  int isMax(int a, int b, int c) {
        int ret = Math.max(a, b);
        return Math.max(ret, c);
    }
}
