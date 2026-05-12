package pekan6_2511532003;

public class InsertDLL_2511532003 {
	// menambahkan node di bagian awal DLL 
	static NodeDLL_2511532003 insertBegin (NodeDLL_2511532003 head_2003, int data_2003) {
		// buat node baru 
		NodeDLL_2511532003 new_node_2003 = new NodeDLL_2511532003 (data_2003);
		//jadikan pointer nextnya head
		new_node_2003.next_2003 = head_2003;
		// jadikan pointer prev head ke new node\
		if (head_2003 != null) {
			head_2003.prev_2003 = new_node_2003;
		}
		return new_node_2003;
	}
	//fungsi menambahkan node di akhir
	public static NodeDLL_2511532003 insertEnd (NodeDLL_2511532003 head_2003, int newData_2003) {
		// buat mode  baru 
		NodeDLL_2511532003 newNode_2003 = new NodeDLL_2511532003 (newData_2003);
		// jika dll null jadikan head
		if (head_2003 == null) {
			head_2003 = newNode_2003;
		}
		else {
			NodeDLL_2511532003 curr_2003 = head_2003;
			while (curr_2003.next_2003 != null) {
				curr_2003 = curr_2003.next_2003;
			}
			curr_2003.next_2003 = newNode_2003;
			newNode_2003.prev_2003 = curr_2003;
		}
		return head_2003;
		
	}
	// fungsi menambahkan node di posisi tertentu
	public static NodeDLL_2511532003 insertAtPosition (NodeDLL_2511532003 head_2003, int pos_2003, int new_data_2003) {
		//buat node baru
		NodeDLL_2511532003 new_node = new NodeDLL_2511532003 (new_data_2003);
		if (pos_2003 == 1) {
			new_node.next_2003 = head_2003;
			if (head_2003 != null) {
				head_2003.prev_2003 =new_node; }
			head_2003 = new_node;
			return head_2003; }
		NodeDLL_2511532003 curr_2003 = head_2003;
		for (int i = 1; i < pos_2003 - 1 && curr_2003 != null; ++i) {
			curr_2003 = curr_2003.next_2003; }
		if (curr_2003 == null) {
			System.out.println ("posisi tidak ada");
			return head_2003; }
		new_node.prev_2003 = curr_2003;
		new_node.next_2003 = curr_2003.next_2003;
		curr_2003.next_2003 = new_node;
		if (new_node.next_2003 != null) {
			new_node.next_2003.prev_2003 = new_node; }
		return head_2003;
	}
	public static void printList (NodeDLL_2511532003 head_2003 ) {
		NodeDLL_2511532003 curr_2003 = head_2003;
		while (curr_2003 != null) {
			System.out.print(curr_2003.data_2003 + " <-> ");
			curr_2003 = curr_2003.next_2003;
		}
		System.out.println();
	}
	public static void main (String [] args) {
		// membuat dll 2 <-> 3 <-> 5
		NodeDLL_2511532003 head_2003 = new NodeDLL_2511532003 (2);
		head_2003.next_2003 = new NodeDLL_2511532003(3);
		head_2003.next_2003.prev_2003 = head_2003;
		head_2003.next_2003.next_2003 = new NodeDLL_2511532003(5);
		head_2003.next_2003.next_2003.prev_2003 = head_2003.next_2003;
		//cetak DLL awal
		System.out.print("DLL awal:");
		printList(head_2003);
		// tambah 1 di awal
		head_2003 = insertBegin(head_2003, 1);
		System.out.print (
				"simpul 1 ditambahkan di awal : ") ;
					printList(head_2003);
		// tambah 6 diakhir 
					System.out.print (
							"simpul 6 ditambahkan di akhir:");
		int data_2003 = 6;
		head_2003 = insertEnd (head_2003, data_2003);
		printList (head_2003);
		// menambahkan node 4 di posisi 4
		System.out.print("tambah node 4 di posisi 4 :");
		int data2_2003 = 4;
		int pos_2003 = 4;
		head_2003 = insertAtPosition (head_2003, pos_2003, data2_2003);
		printList (head_2003);
	}

}
