package Opera;

import Book.BookList;

/**
 * @author: 99655
 * @date: 2023/5/10 23:05
 * @description: 删除图书
 */
public class DelOperation implements IOperation{
	@Override
	public void work(BookList bookList) {
		System.out.println("删除图书");
	}
}
