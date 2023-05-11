package Book;

/**
 * @author: 99655
 * @date: 2023/5/10 22:41
 * @description: 书架
 */
public class BookList {
	private static final int DEFAULT_SIZE = 10;//预设书架可以放的书本数量
	private Book[] books = new Book[DEFAULT_SIZE];//存放书的数组。
	private int usedSize; //记录当前书架上有多少本书

	public BookList() {
		books[0] = new Book("三国演义","罗贯中","人民文学出版社",41);
		books[1] = new Book("西游记","吴承恩","人民文学出版社",38);
		books[2] = new Book("水浒传","施耐庵","人民文学出版社",33);
		this.usedSize = 3;
	}

	public Book getBook(int pos) {
		return this.books[pos];
	}

	public void setBook(Book book) {
		this.books[usedSize] = book;
	}

	public void setBooks(int pos,Book book) {
		this.books[pos] = book;
	}

	public int getUsedSize() {
		return usedSize;
	}

	public void setUsedSize(int usedSize) {
		this.usedSize = usedSize;
	}
}
