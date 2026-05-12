package pekan6_2511532003;

public class PenelusuranDLL {
	//fungsi penelusuran maju 
	static void forwardTraversal (NodeDLL_2511532003 head_2003) {
		// memulai penelusuran dari head 
		NodeDLL_2511532003 curr_2003 = head_2003;
		// lanjutkan sampai akhir
		while (curr_2003 != null) {
			// print data
			System.out.print(curr_2003.data_2003 + " <-> ");
			//pindah ke node berikutnya 
			curr_2003 = curr_2003.next_2003;
		}
		//print spasi
		System.out.println();
	}
	// fungsi penelusuran mundur
	static void backwardTraversal (NodeDLL_2511532003 tail_2003) {
		//mulai dari akhir 
		NodeDLL_2511532003 curr_2003 = tail_2003;
		//lanjut sampai head
		while (curr_2003 != null) {
			// cetak data
			System.out.print(curr_2003.data_2003 + " <-> ");
			//pindah ke node sebelumnya
			curr_2003 = curr_2003.prev_2003;
		}
		//cetak spasi 
		System.out.println ();
	}
	public static void main (String [] args) {
		//cetak DLL
		NodeDLL_2511532003 head_2003 = new NodeDLL_2511532003 (1);
		NodeDLL_2511532003 second_2003 = new NodeDLL_2511532003 (2);
		NodeDLL_2511532003 third_2003 = new NodeDLL_2511532003 (3);
		head_2003.next_2003 = second_2003;
		second_2003.prev_2003 = head_2003;
		second_2003.next_2003 = third_2003;
		third_2003.prev_2003 = second_2003;
		
		System.out.println ("penelusuran maju :");
		forwardTraversal (head_2003);
		
		System.out.println ("penelusuran mundur :");
		backwardTraversal(third_2003);
	}

}
