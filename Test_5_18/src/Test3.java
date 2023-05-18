/**
 * @author: 99655
 * @date: 2023/5/19 20:35
 * @description:
 */
public class Test3 {
	public static <E extends Comparable<E>> E findMax(E[] array) {
		E max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (max.compareTo(array[i]) < 0) {
				max = array[i];
			}
		}
		return max;
	}
}
