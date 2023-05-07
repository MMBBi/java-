package Demo2;

/**
 * @author: 99655
 * @date: 2023/5/7 23:26
 * @description: 有了接口之后,类的使用者就不必关注具体类型,而只关注某个类是否具备某种能力
 * 比如鸡会打篮球。
 */
public class Cock implements IPlayBasketball {

	//只要
	public String name;

	public Cock(String name) {
		this.name = name;
	}

	@Override
	public void playBasketball() {
		System.out.println(this.name+" 在打篮球");
	}

}
