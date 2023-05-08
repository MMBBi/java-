package Demo3;

/**
 * @author: 99655
 * @date: 2023/5/8 0:08
 * @description:
 */
public class Student implements Comparable<Student> {
	public String name;
	public int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}

	//按照年龄比较
	//@Override
	/*public int compareTo(Object o) {
		Student student = (Student) o;
		if (this.age > student.age) {
			return 1;
		} else if (this.age < student.age) {
			return -1;
		} else {
			return 0;
		}
	}*/

	//按照姓名比较



	@Override
	public int compareTo(Student o) {
		Student student = (Student) o;
		if (this.name.compareTo(((Student) o).name) > 0) {
			return 1;
		} else if (this.name.compareTo(((Student) o).name) < 0){
			return -1;
		} else {
			return 0;
		}
	}
}
