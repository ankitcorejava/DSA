package LinkedList;

public class SegregateEvenOdd {

	private static class Node {
		private int value;
		private Node next;

		public Node(int value) {
			this.value = value;
			this.next = null;
		}

		public Node() {
			this.value = 0;
			this.next = null;
		}

	}

	private static class LinkedList {
		private Node head;
		private Node tail;
		private int size;

		public LinkedList() {
			this.head = null;
			this.tail = null;
			this.size = 0;
		}

		// Get Size
		public int size() {
			return this.size;
		}

		// Add Node at start
		public void addNodeAtStart(int value) {
			Node node = new Node(value);
			if (size() == 0) {
				this.head = node;
				this.tail = node;
				this.size++;
			} else {
				node.next = this.head;
				this.head = node;
				this.size++;
			}
		}

		// Display

		public void display() {
			Node current = this.head;
			while (current != null) {
				System.out.print("-> " + current.value);
				current = current.next;
			}
		}

		public Node segregateEvenOdd() {

			// Dummy Nodes
			Node odd = new Node(1);
			Node even = new Node(2);

			// Reference of dummy Nodes:
			Node oddHead = odd;
			Node evenHead = even;
			Node oddTail = odd;
			Node evenTail = even;
			Node current = this.head;
			while (current != null) {
				if (current.value % 2 != 0) {
					oddTail.next = current;
					oddTail = current;
				} else {
					evenTail.next = current;
					evenTail = current;
				}
				current = current.next;
			}
			oddTail.next = null;
			evenTail.next = null;
			evenHead = evenHead.next;
			evenTail.next = oddHead.next;
			this.head = evenHead;

			return this.head;

		}
	}

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.addNodeAtStart(4);
		linkedList.addNodeAtStart(3);
		linkedList.addNodeAtStart(5);
		linkedList.addNodeAtStart(7);
		linkedList.addNodeAtStart(8);
		linkedList.addNodeAtStart(1);
		linkedList.addNodeAtStart(9);
		System.out.println("============Input============");
		linkedList.display();
		System.out.println();
		System.out.println("============Segregate Even Odd============");
		linkedList.segregateEvenOdd();
		linkedList.display();

	}

}
