package Queue;

public class CustomizeQueue {

	int[] data = null;
	int front = 0;
	int size = 0;

	public CustomizeQueue(int cap) {
		this.data = new int[cap];
		this.front = 0;
		this.size = 0;
	}

	public int size() {
		return this.size;
	}

	public void add(int val) {
		
		if (size() == data.length) {
			System.out.println("Over Flow");
			return;
		}
		int index = ((this.front + size()) % data.length);
		this.data[index] = val;
		this.size++;
	}

	public int remove() {
		if (size() == 0) {
			System.out.println("Under Flow");
			return -1;
		}
		int val = this.data[front];
		this.front = (front + 1) % data.length;
		this.size--;
		return val;
	}

	public int peek() {
		if (size() == 0) {
			System.out.println("Under Flow");
			return -1;
		}
		int val = this.data[front];
		return val;
	}

	public void display() {
		for (int i = 0; i < size(); i++) {
			System.out.print(data[((this.front + i) % data.length)] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		CustomizeQueue customizeQueue = new CustomizeQueue(5);
		customizeQueue.add(10);
		customizeQueue.display();
		customizeQueue.add(20);
		customizeQueue.display();
		customizeQueue.add(30);
		customizeQueue.display();
		customizeQueue.add(40);
		customizeQueue.display();
		customizeQueue.add(50);
		customizeQueue.display();
		customizeQueue.add(60);
		customizeQueue.display();

	}

}
