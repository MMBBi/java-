package Opera;

import Book.Book;
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
		//遍历BookList类中的books数组即可
		int currentSize = bookList.getUsedSize();//将bookList有几本书获取过来

		//通过for循环遍历。
		for (int i = 0; i < currentSize; i++) {
			Book book = bookList.getBook(i);
			System.out.println(book);
		}
	}
}
