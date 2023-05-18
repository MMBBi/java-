/**
 * @author: 99655
 * @date: 2023/5/19 0:17
 * @description:
 */
public class Test<T> {
	public  T[] array = (T[])new Object[10];

	public T getPos(int pos) {
		return this.array[pos];
	}

	public void setArray(int pos,T val) {
		this.array[pos] = val;
	}

	public T[] getArray() {
		return array;
	}
}
