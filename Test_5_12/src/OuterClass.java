/**
 * @author: 99655
 * @date: 2023/5/12 23:44
 * @description:
 */
public class OuterClass {
	public int date1 = 1;
	private int date2 = 2;
	public static int date3 = 3;

	 static class InnerClass {
		 public int date4 = 4;
		 private int date5 = 5;
		 public static int date6 = 6;

		 public void func() {
			 OuterClass outerClass = new OuterClass();
			 System.out.println(outerClass.date1);//静态内部类访问外部类成员，需要先实例化对象
			 System.out.println(outerClass.date2);
			 System.out.println(date3);
			 System.out.println(date4);
			 System.out.println(date5);
			 System.out.println(date6);
		 }
	 }

	public void func2() {
		 InnerClass innerClass = new InnerClass();
		 System.out.println(date1);//静态内部类访问外部类成员，需要先实例化对象
		 System.out.println(date2);
		 System.out.println(date3);
		 System.out.println(innerClass.date4);
		 System.out.println(innerClass.date5);//外部类可以直接访问内部类中的所有成员
		 System.out.println(InnerClass.date6);
	}
}


