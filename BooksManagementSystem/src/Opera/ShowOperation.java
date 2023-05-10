package Opera;

import Book.BookList;

/**
 * @author: 99655
 * @date: 2023/5/10 23:07
 * @description: 显示图书
 */
public class ShowOperation implements IOperation{
	@Override
	public void work(BookList bookList) {
		System.out.println("打印所有图书");
	}
}
