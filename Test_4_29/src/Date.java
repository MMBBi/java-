public class Date {
    public int year;
    public int month;
    public int day;


    public Date() {
        //System.out.println("无参构造方法被调用了");
        //这里注释如果取消掉的话编译会报错，因为通过this引用构造方法，this必须在第一行。

        //此处可以通过this引用方访问带有三个参数的构造方法，
       this(2023,5,1);
       System.out.println("无参构造方法被调用了");
    }

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
        System.out.println("有三个参数的构造方法被调用了");
    }

    public void printfDate() {
        System.out.println(this.year+"/"+this.month+"/"+this.day);
        this.show();
    }

    public void show() {
        System.out.println("this访问了show");
    }
}
