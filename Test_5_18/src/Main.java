/**
 * @author: 99655
 * @date: 2023/5/18 23:10
 * @description:
 */
public class Main {
	public static void main(String[] args) {
		//装箱
		int a = 100;
		Integer aa = a;
		Integer ab = Integer.valueOf(a);
		Integer ac = new Integer(a);
		System.out.println(aa);
		System.out.println(ab);
		System.out.println(ac);

		//拆箱
		int b  = aa;
		System.out.println(b);

	}
}
