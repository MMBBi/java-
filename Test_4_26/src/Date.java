public class Date {

    public int year;

    public int month;

    public int day;

    /*public void setDay(int y, int m, int d) {
        year = y;
        month = m;
        day = d;

    }*/


    //this引用的使用发放
    //方法1：给当前对象的属性赋值
    public void setDay(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void printDay() {
        System.out.println(year+"/"+month+"/"+day);
    }


    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
        System.out.println("构造方法被调用了");
        System.out.println("================================");

        //this访问成员方法
        this.printDay();
        System.out.println("通过this访问了成员方法");
        System.out.println("================================");
    }

    public Date() {
        //方法2：访问其他构造方法
        //必须是构造方法中的第一条语句
        //不能形成环
        this(2023,4,26);
        System.out.println("通过this访问了有参数的构造方法");
        System.out.println("================================");


    }

}
