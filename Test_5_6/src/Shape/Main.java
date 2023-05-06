package Shape;

import Animal.Animal;
import Animal.Cat;
import Animal.Dog;


import static Animal.TestAnimal.eat;

public class Main {
    public static void main(String[] args) {
        Shape.drawShape();
        //Shape.drawShape1();
    }



    public static void main1(String[] args) {
        Dog dog = new Dog("小黑",3);
        Cat cat = new Cat("小橘",2);

        eat(dog);
        eat(cat);

        Animal animal = new Cat("大橘", 3);
    }

}
