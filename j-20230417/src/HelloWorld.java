public class HelloWorld {
        public static void main(String[] args) {

            double d = 12.5;
            //8个字节
            System.out.println(d);

            double a = 1.0;
            double b = 2;
            System.out.println(a/b);

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
