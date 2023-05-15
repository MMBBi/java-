/**
 * @author: 99655
 * @date: 2023/5/15 18:36
 * @description:
 */
public class Main {
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

	public static void main3(String[] args) {

		int[] array = {1,2,3};

		try {
			int ret = gerElement1(array, 2);
		}catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("处理异常1");
		}catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("处理异常2");
		}finally {
			System.out.println("释放资源");
		}
	}

	public static int gerElement1(int[] array, int index) throws NullPointerException,ArrayIndexOutOfBoundsException {
		if (array == null) {
			throw new NullPointerException("传递的数组为null");
		}

		if (0 > index || array.length <= index) {
			throw new ArrayIndexOutOfBoundsException("传递的数组下标越界");
		}
		return array[index];
	}
	public static void main2(String[] args) {
		int[] array = {1,2,3};
		System.out.println(gerElement(array, 2));
	}

	public static int gerElement(int[] array, int index) {
		if (array == null) {
			throw new NullPointerException("传递的数组为null");
		}

		if (0 > index || array.length <= index) {
			throw new ArrayIndexOutOfBoundsException("传递的数组下标越界");
		}
		return array[index];
	}




	public static void main1(String[] args) {
		int[] array = null;
		Test1(array);
	}

	public static void Test1(int[] array) {
		if (array == null) {
			throw new NullPointerException();
		}
	}

}
