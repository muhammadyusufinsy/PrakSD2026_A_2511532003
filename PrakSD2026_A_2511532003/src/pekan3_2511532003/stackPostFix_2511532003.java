package pekan3_2511532003;

import java.util.Scanner;
import java.util.Stack;

public class stackPostFix_2511532003 {
	public static int postFixEvaluate (String expression) {
		Stack<Integer> s_2003 = new Stack<Integer>();
		Scanner input_2003 = new Scanner (expression);
		while (input_2003.hasNext()) {
			if  (input_2003.hasNextInt()) {
				s_2003.push(input_2003.nextInt());
			}
			else {
				String operator = input_2003.next();
				int operand2_2003 =s_2003.pop();
				int operand1_2003 =s_2003.pop();
				if (operator.equals ("+")) {
					s_2003.push(operand1_2003 + operand2_2003);
				} else if (operator.equals("-")) {
					s_2003.push(operand1_2003 - operand2_2003);
				}else if (operator.equals("*")) {
					s_2003.push(operand1_2003 * operand2_2003);
				} else {
					s_2003.push(operand1_2003 / operand2_2003);
				}
			}
		}
		input_2003.close();
		return s_2003.pop();
	}
	public static void main (String[] args) {
		System.out.println("hasil postFix =" + postFixEvaluate("5 2 4 * + 7 -"));
	}
}
