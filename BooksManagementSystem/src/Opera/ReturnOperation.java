package Opera;

import Book.BookList;

/**
 * @author: 99655
 * @date: 2023/5/10 23:12
 * @description: 归还图书
 */
public class ReturnOperation implements IOperation {
	@Override
	public void work(BookList bookList) {
		System.out.println("归还图书");
	}
}
