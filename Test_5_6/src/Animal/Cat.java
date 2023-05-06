package Animal;

public class Cat extends Animal {

    public Cat() {

    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(name+"正在吃猫粮");
    }

    public void mew() {
        System.out.println(name+"正在喵喵叫");
    }
}

