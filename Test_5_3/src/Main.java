public class Main {

    public static void main(String[] args) {
        Derived s1 = new Derived();
        System.out.println("============================");
        Derived s2 = new Derived();
    }


    public static void main3(String[] args) {
        Dog xiaoHei = new Dog("小黑", 3);
        Cat xiaoJu = new Cat("小橘", 2);
        System.out.println(xiaoHei);
        System.out.println(xiaoJu);

    }

    public static void main2(String[] args) {
       // Derived s1 = new Derived();
       // s1.func();
    }

    public static void main1(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();


        dog.setName("小黑");
        cat.setName("小橘");

        dog.bark();
        cat.mew();
    }
}
