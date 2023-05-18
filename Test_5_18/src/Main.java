import java.util.Arrays;

/**
 * @author: 99655
 * @date: 2023/5/18 23:10
 * @description:
 */
public class Main {

	public static void main(String[] args) {

		Integer[] array = {2,5,1,6,7,8,4};

		Integer max = Test3.findMax(array);
		System.out.println(max);
	}

	public static void main5(String[] args) {
		Test3 test = new Test3();
		Integer[] array = {2,5,1,6,7,8,4};

		int max = test.<Integer>findMax(array);
		System.out.println(max);
	}

	public static void main4(String[] args) {
		Test2<Integer> test = new Test2<>();
		Test2<String> test2 = new Test2<>();

		Integer[] array = {2,5,1,6,7,8,4};
		String[] array2 = {"c","e","b","a","d"};

		Integer max = test.findMax(array);
		System.out.println(max);

		String max2 = test2.findMax(array2);
		System.out.println(max2);

	}

	public static void main3(String[] args) {
		Test<String> test = new Test<>();
		test.setArray(0,"hello");
		test.setArray(1,"world");

		//String[] ret = test.getArray(); /error

	}
	public static void main2(String[] args) {
		Test<Integer> test = new Test();
		test.setArray(0,10);
		test.setArray(1,111);
		//String ret = (String) test.getPos(1);
		Integer ret = test.getPos(1);
		//test.setArray(3,"hello");
		System.out.println(ret);

	}
	public static void main1(String[] args) {
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
