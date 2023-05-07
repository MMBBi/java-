package Demo;

/**
 * @author: 99655
 * @date: 2023/5/7 22:18
 * @description:
 */
public class Mouse implements IUsb{

	@Override
	public void openDevice() {
		System.out.println("打开鼠标");
	}

	@Override
	public void closeDevice() {
		System.out.println("关闭鼠标");
	}

	public void click() {
		System.out.println("点击鼠标");
	}
}
