package Login;

/**
 * @author: 99655
 * @date: 2023/5/15 23:17
 * @description:
 */
public class Login {
	private final String userName = "admin";
	private final String passName = "123456";

	public void loginInfo(String userName, String passName) throws UserNameException, PasswordException {
		if (!this.userName.equals(userName)) {
			throw new UserNameException("用户名错了！");
		}
		if (!this.passName.equals(passName)) {
			throw new PasswordException("密码错了！");
		}
		System.out.println("登录成功");
	}

}


/*	public  void login(String userName, String passName) {
		try {
			loginInfo(userName, passName);
		} catch (UserNameException e) {
			e.printStackTrace();
		} catch (PasswordException e) {
			e.printStackTrace();
		}
	}*/

