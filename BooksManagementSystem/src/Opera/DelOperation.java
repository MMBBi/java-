package Opera;

import Book.Book;
import Book.BookList;

import java.util.Scanner;

/**
 * @author: 99655
 * @date: 2023/5/10 23:05
 * @description: 删除图书
 */
public class DelOperation implements IOperation{
	@Override
	public void work(BookList bookList) {
		System.out.println("删除图书");
		Scanner scanner = new Scanner(System.in);
		//输入书名
		System.out.println("请输入你要删除的图书名字");
		String name = scanner.nextLine();

		//找书库中有没有这本书
		int currentSize = bookList.getUsedSize();

		int index = -1;//如果找到这本书，记录在数组中的下标，初始值为-1。
		for (int i = 0; i < currentSize; i++) {
			Book book = bookList.getBook(i);
			if (book.getName().equals(name)) {
				index = i;//如果找到了，将下标的位置付给index。
				break;
			}
		}

		//如果没有找到，则返回界面
		if (index == -1) {
			System.out.println("删除失败，书库中没有这本书");
			return;
		}

		//把后面的书往前覆盖，来实现删除功能
		for (int j = index; j < currentSize-1; j++) {
			Book book = bookList.getBook(j+1);
			bookList.setBooks(j, book);
		}

		//删除后修改书的数量
		bookList.setUsedSize(currentSize-1);

		//因为是通过一个个往前覆盖删除的，需要把最后一个置为null，防止内存泄露。
		bookList.setBooks(currentSize-1, null);
		System.out.println("删除成功");
	}
}
