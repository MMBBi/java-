public final class Dog extends Animal {

    public Dog() {
        super();
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public void bark() {
        System.out.println(getName() + "汪汪叫");
    }

}
