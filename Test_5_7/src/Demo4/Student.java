package Demo4;

import java.util.Objects;

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

/*	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Student)) {
			return false;
		}

		Student student = (Student) obj;
		return this.name.equals(student.name);
	}*/

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Student student = (Student) o;
		return Objects.equals(name, student.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
}

