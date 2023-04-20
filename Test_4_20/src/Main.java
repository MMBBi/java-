import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列
         */
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        //打印奇数位
        for (int i = 31; i >= 1; i-=2) {
            System.out.print(((num >>> i) & 1)+" ");
        }
        System.out.println();
        for (int i = 30; i >= 0 ; i-=2) {
            System.out.print(((num >>> i) & 1)+" ");
        }
    }


    public static void main3(String[] args) {
        /*
        编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，提示“登录成功”,密码错误，
        可以重新输入，最多输入三次。三次均错，则提示退出程序
         */
        String passWord = "123456";
        Scanner scan = new Scanner(System.in);
        int n = 3;
        while (n != 0) {
            System.out.println("请输入密码：");
            String passWord2 = scan.next();
            if (passWord.equals(passWord2)) {
                System.out.println("登录成功");
                break;
            }else {
                if (n == 1) {
                    System.out.println("输入错误，机会已用完");
                    break;
                }
                System.out.println("输入错误，请重新输入,你还有"+(n-1)+"次机会");
                n--;
            }
        }
    }

    public static void main2(String[] args) {
        /*
        输出一个整数的每一位，如：123的每一位是3，2，1
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("输入一个整数");
        int n = scan.nextInt();
        int num = n;
        while (num / 10 != 0 || n != 0) {
            num = n % 10;
            System.out.println(num);
             n /= 10;
             num = n;
        }

    }

    public static void main1(String[] args) {
        /*
        输出n*n的乘法口诀表，n由用户输入。
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("输入一个整数");
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d*%d=%d ", i, j, i*j);
            }
            System.out.println();
        }
    }
}
