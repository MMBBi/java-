package Opera;

import Book.Book;
import Book.BookList;

import java.util.Scanner;

/**
 * @author: 99655
 * @date: 2023/5/10 23:12
 * @description: 归还图书
 */
public class ReturnOperation implements IOperation {
	@Override
	public void work(BookList bookList) {
		System.out.println("归还图书");
		System.out.println("请输入你要归还的图书");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();

		int currentSize = bookList.getUsedSize();
		for (int i = 0; i < currentSize; i++) {
			Book book = bookList.getBook(i);
			if (book.getName().equals(name) && book.isBorrowed()) {
				book.setBorrowed(false);
				System.out.println("归还成功");
				return;
			} else {
				System.out.println("借阅失败，可能是书名输入错误，或书未被借出");
				return;
			}
		}
	}
}
