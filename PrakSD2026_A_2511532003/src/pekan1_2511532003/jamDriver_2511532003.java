package pekan1_2511532003;

public class jamDriver_2511532003 {
	public static void main  (String[] args) {
		jam_2511532003 a = new jam_2511532003 (23, 59, 50);
		jam_2511532003 b = new jam_2511532003 (0,0,15);
		System.out.println("a         =" + a);
		System.out.println("b         =" + b);
		System.out.println("a+b       =" + a.plus(b));
		System.out.println("next 20s  =" + a.nextNSeconds(20));
		System.out.println("durasi (a,b ) =" + jam_2511532003.durasiDetik(a, b));
		System.out.println("a.compareTo(b) =" + a.compareTo(b));
		
	}

}
