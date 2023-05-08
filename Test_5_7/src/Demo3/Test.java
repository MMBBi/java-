package Demo3;

import java.util.Arrays;

/**
 * @author: 99655
 * @date: 2023/5/8 0:08
 * @description:
 */
public class Test {
	public static void main(String[] args) {
		Student[] students = new Student[3];
		students[0] = new Student("张三", 20);
		students[1] = new Student("李四", 19);
		students[2] = new Student("王五", 21);
		Arrays.sort(students);
		System.out.println(Arrays.toString(students));

		sort(students);
		System.out.println(Arrays.toString(students));
	}

	public static void sort(Comparable[] array) {
		for (int i = 0; i < array.length-1; i++) {
			for (int j = 0; j < array.length-1-i; j++){
				if (array[j].compareTo(array[j+1]) > 0) {
					Comparable tmp = array[j+1];
					array[j+1] = array[j];
					array[j] = tmp;
				}
			}
		}
	}
}