package Opera;

import Book.BookList;

/**
 * @author: 99655
 * @date: 2023/5/10 23:01
 * @description: 增加图书
 */
public class AddOperation implements IOperation{

	@Override
	public void work(BookList bookList) {
		System.out.println("增加图书");
	}
}
