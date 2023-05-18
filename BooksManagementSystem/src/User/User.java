package User;

import Book.BookList;
import Opera.IOperation;
import com.sun.deploy.panel.IProperty;

/**
 * @author: 99655
 * @date: 2023/5/10 22:53
 * @description: 抽象类 用户
 */
public abstract class User {
	protected String name;//用户姓名
	protected IOperation[] iOperations;//操作接口数组，用于用户操作

	public User(String name) {
		this.name = name;
	}
	public abstract int menu();//菜单

	public void doWork(int choice, BookList bookList) {
		this.iOperations[choice].work(bookList);
	}
}
