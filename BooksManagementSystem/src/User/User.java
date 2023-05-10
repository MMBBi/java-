package User;

/**
 * @author: 99655
 * @date: 2023/5/10 22:53
 * @description: 抽象类 用户
 */
public abstract class User {
	protected String name;//用户姓名

	public User(String name) {
		this.name = name;
	}

	public abstract int menu();//菜单
}
