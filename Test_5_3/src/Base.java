public  class Base {
    public int a;
    public int b;
    public int c = 199;

    static {
        System.out.println("父类静态代码块");
    }

    {
        System.out.println("父类实例代码块");
    }

    public Base() {
        System.out.println("父类构造方法");
    }

    public void methodA() {
        System.out.println("Base");
    }

}

class Derived extends Base {
    public int c = 9;

    static {
        System.out.println("子类静态代码块");
    }

    {
        System.out.println("子类实例代码块");
    }
    public Derived() {
        System.out.println("子类构造方法");
    }


    public void methodA() {
        System.out.println("Derived");
    }

    public void methodB() {
        System.out.println("Derived");
    }


    public void func() {
        System.out.println(a);
        System.out.println(b);

        //如果变量同名，优先访问子类自己的成员变量
        System.out.println(c);

        //如果需要访问父类的成员变量，需要通过super关键字来访问。
        System.out.println(super.c);

        //访问成员方法，如果同名优先访问自己的成员方法。
        methodA();
        //同名访问父类的成员方法需要加上super关键字。
        super.methodA();
        //不同名，父类有访问父类，父类没有访问子类，都没有则报错。
        methodB();
    }
}

