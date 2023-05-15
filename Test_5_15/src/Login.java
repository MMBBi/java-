/**
 * @author: 99655
 * @date: 2023/5/15 22:32
 * @description:
 */
public class Login {

	private final String userName = "admin";
	private final String passName = "123456";

	public  void loginInfo(String userName, String passName) throws UserNameException, PasswordException {
		if (!this.userName.equals(userName)) {
			throw new UserNameException("你用户名错了！");
		}

		if (!this.passName.equals(passName)) {
			throw  new PasswordException("你密码错了！");
		}

		System.out.println("登录成功");
	}
}

class UserNameException extends Exception {
	public UserNameException(String message) {
		super(message);
	}
}
class PasswordException extends Exception {
	public PasswordException(String message) {
		super(message);
	}

	public static void main(String[] args) {
		Login login = new Login();
		try {
			login.loginInfo("admin","12345");
		} catch (UserNameException e) {
			e.printStackTrace();
		} catch (PasswordException e) {
			e.printStackTrace();
		}
	}
}
