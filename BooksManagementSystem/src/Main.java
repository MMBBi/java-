import User.AdminUser;
import User.NormalUser;
import User.User;

import java.util.Scanner;

/**
 * @author: 99655
 * @date: 2023/5/10 23:20
 * @description: 图书管理系统main
 */
public class Main {
	public static User login() {
		System.out.println("欢迎来到坤坤图书馆 图书管理系统");
		System.out.println("请输入你的姓名");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();

		System.out.println("请输入你的身份");
		System.out.println(" 1 > 管理员  0 > 普通用户");
		int choice = scanner.nextInt();

		if (choice == 1) {
			return new AdminUser(name);
		} else {
			return new NormalUser(name);
		}
	}
	public static void main(String[] args) {
		User user = login();
		int choice = user.menu();
	}
}

