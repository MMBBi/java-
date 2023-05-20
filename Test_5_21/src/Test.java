import java.util.ArrayList;
import java.util.List;

/**
 * @author: 99655
 * @date: 2023/5/21 23:11
 * @description:
 */
public class Test {
	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> ret = new ArrayList<>();

		List<Integer> row = new ArrayList<>();
		row.add(1);
		ret.add(row);


		for (int i = 1; i < numRows; i++) {
			List<Integer> prevRow = ret.get(i-1);
			List<Integer> curRow = new ArrayList<>();
			curRow.add(1); //开头的1
			for (int j = 1; j < i; j++) {
				int x = prevRow.get(j)+prevRow.get(j-1);
				curRow.add(x);
			}
			curRow.add(1);//最后的1
			ret.add(curRow);
		}
		return ret;
	}

	public static void main(String[] args) {
		System.out.println(generate(3));
	}
}
