package LinkedList;

public class ReturnNodeFromLinkedList {

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

		// Add Node at start
		public void addNodeAtEnd(int value) {
			Node node = new Node(value);
			if (size() == 0) {
				this.head = node;
				this.tail = node;
				this.size++;
			} else {
				this.tail.next = node;
				this.tail = node;
				// tail.next= null;
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

		// Get Value from Start
		public int getValueFromStart() {
			if (size() == 0) {
				return 0;
			} else {
				return this.head.value;
			}
		}

		// Get Value from End
		public int getValueFromEnd() {
			if (size() == 0) {
				return 0;
			} else {
				return this.tail.value;
			}
		}

		// Get value based on index
		public int getValueBasedOnIndex(int index) {
			if (size() == 0) {
				return 0;
			}

			if (size() == 1) {
				return getValueFromStart();
			}

			if (size() == index) {
				return getValueFromEnd();
			}

			else {
				int idx = 0;
				// Node previous = null;
				Node current = this.head;
				while (idx != index) {
					// previous = current;
					current = current.next;
					idx++;

				}
				return current.value;
			}
		}

	}

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.addNodeAtEnd(10);
		linkedList.addNodeAtEnd(20);
		linkedList.addNodeAtEnd(30);
		linkedList.display();
		System.out.println();
		System.out.println(linkedList.getValueFromStart());
		System.out.println(linkedList.getValueFromEnd());
		System.out.println(linkedList.getValueBasedOnIndex(1));

	}

}
