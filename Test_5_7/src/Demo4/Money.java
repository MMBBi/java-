package Demo4;

/**
 * @author: 99655
 * @date: 2023/5/8 23:25
 * @description:
 */
public class Money implements Cloneable{
	public double money = 12.5;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
