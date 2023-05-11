package User;

import Opera.*;

import java.util.Scanner;

/**
 * @author: 99655
 * @date: 2023/5/10 22:55
 * @description: 管理员用户
 */
public class AdminUser extends User {

	public AdminUser(String name) {
		super(name);
		this.iOperations = new IOperation[] {
				new ExitSystem(),
				new FindOperation(),
				new AddOperation(),
				new DelOperation(),
				new ShowOperation()
		};
	}

	@Override
	public int menu() {
		System.out.println("=================================");
		System.out.println("欢迎你 "+name+" 当前权限： 管理员");
		System.out.println("1.查找图书");
		System.out.println("2.新增图书");
		System.out.println("3.删除图书");
		System.out.println("4.显示书库");
		System.out.println("0.退出系统");
		System.out.println("=================================");
		System.out.println("请输入你的操作：");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		//判断输入的正确性
		while (true) {
			if(choice > 4) {
				System.out.println("选择错误，重新选择");
				choice = scanner.nextInt();
			} else {
				break;
			}
		}
		return choice;
	}
}
