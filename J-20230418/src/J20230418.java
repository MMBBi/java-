public class J20230418 {

    public static void main(String[] args) {
        //三目运算符
        boolean flag = (true == true) ? (true == true) ? false : true :true;
        System.out.println(flag);
    }

    public static void main3(String[] args) {


        System.out.println(5/2);
        System.out.println((float) 5/2);
        System.out.println(5/(float)2);
        System.out.println((float)(5/2));

        short sh = 2;
        sh += 4;
        System.out.println(sh);

    }


    public static void main2(String[] args) {
        //valueOf包装类的用法。
        String str = "12345";
        String str2 = "12.5F";
        int ret = Integer.valueOf(str);
        System.out.println(ret+1);

        float ret2 = Float.valueOf(str2);
        System.out.println(ret2+1);

    }

    public static void main1(String[] args) {
        int a = 12345;
        String ret = String.valueOf(a);
        System.out.println(ret);

        float f = 12.5F;
        String ret2 = String.valueOf(f);
        System.out.println(ret2);

    }

    public static void func1(String[] args) {
        String str1 = "hello";
        String str2 ="world";
        System.out.println(str1 + str2);

        int a = 10;
        int b = 20;
        System.out.println(a + b);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a + b = "+a+b);
    }

    public static void func(String[] args) {
        String str ="hello";
        System.out.println(str);

        int a = 10;
        System.out.println(a);
    }
}
