package Stack;

import java.util.Scanner;
import java.util.Stack;

public class DuplicateBrackets {

	public static boolean balance(String str) {

		Stack<Character> st = new Stack<Character>();

		char[] chars = str.toCharArray();

		for (int i = 0; i < chars.length; i++) {

			if (chars[i] == ')') {
				if (st.peek() == '(') {
					return true;
				} else {
					while (st.peek() != '(') {
						st.pop();
					}
					st.pop();
				}

			} else if (chars[i] == ' ') {
				continue;
			}else {
				st.push(chars[i]);
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		String str = scn.next()	;	
		System.out.println( DuplicateBrackets.balance(str));
		System.out.println( DuplicateBrackets.balance("(a+b)"));
		System.out.println( DuplicateBrackets.balance("(())"));
		
	}

}
