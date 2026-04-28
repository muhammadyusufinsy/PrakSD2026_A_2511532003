package pekan4_2511532003;

import java.util.Queue;
import java.util.LinkedList;

public class queueLinkedList_2511532003 {
	public static void main (String [] args) {
		Queue<Integer> q_2003 = new LinkedList<>();
		// tambah elemen {0,1,2,3,4,5} ke dalam antrian
		for (int i_2003 = 0; i_2003 < 6; i_2003++)
			q_2003.add(i_2003);
		//menampilkan isi antrian 
		System.out.println ("elemen antrian " + q_2003);
		//untut menghapus kepala antrian 
		int hapus_2003 = q_2003.remove();
		System.out.println("hapus elemen = " + hapus_2003);
		System.out.println(q_2003);
		//untuk melihat antrian terdepan
		int depan_2003 = q_2003.peek();
		System.out.println("kepala antrian = " + depan_2003);
		
		int banyak_2003 = q_2003.size ();
		System.out.println ("size antrian = " + banyak_2003);
	}

}
