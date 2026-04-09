package pekan3_2511532003;

import java.util.Stack;

public class nilaiMaksimum_2511532003 {
	public static int max_2003 (Stack<Integer> s_2003) {
		Stack <Integer>backup_2003 = new Stack<Integer>();
		int maxValue = s_2003.pop();
		backup_2003.push(maxValue);
		while (!s_2003.isEmpty()) {
			int next = s_2003.pop();
			backup_2003.push(next);
			maxValue = Math.max(maxValue,  next);
		}
		while (!backup_2003.isEmpty()) {
			s_2003.push(backup_2003.pop());
		}
		return maxValue;
	}

public static void main (String [] args) {
	Stack <Integer> s_2003 = new Stack<Integer>();
	s_2003.push(70);
	s_2003.push(12);
	s_2003.push(20);
	System.out.println("isi stack " + s_2003);
	System.out.println("stack teratas " + s_2003.peek());
	System.out.println("isi stack " + max_2003 (s_2003));
}
}
