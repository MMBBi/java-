import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: 99655
 * @date: 2023/5/16 20:26
 * @description:
 */
public class Main {

	public static void main(String[] args) {
		int[][]  arr = {{11,33,55},{22,44,66,88},{131,214,315,146},{928,827,726,625},{424,525}};
		int sum=add(arr);
		System.out.println(sum);
	}

	public static int add(int[][] arr) {
		int sum=0;

		//write your code here......
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}

		return sum;
	}

	public static void main11(String[] args) {
		int[] arr = new int[6];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println(Arrays.toString(arr));

		//write your code here......
		int left = 0;
		int right = arr.length - 1;
		while (left < right) {
			int tmp = arr[left];
			arr[left] = arr[right];
			arr[right] = tmp;
			left++;
			right--;
		}

		System.out.println(Arrays.toString(arr));
	}
	public static void main10(String[] args) {
		int[] ary = new int[6];
		int max = ary[0];
		int min= ary[0];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i <ary.length ; i++) {
			ary[i]=scanner.nextInt();
		}

		//write your code here......

		min = ary[0];
		for (int i = 0; i < ary.length; i++) {
			max = Math.max(ary[i],max);
			min = Math.min(ary[i],min);
		}
		System.out.println(max+" "+min);
	}
	public static void main9(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();

		//write code here......
		int count = 0;
		if (num < 0) {
			System.out.println(num);
			return;
		}
		while (num > 0) {
			count++;
			num /= 10;
		}
		System.out.println(count);
	}


	public static void main8(String[] args) {

		Scanner scan = new Scanner(System.in);
		//write your code here......
		int count = 0;
		double avg = 0;
		double sum = 0;
		while(scan.hasNextInt()) {
			int num = scan.nextInt();
			if (num < 0) {
				break;
			}
			sum += num;
			count++;
		}
		System.out.println(String.format("%.2f",sum/count));
		//输出格式为：System.out.println(String.format("%.2f",avg));

	}
	public static void main7(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float h=scanner.nextFloat();
		int n =scanner.nextInt();

		//write your code here......
		double sum = 0; //一共多少米
		for (int i = 0; i < n; i++) {
			sum += h;
			h /= 2;
			if (i == n -1) {
				System.out.println(String.format("%.3f", h)+" "+String.format("%.3f", sum));
			}
			sum += h;
		}
		//输出格式为：System.out.println(String.format("%.3f", h)+" "+String.format("%.3f", sum));
	}

	public static void main6(String[] args) {
		Scanner console = new Scanner(System.in);
		int m = console.nextInt();
		int n = console.nextInt();
		int result = getCM(m, n);
		System.out.println(result);
	}

	public static int getCM(int m, int n){

		//write your code here......
		int max = Math.max(m, n);
		for (int i = max; i <= m*n; i++){
			if (i % m == 0 && i % n == 0) {
				return i;
			}
		}
		return -1;
	}
	public static void main5(String[] args) {
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		while ( 0 < scanner.nextInt()) {
			count++;
		}
		System.out.println(count);
	}
	public static void main4(String[] args) {

		//write your code here........
		long sum = 0;
		long base = 9;
		for(int i = 0; i < 10 ; i++) {
			sum += base;
			base = base*10 + 9;
		}
		System.out.println(sum);
	}

	public static void main3(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		String emailMatcher="[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+";

		//正则表达式
		System.out.println(str.matches(emailMatcher)?"邮箱格式合法":"邮箱格式不合法");

	}
	public static void main2(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String grade =scanner.next();

		//write your code here......
		switch (grade) {
			case "A":
				System.out.println("优秀");
				break;
			case "B":
				System.out.println("良好");
				break;
			case "C":
				System.out.println("及格");
				break;
			case "D":
				System.out.println("不及格");
				break;
			default:
				System.out.println("未知等级");
				break;
		}
	}
	public static void main1(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double height = scanner.nextDouble();
		double weight = scanner.nextDouble();

		//write your code here......
		double bmi = weight / (height * height);
		if(bmi < 18.5) {
			System.out.println("偏瘦");
		}else if(bmi >= 18.5 && bmi < 20.9) {
			System.out.println("苗条");
		}else if(bmi >= 20.9 && bmi < 24.9) {
			System.out.println("适中");
		}else if(bmi >= 24.9 ) {
			System.out.println("偏胖");
		}
	}
}
