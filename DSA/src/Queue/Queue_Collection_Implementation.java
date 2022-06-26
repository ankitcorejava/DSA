package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

/*****
 * Queue works based on FIFO operation, there are multiple ways to implement
 * queue, will see how it can implemented using ArrayDeque or LinkedList
 * 
 *****/
public class Queue_Collection_Implementation {

	public static void main(String[] args) {
		Queue<String> queue = new ArrayDeque<String>();
		queue.add("A");
		queue.add("B");
		queue.add("C");
		queue.add("D");

		System.out.println(queue);
		System.out.println("Removed: " + queue.remove() + " Status: " + queue);
		System.out.println("Peek: " + queue.peek() + " Status: " + queue);
		System.out.println("Poll " + queue.poll() + " Status: " + queue);

	}

}
