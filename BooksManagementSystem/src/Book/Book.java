package Book;

/**
 * @author: 99655
 * @date: 2023/5/10 22:33
 * @description: 书籍的基本信息
 */
public class Book {
	private String name;//书名
	private String author;//作者
	private String press;//出版社
	private double price;//价格
	private boolean isBorrowed;//是否被借出

	public Book(String name, String author, String press, double price) {
		this.name = name;
		this.author = author;
		this.press = press;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPress() {
		return press;
	}

	public void setPress(String press) {
		this.press = press;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isBorrowed() {
		return isBorrowed;
	}

	public void setBorrowed(boolean borrowed) {
		isBorrowed = borrowed;
	}

	@Override
	public String toString() {
		return "书名='" + name + '\'' +
				", 作者='" + author + '\'' +
				", 出版社='" + press + '\'' +
				", 价格=" + price +
				", 是否被借出=" + isBorrowed +
				'}';
	}
}
