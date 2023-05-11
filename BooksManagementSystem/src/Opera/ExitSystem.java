package Opera;

import Book.BookList;

/**
 * @author: 99655
 * @date: 2023/5/10 23:09
 * @description: 退出系统
 */
public class ExitSystem implements IOperation{
	@Override
	public void work(BookList bookList) {
		System.out.println("退出系统");
		System.exit(0);
	}
}
