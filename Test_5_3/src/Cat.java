public final class Cat extends Animal{

    public Cat() {
        super();
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    public void mew() {
        System.out.println(getName() + "喵喵叫");
    }
}
