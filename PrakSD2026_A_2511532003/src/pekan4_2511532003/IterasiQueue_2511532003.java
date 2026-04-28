package pekan4_2511532003;
import java.util.*;

public class IterasiQueue_2511532003 {
	public static void main (String [] args) {
		Queue<String> q_2003 = new LinkedList<>();
		
		q_2003.add("praktikum");
		q_2003.add("struktur");
		q_2003.add("data");
		q_2003.add("dan");
		q_2003.add("algoritma");
		Iterator<String> iterator_2003 = q_2003.iterator ();
		while (iterator_2003.hasNext()) {
			System.out.print(iterator_2003.next() + " ");
		}
	}

}
