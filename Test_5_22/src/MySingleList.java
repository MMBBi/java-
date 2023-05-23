/**
 * @author: 99655
 * @date: 2023/5/23 23:20
 * @description: 无头单项链表的模拟实现
 */
public class MySingleList {
	class Node {
		public int val;
		public Node next;

		public Node (int val) {
			this.val = val;
		}
	}

	public Node heda; //当期链表头

	public void createLink() {
		Node node1 = new Node(12);
		Node node2 = new Node(22);
		Node node3 = new Node(32);
		Node node4 = new Node(42);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;

		heda = node1;
	}


	public void disPlay() {
		Node cur = heda;
		while (cur != null) {
			System.out.print(cur.val+" ");
			cur = cur.next;
		}
		System.out.println();
	}
}
