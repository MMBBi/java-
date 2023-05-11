package Opera;

import Book.Book;
import Book.BookList;

import java.util.Scanner;

/**
 * @author: 99655
 * @date: 2023/5/10 23:01
 * @description: 增加图书
 */
public class AddOperation implements IOperation{

	@Override
	public void work(BookList bookList) {
		//以此输入书名，作者等书的元素
		System.out.println("增加图书");
		Scanner scanner = new Scanner(System.in);

		System.out.println("请输入书名");
		String name = scanner.nextLine();

		System.out.println("请输入作者名");
		String author = scanner.nextLine();

		System.out.println("请输入出版者名称");
		String press = scanner.nextLine();

		System.out.println("请输入书的价格");
		double prince = scanner.nextInt();

		Book book = new Book(name, author, press, prince);

		//判断书架中有没有这本书，如果有过了则无法放入，通过遍历实现。
		int currentSize = bookList.getUsedSize();
		for (int i = 0; i < currentSize; i++) {
			Book tmp = bookList.getBook(i);
			if (tmp.getName().equals(name)) {
				System.out.println("书库中已存在本书");
				return;
			}
		}

		//通过set方法，把书放入BookList
		bookList.setBook(book);
		System.out.println("增加成功");

		//修改usedSize,保证下次新增图书的位置在数组最后一个。
		bookList.setUsedSize(currentSize+1);
	}
}
