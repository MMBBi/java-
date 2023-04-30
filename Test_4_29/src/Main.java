
public class Main {
    public static void main(String[] args) {
        Date day = new Date();
        day.printfDate();
    }

    public static void main4(String[] args) {
        Date day = new Date();
        System.out.println("==============================");
        Date day2 = new Date(2023,5,1);
    }

    public static void main3(String[] args) {
        Date day = new Date();
        day.printfDate();
    }

   public static void main2(String[] args) {
        Date day1 = new Date();
        Date day2 = new Date();
        Date day3 = new Date();

     /*   day1.setDay(2023,5,1);
        day2.setDay(2023,5,2);
        day3.setDay(2023,5,3);*/

        day1.printfDate();
        day2.printfDate();
        day3.printfDate();
    }
    public static void main1(String[] args) {
        //注意包含了main方法的类用了public修饰
        //第一步，通过new实例化对象。
        Phone iPhone14 = new Phone();//new了一个名为iPhone14的，Phone类型的对象。
        Phone mate50Pro = new Phone();//new了一个华为mate50pro
        Phone S23Ultra = new Phone();//new了一个三星s23Ultra
        Phone xiaomi13Ultra = new Phone();//new了一个小米13Ultra
        //第二步，给成员变量赋值
        //通过对象的名字加'.'访问成员变量进行赋值
        iPhone14.name = "iPhone 14";//手机的名字是iPhone14
        iPhone14.brand = "苹果"; //手机的品牌是苹果
        iPhone14.type = "14";//型号是14
        iPhone14.size = 6.1;//尺寸是6.1英寸
        iPhone14.weight = 172;//重量是172克

        //可以打印出来看一下
        System.out.println("手机名称:"+iPhone14.name);
        System.out.println("品牌是:"+iPhone14.brand);
        System.out.println("尺寸是:"+iPhone14.size);
        System.out.println("重量是:"+iPhone14.weight);
        //可以通过对象名访问成员方法
        iPhone14.callUp();
        iPhone14.sendOutNote();
        iPhone14.alarmClock();
    }

}
