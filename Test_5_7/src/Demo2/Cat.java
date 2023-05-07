package Demo2;

/**
 * @author: 99655
 * @date: 2023/5/7 23:18
 * @description:
 */
public class Cat extends Animal implements IRunning{
	public Cat(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println(this.name+" 在跑");
	}
}

