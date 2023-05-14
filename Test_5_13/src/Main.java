import java.util.Arrays;

/**
 * @author: 99655
 * @date: 2023/5/13 18:45
 * @description:
 */
public class Main {

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("hello");
		String ret = str.toString();

		StringBuffer str2 = new StringBuffer(ret);
		System.out.println(ret);
		System.out.println(str2);
	}

	public static void main14(String[] args) {
		StringBuffer str = new StringBuffer("hello");
		StringBuffer str2 = str;
		str.append(" world");
		System.out.println(str);
		System.out.println(str2);
	}

	public static void main13(String[] args) {
		String str = "     hello world    " ;
		System.out.println("["+str+"]");
		System.out.println("["+str.trim()+"]");
	}
	public static void main12(String[] args) {
		//多次拆分
		String s1 = "name=zhangsan&age=18";
		String[] ret = s1.split("&");

		for (int i = 0; i < ret.length; i++) {
			String[] ret2 = ret[i].split("=");
			System.out.println(ret2[0]+"="+ret2[1]);
		}
	}

	public static void main11(String[] args) {
		String s1 = "192.168.0.1";
		String s2 = "192+168.0*1";


		String[] ret = s1.split("\\.");
		String[] ret2 = s2.split("\\+|\\.|\\*");

		for (String x : ret) {
			System.out.println(x);
		}
		System.out.println("================");
		for (String x : ret2) {
			System.out.println(x);
		}
		System.out.println("================");

	}

	public static void main10(String[] args) {
		String s = "hello world hello World";


		String[] s1 = s.split(" ");
		String[] s4 = s.split(" ", 2);

		for (int i = 0; i < s1.length; i++) {
			System.out.println(i);
		}

		System.out.println("=====================");

		for (String s2 : s4) {
			System.out.println(s2);
		}
	}

	public static void main9(String[] args) {
		//字符替换
		String str = "helloWorld";

		//替换所有指定的内容 replaceAll
		String str1 = str.replaceAll("l", "_");

		//替换首个指定的字符 replaceFirst
		String str2 = str.replaceFirst("l","_");

		System.out.println(str1);
		System.out.println(str2);
	}

	public static void main8(String[] args) {
		//字符串转数组
		String s = "hello";

		char[] ch = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			System.out.println(ch[i]);
		}

		//数组转字符串
		String s2 = new String(ch);
		System.out.println(s2);
	}
	public static void main7(String[] args) {
		String s1 = "hello";
		String s2 = "HELLO";

		//小写转大写
		System.out.println(s1.toUpperCase());
		//大写转小写
		System.out.println(s2.toLowerCase());
	}


	public static void main6(String[] args) {
		//字符串转数字
		int date1 = Integer.parseInt("1234");
		double date2 = Double.parseDouble("12.34");
		System.out.println(date1);
		System.out.println(date2);

	}
	public static void main5(String[] args) {
		//数字转字符串
		String s1 = String.valueOf(1234);
		String s2 = String.valueOf(12.34);
		String s3 = String.valueOf(true);
		String s4 = String.valueOf(new Test("xiaoheizi",19));

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}


	public static void main4(String[] args) {
		String ch  = "abcabdcefd";

		System.out.println(ch.indexOf('c'));
		System.out.println(ch.indexOf('c', 4));
	}

	public static void main3(String[] args) {
		String s1 = new String("hello");
		String s2 = "hello";
		String s3 = "Hello";
		String s4 = "abcd";

		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s4.compareTo(s1));
		System.out.println(s4.compareToIgnoreCase(s3));
	}

	public static void main2(String[] args) {
		String s1 = "hello";
		String s2 = "world";
		String s3 = "";

		System.out.println(s1.length());
		System.out.println("hello".length());
		System.out.println(s3.isEmpty());
	}

	public static void main1(String[] args) {
		String str1 = "hello";
		String str2 = new String("hello");

		char[] array = {'h','e','l','l','o'};
		String str3 = new String(array);

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
}
