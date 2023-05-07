package Demo2;

/**
 * @author: 99655
 * @date: 2023/5/7 23:20
 * @description:
 */
public class Fish extends Animal implements ISwimming{
	public Fish(String name) {
		super(name);
	}

	@Override
	public void swim() {
		System.out.println(this.name+" 在游泳");
	}
}
