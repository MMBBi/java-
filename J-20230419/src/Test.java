import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(n);

    }

    public static void main6(String[] args) {
        //找到一个既能被3整除的，也能被5整除的数字 要求使用break和continue
        int i = 1;
        while (true) {
            if (i % 3 == 0 && i % 5 ==0){
                System.out.println(i);
            }
            if (i == 100){
                break;
            }
            i++;
        }
    }

    public static void main5(String[] args) {
        int i = 0;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }
    }

    public static void main4(String[] args) {
        //判断求出1000 -200年之间的闰年
        int i = 0;
        int count = 0;
        for (i = 1001; i <= 2000; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || (i % 100 == 0 && i % 400 == 0)){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("闰年次数为："+count);
    }



    public static void main3(String[] args) {
        int a = 10;
        if (a > 0) {
            System.out.println("正数");
        } else if (a < 0) {
            System.out.println("负数");
        }else {
            System.out.println("为0");
        }
    }

    public static void main2(String[] args) {
        //判断一个数字是奇数还是偶数
        int a = 10;
        if (a % 2 ==0) {
            System.out.println("偶数");
        }else {
            System.out.println("奇数");
        }
    }

    public static void main1(String[] args) {

        //if...else语句的标准书写规范

        /*
        if(布尔表达式）{
            语句
        }else if{   //else紧跟右括号
            语句
        }else {
            语句
        }
         */
        int score = 92;
        if (score >= 90){
            System.out.println("奖励一发648");
        }else {
            System.out.println("回家卖红薯");
        }
    }
}
