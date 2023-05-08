package Demo4;

/**
 * @author: 99655
 * @date: 2023/5/8 22:28
 * @description:
 */
public class Student implements  Cloneable{
	public String name;
	public Money money = new Money();

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				'}';
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Student student = (Student) super.clone();
		student.money = (Money) this.money.clone();
		return student;
	}

}

