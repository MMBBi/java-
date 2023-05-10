package Opera;

import Book.BookList;

/**
 * @author: 99655
 * @date: 2023/5/10 23:04
 * @description: 查找图书
 */
public class FindOperation implements IOperation{
	@Override
	public void work(BookList bookList) {
		System.out.println("查找图书");
	}
}
