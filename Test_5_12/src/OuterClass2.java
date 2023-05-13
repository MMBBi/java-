/**
 * @author: 99655
 * @date: 2023/5/13 0:06
 * @description:
 */
public class OuterClass2 {
	public int date1 = 1;
	private int date2 = 2;
	public static int date3 = 3;

	class InnerClass2 {
		public int date1 =11111;
		public int date4 = 4;
		private int date5 = 5;
		public static final int date6 = 6;

		public void func() {
			System.out.println(date1);

			System.out.println(OuterClass2.this.date1);

			System.out.println(date2);
			System.out.println(date3);
			System.out.println(date4);
			System.out.println(date5);
			System.out.println(date6);

		}
	}

	public void func2() {
		InnerClass2 innerClass2 = new InnerClass2();
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);
		System.out.println(innerClass2.date4);
		System.out.println(innerClass2.date5);
		System.out.println(InnerClass2.date6);
	}
}
