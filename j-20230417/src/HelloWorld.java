public class HelloWorld {

    public static void main(String[] args) {
        int a = 10;
        long b =20L;

    }

    public static void main7(String[] args) {
        //布尔型 true表示真 false表示假。
        //boolena无法强制类型转换，只能有true和false
        //JVM没有明确他的大小。
        boolean flag = true;
        System.out.println(flag);
    }


    public static void main6(String[] args) {
        //字符型，占用2个字节。
        char a = 'a';
        System.out.println(a);

        a='鸡';
        System.out.println(a);

        char ch3 = 97;
        System.out.println(ch3);

        System.out.println(Character.MAX_RADIX);
        System.out.println(Character.MIN_VALUE);

    }

    public static void main5(String[] args) {
        float a = 12.5F;
        //小数默认是double类型，需求在数字后面加f或F转换成float类型。
        System.out.println(a);
    }
        public static void main4(String[] args) {

            double d = 12.5;
            //8个字节
            System.out.println(d);

            double a = 1.0;
            double b = 2;
            System.out.println(a/b);

            double num = 1.1;
            System.out.println(num*num);
            //双精度浮点数的问题

    }

    public static void main3(String[] args) {
        byte a = 10;
        //byte的取值范围
        System.out.println(a);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
    }
    public static void main2(String[] args) {

        //short的取值范围
        short sh = 10;
        System.out.println(sh);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

    }
    public static void main1(String[] args) {
        int a = 10;
        long b = 10L;
        //int Long 取值范围
        System.out.println(a);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(b);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

    }
}
