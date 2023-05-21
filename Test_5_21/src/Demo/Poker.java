package Demo;

/**
 * @author: 99655
 * @date: 2023/5/22 0:34
 * @description:
 */
public class Poker {
	private String suit;
	private int rank;

	@Override
	public String toString() {
		return "{" + suit + rank + "}";
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
}
