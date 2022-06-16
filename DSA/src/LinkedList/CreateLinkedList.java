package LinkedList;

public class CreateLinkedList {

	
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
	private static class LinkedList{
		private Node head; 
		private Node tail; 
		private int size; 
		
		public LinkedList() {
			this.head = null;
			this.tail = null;
			this.size =0;
		}
		
		//Get Size
		public int size() {
			return this.size;
		}
		
		//Add Node at start
		public void addNodeAtStart(int value) {
			Node node = new Node(value);
			if(size()==0) {
				this.head = node;
				this.tail = node;
				this.size++;
			}
			else {
				node.next = this.head; 
				this.head = node; 
				this.size++;
			}
		}
		
		//Display
		
		public void display() {
			Node current = this.head; 
			while(current != null) {
				System.out.print("-> "+current.value);
				current = current.next;
			}
		}
	}
	
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.addNodeAtStart(10);
		linkedList.addNodeAtStart(20);
		linkedList.addNodeAtStart(30);
		linkedList.display();
		
		
	}
	

}
