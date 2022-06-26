package Stack;

import java.util.Stack;

public class StackIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> stack = new Stack<Integer>();
		System.out.println("empty: " + stack);
		System.out.println("Size: " + stack.size());
		stack.push(10);
		stack.push(20);
		stack.push(30);

		for (int i : stack) {
			System.out.println(i + " -> ");
		}
	}

}
