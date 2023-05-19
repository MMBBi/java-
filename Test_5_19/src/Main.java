import java.util.ArrayList;
import java.util.List;

/**
 * @author: 99655
 * @date: 2023/5/19 21:00
 * @description:
 */
public class Main {

	public static void main(String[] args) {

		MyArrayList myArrayList = new MyArrayList();
		myArrayList.add(1);
		myArrayList.add(2);
		myArrayList.add(3);
		myArrayList.add(4);
		myArrayList.add(5);

		myArrayList.display();
		System.out.println( );

		myArrayList.add(1,4);
		myArrayList.display();
		System.out.println();

		int get = myArrayList.get(1);
		System.out.println(get);

		myArrayList.remove(4);
		myArrayList.display();

		/*int size = myArrayList.size();
		System.out.println(size);*/


	}

}
