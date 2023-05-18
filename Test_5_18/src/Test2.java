/**
 * @author: 99655
 * @date: 2023/5/19 20:04
 * @description:
 */
public class Test2<E extends Comparable<E>> {
	public E findMax(E[] array) {
		E max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (max.compareTo(array[i]) < 0) {
				max = array[i];
			}
		}
		return max;
	}


}
