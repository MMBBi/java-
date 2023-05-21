package Demo;

import java.util.ArrayList;
import java.util.List;

//

/**
 * @author: 99655
 * @date: 2023/5/21 23:48
 * @description: 简单的洗牌算法
 */
public class Test {
	public static void main(String[] args) {
		Game game = new Game();

		//新牌
		List<Poker> pokers = game.buyPoker();
		//System.out.println(pokers);

		//洗牌
		game.shuffle(pokers);
		//System.out.println(pokers);

		//抽牌
		List<List<Poker>> hand = new ArrayList<>();

		List<Poker> hand1 = new ArrayList<>();
		List<Poker> hand2 = new ArrayList<>();
		List<Poker> hand3 = new ArrayList<>();

		hand.add(hand1);
		hand.add(hand2);
		hand.add(hand3);

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				hand.get(j).add(pokers.remove(0));
			}
		}

		System.out.println("玩家1的牌：");
		System.out.println(hand1);

		System.out.println("玩家2的牌：");
		System.out.println(hand2);

		System.out.println("玩家3的牌：");
		System.out.println(hand3);

	}
}
