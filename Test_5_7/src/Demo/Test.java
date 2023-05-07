package Demo;

/**
 * @author: 99655
 * @date: 2023/5/7 22:04
 * @description:
 */
public class Test {
	public static void main(String[] args) {
		Pc computer = new Pc();
		//打开电脑
		computer.powerOn();
		System.out.println("=========================");

		//使用鼠标
		computer.useDevice(new Mouse());
		System.out.println("=========================");

		//使用键盘
		computer.useDevice(new keyBoard());
		System.out.println("=========================");

		//关闭电脑
		computer.powerOff();
	}
}
