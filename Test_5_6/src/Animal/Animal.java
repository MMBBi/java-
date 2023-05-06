package Animal;

public class Animal {
    public String name;
    public int age;

    public Animal() {

    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name+"正在吃东西");
    }
}

