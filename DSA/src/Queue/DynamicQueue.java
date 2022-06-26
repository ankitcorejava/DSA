package Queue;

public class DynamicQueue {

	int[] data = null;
	int front = 0;
	int size = 0;

	public DynamicQueue(int cap) {
		this.data = new int[cap];
		this.front = 0;
		this.size = 0;
	}

	public int size() {
		return this.size;
	}

	public void add(int val) {
		
		if (size() == data.length) {
			/*System.out.println("Over Flow");
			return;*/
			int dataNew[] = new int[2 *data.length];
			
			//storing values from data to dataNew in same order
			for (int i = 0; i < size(); i++) {
				dataNew[i] = (data[((this.front + i) % data.length)]);
			}
			this.front =0;
			data = dataNew;
			
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
		DynamicQueue customizeQueue = new DynamicQueue(5);
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
