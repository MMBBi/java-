package Opera;

import Book.BookList;

/**
 * @author: 99655
 * @date: 2023/5/10 23:11
 * @description: 借阅图书
 */
public class BorrowOperation implements IOperation{
	@Override
	public void work(BookList bookList) {
		System.out.println("借阅图书");
	}
}
