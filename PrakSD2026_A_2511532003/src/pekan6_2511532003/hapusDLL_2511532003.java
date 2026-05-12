package pekan6_2511532003;

public class hapusDLL_2511532003 {
	//fungsi menghapus node awal
	public static NodeDLL_2511532003 delHead (NodeDLL_2511532003 head_2003 ) {
		if (head_2003 == null) {
			return null; }
		NodeDLL_2511532003 temp_2003 = head_2003;
		head_2003 = head_2003.next_2003;
		if (head_2003 != null) {
			head_2003.prev_2003 = null; }
		return head_2003;
	}
	// fungsi menghapus di akhir
	public static NodeDLL_2511532003 delLast (NodeDLL_2511532003 head_2003) {
		if (head_2003 == null) {
			return null; }
		 if (head_2003.next_2003 == null) {
			 return null; }
		 NodeDLL_2511532003 curr_2003 = head_2003;
		 while (curr_2003.next_2003 != null) {
			 curr_2003 = curr_2003.next_2003;
		 }
		 // update pointer previous node 
		 if (curr_2003.prev_2003 != null) {
			 curr_2003.prev_2003.next_2003 = null; }
		 return head_2003;
	}
	// fungsi menghapus node posisi tertentu
	public static NodeDLL_2511532003 delPos (NodeDLL_2511532003 head_2003, int pos_2003) {
		// jika DLL kosong
		if (head_2003 == null) {
			return head_2003; }
		 NodeDLL_2511532003 curr_2003 = head_2003;
		 //telusuri sampai ke node yang akan di hapus
		 for (int i = 1; curr_2003 != null && i < pos_2003; ++i) {
			 curr_2003 = curr_2003.next_2003; }
		 // jika posisi tidak ditemukan
		 if (curr_2003 == null) {
			 return head_2003; }
		 // update pointer
		 if (curr_2003.prev_2003 != null) {
			 curr_2003.prev_2003.next_2003 = curr_2003.next_2003; }
		 // jika yang di hapus head
		 if (head_2003 == curr_2003) {
			 head_2003 = curr_2003.next_2003; }
		 return head_2003;
	}
	// fungsi mencetak DLL
	public static void printList (NodeDLL_2511532003 head_2003) {
		NodeDLL_2511532003 curr_2003 = head_2003;
		while (curr_2003 != null) {
			System.out.print(curr_2003.data_2003 + " <-> ");
			curr_2003 = curr_2003.next_2003;
		}
		System.out.println();
	}
	public static void main (String [] args) {
		// buat sebuah DLL
		NodeDLL_2511532003 head_2003 = new NodeDLL_2511532003(1);
		head_2003.next_2003 = new NodeDLL_2511532003(2);
		head_2003.next_2003.prev_2003 = head_2003;
		head_2003.next_2003.next_2003 = new NodeDLL_2511532003(3);
		head_2003.next_2003.next_2003.prev_2003 = head_2003.next_2003;
		head_2003.next_2003.next_2003.next_2003 = new NodeDLL_2511532003 (4);
		head_2003.next_2003.next_2003.next_2003.prev_2003 = head_2003.next_2003.next_2003;
		head_2003.next_2003.next_2003.next_2003.next_2003 = new NodeDLL_2511532003 (5);
		head_2003.next_2003.next_2003.next_2003.next_2003.prev_2003 = head_2003.next_2003.next_2003.next_2003;
		
		System.out.print ("DLL awal : ");
		printList (head_2003);
		
		System.out.print("setelah head di hapus : ");
		head_2003 = delHead(head_2003);
		printList(head_2003);
		
		System.out.print("setelah node terakhir di hapus :");
		head_2003 = delLast(head_2003);
		printList(head_2003);
		
		System.out.print("menghapus node ke 2 :");
		head_2003 = delPos(head_2003, 2);
		
		printList (head_2003);
	}

}
