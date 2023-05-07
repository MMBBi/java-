package Demo;

/**
 * @author: 99655
 * @date: 2023/5/7 22:33
 * @description:
 */
public class Pc{
	public void powerOn() {
		System.out.println("打开电脑");
	}

	public void powerOff() {
		System.out.println("关闭电脑");
	}

	public void useDevice(IUsb usb) {
		usb.openDevice();
		if (usb instanceof Mouse) {
			Mouse mouse = (Mouse)usb;
			mouse.click();
		} else if (usb instanceof keyBoard) {
			keyBoard keyBoard = (keyBoard)usb;
			keyBoard.inPut();
		}
		usb.closeDevice();
	}
}
