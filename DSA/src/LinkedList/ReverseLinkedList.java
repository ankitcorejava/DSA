package LinkedList;


/****Steps to Perform Reverse Linked List:****
 * 1. Create a method to get a Node by an index
 * 2. move from left to right in loop by +1;
 * 3. left = 0 & right = size() -1;
 * 4. swap function to swap values;
 * 
 * *****/
public class ReverseLinkedList {

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

		// Get node from Start
		public Node getNodeFromStart() {
			if (size() == 0) {
				return null;
			} else {
				return this.head;
			}
		}

		// Get node from End
		public Node getNodeFromEnd() {
			if (size() == 0) {
				return null;
			} else {
				return this.tail;
			}
		}

		// Get node based on index
		public Node getNodeBasedOnIndex(int index) {
			if (size() == 0) {
				return null;
			}

			if (size() == 1) {
				return getNodeFromStart();
			}

			if (size() == index) {
				return getNodeFromEnd();
			}

			else {
				int idx = 1;
				// Node previous = null;
				Node current = this.head;
				while (idx <= index) {
					// previous = current;
					current = current.next;
					idx++;

				}
				return current;
			}
		}
		
		//Swap Nodes
		public void swapNodes(Node left, Node right) {
			if(left!= null && right != null) {
				int temp = left.value;
				left.value = right.value; 
				right.value = temp;
			}
		}
		
		public void reverseLinkedList() {
			int left =0;
			int right = size()-1;
			while(left <= right) {
				swapNodes(getNodeBasedOnIndex(left),getNodeBasedOnIndex(right));
				//display();
				left++;
				right--;
			}
		}

	}

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.addNodeAtEnd(10);
		linkedList.addNodeAtEnd(20);
		linkedList.addNodeAtEnd(30);
		linkedList.addNodeAtEnd(40);
		linkedList.addNodeAtEnd(50);
		linkedList.display();
		System.out.println();
		linkedList.reverseLinkedList();
		System.out.println();
		linkedList.display();

	}

}
