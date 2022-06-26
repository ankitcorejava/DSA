package Stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

	public static boolean balance(String str) {

		Stack<Character> st = new Stack<Character>();

		char[] chars = str.toCharArray();

		for (int i = 0; i < chars.length; i++) {

			if (chars[i] == '(' || chars[i] == '{' || chars[i] == '[') {

				st.push(chars[i]);

			} else if (chars[i] == ')' || chars[i] == '}' || chars[i] == ']') {
				if (st.size() == 0) {
					return false;
				}

				switch (chars[i]) {

				case ')': {
					if (st.peek() == '(') {
						st.pop();
					} else {
						return false;
					}
				}
					break;
				case '}': {
					if (st.peek() == '{') {
						st.pop();
					} else {
						return false;
					}
				}
					break;
				case ']': {
					if (st.peek() == '[') {
						st.pop();
					} else {
						return false;
					}
				}
				default:
					break;

				}

			}
		}
		if (st.size() != 0) {
			return false;
		}
		return true;

	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		System.out.println(BalancedBrackets.balance(str));
		// System.out.println(Stack_Balance2.balance("(a+b)"));
		// System.out.println(Stack_Balance2.balance("(())"));

	}

}
