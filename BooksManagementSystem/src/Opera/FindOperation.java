package Opera;

import Book.Book;
import Book.BookList;

import java.util.Scanner;

/**
 * @author: 99655
 * @date: 2023/5/10 23:04
 * @description: 查找图书
 */
public class FindOperation implements IOperation{
	@Override
	public void work(BookList bookList) {
		System.out.println("查找图书");
		System.out.println("输入要查找的图书名字");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();

		int currentSize = bookList.getUsedSize();
		for (int i = 0; i < currentSize; i++) {
			Book book = bookList.getBook(i);
			if (book.getName().equals(name)) {
				System.out.println(book);
				return;
			}
		}
		System.out.println("书库中目前没有这本书");
	}
}
