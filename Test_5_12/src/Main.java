/**
 * @author: 99655
 * @date: 2023/5/12 23:26
 * @description:
 */
public class Main {
	public static void main(String[] args) {
		new IA() {
			//匿名内部类
			@Override
			public void func() {
				System.out.println("hello~");
			}
		}.func();
	}


	public static void main2(String[] args) {
		//非静态内部类
		OuterClass2 outerClass2 = new OuterClass2();
		OuterClass2.InnerClass2 innerClass2 = outerClass2.new InnerClass2();
		innerClass2.func();
		System.out.println("===========================");
		outerClass2.func2();
	}
	public static void main1(String[] args) {
		//静态内部类
		OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
		innerClass.func();
		System.out.println("===========================");
		OuterClass outerClass = new OuterClass();
		outerClass.func2();
	}
}
