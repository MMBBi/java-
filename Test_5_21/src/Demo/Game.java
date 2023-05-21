package Demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author: 99655
 * @date: 2023/5/22 0:35
 * @description:
 */
public class Game {
	private static final String[] SUITS = {"♥","♦","♠","♣"};

	//一副新牌，去大小王
	public  List<Poker> buyPoker() {
		List<Poker> pokers = new ArrayList<>(52);
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j <= 13; j++) {
				Poker poker = new Poker();
				poker.setSuit(SUITS[i]);
				poker.setRank(j);
				pokers.add(poker);
			}
		}
		return pokers;
	}

	private void swap(List<Poker> pokers, int i , int j) {
		Poker tmp = pokers.get(i);
		pokers.set(i,pokers.get(j));
		pokers.set(j, tmp);
	}

	public void shuffle(List<Poker> poker) {
		Random random = new Random();
		for (int i = poker.size()-1; i > 0 ; i--) {
			int ret = random.nextInt(i);
			swap(poker, i, ret);
		}
	}

}
