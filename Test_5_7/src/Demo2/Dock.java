package Demo2;

/**
 * @author: 99655
 * @date: 2023/5/7 23:31
 * @description:
 */
public class Dock extends Animal implements IRunning,ISwimming,IFlying{

	public Dock(String name) {
		super(name);
	}

	@Override
	public void fly() {
		System.out.println(this.name+"会飞");
	}

	@Override
	public void run() {
		System.out.println(this.name+"会跑");
	}

	@Override
	public void swim() {
		System.out.println(this.name+"会游泳");
	}
}
