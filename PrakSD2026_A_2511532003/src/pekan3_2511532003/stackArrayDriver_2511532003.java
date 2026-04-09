package pekan3_2511532003;

public class stackArrayDriver_2511532003 {
	public static void main (String [] args ) {
		stackArray_2511532003 s = new stackArray_2511532003();
		s.push (10);
		s.push(20);
		s.push(30);
		System.out.println(s.pop() + " dikeluarkan dari stack");
		System.out.println("elemen teratas adalah :" + s.peek());
		System.out.print("elemn pada stack :");
		s.print();
	}

}
