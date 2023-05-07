package Demo;

/**
 * @author: 99655
 * @date: 2023/5/7 22:31
 * @description:
 */
public class keyBoard implements IUsb{
	@Override
	public void openDevice() {
		System.out.println("打开键盘");
	}

	@Override
	public void closeDevice() {
		System.out.println("关闭键盘");
	}

	public void inPut() {
		System.out.println("键盘输入");
	}
}
