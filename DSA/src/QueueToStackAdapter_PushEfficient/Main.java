package QueueToStackAdapter_PushEfficient;

import java.io.*;
import java.util.*;

public class Main {

	public static class QueueToStackAdapter {
		Queue<Integer> mainQ;
		Queue<Integer> helperQ;

		public QueueToStackAdapter() {
			mainQ = new ArrayDeque<>();
			helperQ = new ArrayDeque<>();
		}

		int size() {
			// write your code here
			return mainQ.size();
		}

		void push(int val) {
			// write your code here
			mainQ.add(val);
		}

		int pop() {
			// write your code here
			int val = 0;
			if (mainQ.size() <= 0) {
				return -1;

			} else {
				Iterator<Integer> itr = mainQ.iterator();
				int icnt = 1;
				while (mainQ.size() > 1) {
					helperQ.add(mainQ.remove());
				}
				val = mainQ.remove();
				mainQ = helperQ;
			}
			return val;
		}

		int top() {
			// write your code here

			// write your code here
			int val = 0;
			if (mainQ.size() <= 0) {
				return -1;

			} else {
				Iterator<Integer> itr = mainQ.iterator();
				int icnt = 1;
				while (mainQ.size() > 1) {
					helperQ.add(mainQ.remove());
				}
				val = mainQ.remove();
				helperQ.add(val);
				mainQ = helperQ;
			}
			return val;
		}
	}

		public static void main(String[] args) throws Exception {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			QueueToStackAdapter st = new QueueToStackAdapter();

			String str = br.readLine();
			while (str.equals("quit") == false) {
				if (str.startsWith("push")) {
					int val = Integer.parseInt(str.split(" ")[1]);
					st.push(val);
				} else if (str.startsWith("pop")) {
					int val = st.pop();
					if (val != -1) {
						System.out.println(val);
					}
				} else if (str.startsWith("top")) {
					int val = st.top();
					if (val != -1) {
						System.out.println(val);
					}
				} else if (str.startsWith("size")) {
					System.out.println(st.size());
				}
				str = br.readLine();
			}
		}
	}