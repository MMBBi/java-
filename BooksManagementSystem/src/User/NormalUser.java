package User;

import Opera.*;

import java.util.Scanner;

/**
 * @author: 99655
 * @date: 2023/5/10 22:57
 * @description: 普通用户
 */
public class NormalUser extends User {
	public NormalUser(String name) {
		super(name);
		this.iOperations = new IOperation[] {
				new ExitSystem(),
				new FindOperation(),
				new BorrowOperation(),
				new ReturnOperation(),
		};
	}

	@Override
	public int menu() {
		System.out.println("=================================");
		System.out.println("欢迎你 "+name+" 当前权限： 普通用户");
		System.out.println("1.查找图书");
		System.out.println("2.借阅图书");
		System.out.println("3.归还图书");
		System.out.println("0.退出系统");
		System.out.println("=================================");
		System.out.println("请输入你的操作：");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		while (true) {
			if(choice > 3) {
				System.out.println("选择错误，重新选择");
				choice = scanner.nextInt();
			} else {
				break;
			}
		}
		return choice;
	}
}
