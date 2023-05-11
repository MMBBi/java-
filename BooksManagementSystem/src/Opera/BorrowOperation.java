package Opera;

import Book.Book;
import Book.BookList;

import java.util.Scanner;

/**
 * @author: 99655
 * @date: 2023/5/10 23:11
 * @description: 借阅图书
 */
public class BorrowOperation implements IOperation{
	@Override
	public void work(BookList bookList) {
		System.out.println("借阅图书");
		System.out.println("请输入你要借阅的图书");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();

		int currentSize = bookList.getUsedSize();
		for (int i = 0; i < currentSize; i++) {
			Book book = bookList.getBook(i);
			if (book.getName().equals(name) && !book.isBorrowed()) {
				book.setBorrowed(true);
				System.out.println("借阅成功");
				return;
			} else {
				System.out.println("借阅失败，可能是书名输入错误，或书以借出");
				return;
			}
		}
	}
}
