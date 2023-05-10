package User;

import java.util.Scanner;

/**
 * @author: 99655
 * @date: 2023/5/10 22:55
 * @description: 管理员用户
 */
public class AdminUser extends User {

	public AdminUser(String name) {
		super(name);
	}

	@Override
	public int menu() {
		System.out.println("=================================");
		System.out.println("欢迎你 "+name+" 当前权限： 管理员");
		System.out.println("1.查找图书");
		System.out.println("2.新增图书");
		System.out.println("3.删除图书");
		System.out.println("4.显示图书");
		System.out.println("5.退出系统");
		System.out.println("=================================");
		System.out.println("请输入你的操作：");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		return choice;
	}
}
