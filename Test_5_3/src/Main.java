public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.setName("小黑");
        cat.setName("小橘");

        dog.bark();
        cat.mew();
    }
}
