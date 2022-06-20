package LinkedList;

public class ReOrderLinkedList {

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

		// Find Mid
		public void findMid() {
			Node slow = this.head;
			Node fast = this.head;

			while (fast.next != null && fast.next.next != null) {
				fast = fast.next.next;
				slow = slow.next;
			}
			System.out.print(slow.value);

		}

		// Display

		public void display() {
			Node current = this.head;
			while (current != null) {
				System.out.print("-> " + current.value);
				current = current.next;
			}
		}

		public Node reverseLinkedListPointerIterative(Node head) {
			Node current = head;
			Node next = head;
			Node previous = null;
			while (current != null) {
				next = current.next;
				current.next = previous;
				previous = current;
				current = next;
			}
			// this.tail = head;
			head = previous;

			return head;

		}

		public void reorderList(Node head) {

			Node slow = head;
			Node fast = head;

			while (fast.next != null && fast.next.next != null) {
				fast = fast.next.next;
				slow = slow.next;
			}

			// Split Nodes:
			Node p2 = slow.next;
			Node p1 = head;
			slow.next = null;
			Node p3 = reverseLinkedListPointerIterative(p2);

			// Create Dummy Node:
			Node dummy = new Node(1);
			Node current = dummy;
			while (p1 != null && p3 != null) {
				current.next = p1;
				current = p1;
				p1 = p1.next;
				current.next = p3;
				current = p3;
				p3 = p3.next;

			}
			
			if(p1 != null) {
				current.next = p1;
			}

		}
	}

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.addNodeAtStart(10);
		linkedList.addNodeAtStart(20);
		linkedList.addNodeAtStart(30);
		linkedList.addNodeAtIndex(2, 40);
		linkedList.addNodeAtIndex(2, 50);
		// linkedList.addNodeAtIndex(-1,420);
		linkedList.display();
		System.out.println();
		// linkedList.findMid();
		linkedList.reorderList(linkedList.head);
		linkedList.display();

	}

}
