import javax.print.DocFlavor;
import java.util.Scanner;
import java.util.zip.Inflater;

public class Test {

    public static void main(String[] args) {
        /*
        猜数字游戏
         */
        Scanner inPut = new Scanner(System.in);
        int random = (int)(Math.random()*101);

        System.out.println("猜数字游戏，请输入一个0-100之间的数");


        while (true) {
            int n = inPut.nextInt();
            if (n > random) {
                System.out.println("猜大了");

            }else if (n < random) {
                System.out.println("猜小了");

            }else {
                System.out.println("猜对了");
                break;
            }
        }
    }


    public static void main9(String[] args) {
        /*
        求出0～n之间的所有“水仙花数”并输出。
         */
        //输入n
        Scanner InPut = new Scanner(System.in);
        int n = InPut.nextInt();
        for (int i = 0; i <= n; i++) {
            int tmp = i;
            int sum = 0; //总数的和
            int count = 1;//位数
            //判断位数
            while (tmp/10 != 0) {
                count++;
                tmp /= 10;
            }
            //计算各数字立方和
            tmp = i;
            while (tmp != 0) {
                sum += Math.pow(tmp % 10, count);
                tmp /= 10;
                //判断

            }
            if (sum == i) {
                System.out.println(i);
            }
        }

    }

    public static void main8(String[] args) {
        /*
        计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值。
         */
        double sum = 0;
        int flag = 1;
        for (int i = 1; i < 101; i++) {
            sum += 1.0/ i * flag;
            flag = -flag;
        }
        System.out.println(sum);
    }

    public static void main7(String[] args) {
        /*
        求两个整数的最大公约数。
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("给两个整数：");
        System.out.println("整数1：");
        int a = scan.nextInt();

        System.out.println("整数2：");
        int b = scan.nextInt();

        int c = a % b;

        while (c != 0) {
            a = b;
            b = c;
            c = a % b;
        }
        System.out.println("整数1和整数2的最大公约数是"+b);

    }

    public static void main6(String[] args) {
        /*
        求一个整数，在内存当中存储时，二进制1的个数。
         */
        //输入
        Scanner scan = new Scanner(System.in);
        System.out.println("给一个整数：");
        int n = scan.nextInt();
        int count = 0;
        //求二进制1的个数
        for (int i = 0; i < 32; i++) {
            if((((n>>>i) & 1) == 1)) {
                count++;
            }

        }
        System.out.println(n+"的二进制中1的个数为"+count);

    }

    public static void main5(String[] args) {
        /*
        编写程序数一下 1到 100 的所有整数中出现多少个数字9
         */
        int count = 0;

        for (int i = 1; i <= 100; i++) {
            //个位数
            if(i % 10 == 9) {
                System.out.println(i);
                count++;
            }
            //十位数
            if (i / 10 == 9) {
                System.out.println(i);
                count++;
            }

        }
        System.out.println("1到100的所有整数中出现了"+count+"个数字9");
    }

    public static void main4(String[] args) {
        /*
        输出1000年到2000年之间的闰年
         */
        int count = 0;
        for (int year = 1001; year <= 2000; year++) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.print(year+" ");
                count++;
            }
        }
        System.out.println(" ");
        System.out.println("1000到2000年之间闰年总共有"+count);
    }

    public static void main3(String[] args) {
        /*
        打印 1 - 100 之间所有的素数
         */
        int flag = 0;
        for (int i = 1; i <= 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                   flag = 1 ;
                   break;
                }else {
                    flag = 0;
                }
            }
            if(flag == 0) {
                System.out.print(i+" ");
            }
        }
    }


    public static void main2(String[] args) {
        /*
        给定一个数字，判定一个数字是否是素数
        */
        //输入
        System.out.println("请输入一个大于1的数：");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //判断
       int count = 0;
        for (int i = 2; i < n; i++) {
            if (n % i== 0) {
                System.out.println(n+"不是素数");
                break;
            }else {
                System.out.println(n+"是素数");
                break;
            }
        }
    }
}



/*    public static void main1(String[] args) {

        年龄打印
        main1:根据输入的年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)

        //输入
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入你的年龄");
        int age = scan.nextInt();
        //判断
        if (age <= 18) {
            System.out.println("少年");
        }else if (age >= 19 && age <= 28) {
            System.out.println("青年");
        } else if (age >= 29 && age <= 55) {
            System.out.println("中年");
        }else if (age >= 56) {
            System.out.println("老年");
        }
    }
}*/
