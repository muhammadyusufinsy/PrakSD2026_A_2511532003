package pekan4_2511532003;
import java.util.*;

public class reversedata_2511532003 {
	public static void main (String [] args) {
		Queue<Integer> q_2003 = new LinkedList <Integer>();
		q_2003.add(1);
		q_2003.add(2);
		q_2003.add(3); // [1,2,3]
		System.out.println("sebelum reverse" + q_2003);
		Stack<Integer> s_2003 = new Stack<Integer> ();
		while (!q_2003.isEmpty()) {
			s_2003.push(q_2003.remove());
		}
		while (!s_2003.isEmpty()) {
			q_2003.add(s_2003.pop ());
		}
		System.out.println("sesudah reverse = " + q_2003);
	}

}
