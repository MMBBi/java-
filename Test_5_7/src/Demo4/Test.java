package Demo4;

/**
 * @author: 99655
 * @date: 2023/5/8 22:28
 * @description:
 */
public class Test {
	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1 = new Student();
		s1.name = "kunKun";
		Student s2 = (Student) s1.clone();
		System.out.println(s1.money.money);
		System.out.println(s2.money.money);
		System.out.println("==============================");
		//浅拷贝
		s2.money.money = 99;
		System.out.println(s1.money.money);
		System.out.println(s2.money.money);


	}
}
