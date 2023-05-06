package Animal;

public class Dog extends Animal{

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(name+"正在吃狗粮");
    }

    public void bark() {
        System.out.println(name+"正在汪汪叫");
    }
}
