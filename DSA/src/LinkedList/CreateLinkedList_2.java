package LinkedList;

public class CreateLinkedList_2 {

	public static class Node {
		private int value;
		private Node next;

		public Node(int value) {
			this.value = value;
			this.next = null;
		}
	}

	public static class LinkedList {
		private Node head;
		private Node tail;
		private int size;

		public LinkedList() {
			this.head = null;
			this.tail = null;
			this.size = 0;
		}

		public int size() {
			return this.size;
		}

		public void display() {
			Node current = this.head;
			while (current != null) {
				System.out.println(current.value);
				current = current.next;
			}

		}

		public void addFirst(int value) {
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

		public void addLast(int value) {
			Node node = new Node(value);
			if (size() == 0) {
				this.head = node;
				this.tail = node;
				this.size++;
			} else {
				Node current = this.head;
				while (current.next != null) {
					current = current.next;
				}
				current.next = node;
				this.tail = node;
				this.size++;

			}
		}

		public void addAt(int value, int index) {
			Node node = new Node(value);
			if (index == 0) {
				addFirst(value);
			} else {
				Node current = this.head;
				Node previous = null;
				int idx = 0;
				while (idx <index) {
					previous = current;
					current = current.next;
					idx++;
				}
				previous.next = node;
				node.next = current;
				this.size++;

			}
		}

	}

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.addFirst(10);
		linkedList.addFirst(20);
		linkedList.addFirst(30);
		linkedList.addFirst(40);
		linkedList.addLast(50);
		linkedList.addLast(60);
		linkedList.addAt(140,0);
		linkedList.addAt(240,4);
		linkedList.display();

	}

}
