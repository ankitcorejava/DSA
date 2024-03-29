package LinkedList;

public class InsertNodeAtIndex {

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

		// Add Node at given index
		public void addNodeAtIndex(int index, int value) {
			if (index >= size() || index < 0) {
				System.out.println("Invalid Index");
				return;
			}

			Node node = new Node(value);
			if (size() == 0) {
				addNodeAtStart(value);
				return;
			} else {
				int idx = 0;
				Node previous = null;
				Node current = this.head;
				while (idx != index) {
					previous = current;
					current = current.next;
					idx++;
				}
				previous.next = node;
				node.next = current;
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
	}

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.addNodeAtStart(10);
		linkedList.addNodeAtStart(20);
		linkedList.addNodeAtStart(30);
		linkedList.addNodeAtIndex(2, 40);
		linkedList.addNodeAtIndex(-1,420);
		linkedList.display();

	}

}
