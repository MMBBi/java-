package Demo2;

/**
 * @author: 99655
 * @date: 2023/5/7 23:11
 * @description:
 */
public class Test {
	public static void main(String[] args) {
		Cat cat = new Cat("猫");
		cat.run();
		System.out.println("========================");
		Fish fish = new Fish("鱼");
		fish.swim();
		System.out.println("========================");
		Dock dock = new Dock("鸭子");
		dock.run();
		dock.fly();
		dock.swim();
		System.out.println("========================");
		Cock kunKun = new Cock("坤坤");
		//kunKun.fly();
		kunKun.playBasketball();

	}
}
