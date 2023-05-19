import java.util.Arrays;
import java.util.List;

/**
 * @author: 99655
 * @date: 2023/5/19 21:01
 * @description:
 */
public class MyArrayList {
	public int[] elem;
	public int userSize;

	public static final int DEFAULT_SIZE = 5;

	private void checkIndex(int pos) {
		if (pos < 0 || pos > this.userSize) {
			//不合法抛异常
			throw new IndexException("新增元素位置不合法");
		}
	}
	private void checkGetIndex(int pos) {
		if (pos < 0 || pos >= this.userSize) {
			//不合法抛异常
			throw new IndexException("获取元素位置不合法");
		}
	}

	/**
	 * 扩容
	 */
	private void resize() {
		this.elem = Arrays.copyOf(this.elem,
				2*this.elem.length);
	}

	/**
	 * 顺序表有没有满
	 * @return true表示满了，false表示未满
	 */
	public boolean isFull() {
		return this.userSize == this.elem.length;
	}

	public MyArrayList() {
		this.elem = new int[DEFAULT_SIZE];

	}

	// 新增元素,默认在数组最后新增
	public void add(int data) {
		//判断/扩容
		if (isFull()) {
			resize();
		}
		//新增
		this.elem[this.userSize] = data;
		this.userSize++;
	}
	// 在 pos 位置新增元素
	public void add(int pos, int data) {

		//先判断合法性
		try {
			this.checkIndex(pos);
		}catch (IndexException e) {
			e.printStackTrace();
		}

		//再判断有没有满
		if (isFull()) {
			resize();
		}
		for (int i = this.userSize-1; i >= pos; i--) {
			this.elem[i+1] = this.elem[i];
		}
		this.elem[pos] = data;
		this.userSize++;
	}


	// 判定是否包含某个元素
	public boolean contains(int toFind) {
		for (int i = 0; i < this.userSize; i++) {
			if (this.elem[i] == toFind) {
				return true;
			}
		}
		return false;
	}

	// 查找某个元素对应的位置
	public int indexOf(int toFind) {
		for (int i = 0; i < this.userSize; i++) {
			if (this.elem[i] == toFind) {
				return i;
			}
		}
		return -1;
	}


	// 获取 pos 位置的元素
	public int get(int pos) {
		checkGetIndex(pos);
		return this.elem[pos];
	}

	// 给 pos 位置的元素设为 value
	public void set(int pos, int value) {
		checkIndex(pos);
		this.elem[pos] = value;
	}
	/*public void checkSetIndex(int pos) {
		if (pos < 0 || pos > )
	}*/


	//删除第一次出现的关键字key
	public void remove(int toRemove) {
		int index = this.indexOf(toRemove);
		if (index == -1) {
			System.out.println("没有这个数据");
			return;
		}
		for (int i = index; i < this.userSize-1 ; i++) {
			this.elem[i] = this.elem[i+1];
		}
		this.userSize--;
		this.elem[this.userSize] = 0;
	}

	// 获取顺序表长度
	public int size() {
		return this.userSize;
	}
	// 清空顺序表
	public void clear() {
		this.userSize = 0;
	}

	// 打印顺序表，注意：该方法并不是顺序表中的方法，为了方便看测试结果给出的
	public void display() {
		for (int i = 0; i < this.userSize; i++) {
			System.out.print(this.elem[i]+" ");
		}
	}

}
