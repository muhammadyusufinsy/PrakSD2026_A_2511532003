package pekan9_2511532003;

public class BtreeDriver_2511532003 {
	public static void main (String [] args) {
		//membuat pohon
		BTree_2511532003 tree = new BTree_2511532003();
		System.out.print("jumlah simpul awal pohon :");
		System.out.println(tree.countNodes_2003());
		
		
		//menambahklklan simpul data 1
		Node_2511532003 root = new Node_2511532003(1);
		// menjadikan simpul 1 sebagai root 
		tree.setRoot_2003(root);
		System.out.println("jumlah simpul jika hanya ada root :");
		System.out.println(tree.countNodes_2003());
		Node_2511532003 node2 = new Node_2511532003(2);
		Node_2511532003 node3 = new Node_2511532003(3);
		Node_2511532003 node4 = new Node_2511532003(4);
		Node_2511532003 node5 = new Node_2511532003(5);
		Node_2511532003 node6 = new Node_2511532003(6);
		Node_2511532003 node7 = new Node_2511532003(7);
		Node_2511532003 node8 = new Node_2511532003(8);
		Node_2511532003 node9 = new Node_2511532003(9);
		root.setLeft_2003(node2);
		node2.setLeft_2003(node4);
		node2.setRight_2003(node5);
		node4.setRight_2003(node8);
		root.setRight_2003(node3);
		node3.setLeft_2003(node6);
		node3.setRight_2003(node7);
		node6.setLeft_2003(node9);
		
		//set root
		tree.setCurrent_2003(tree.getRoot_2003());
		System.out.println("menampilkan simpul terakhir :");
		System.out.println(tree.getCurrent_2003().getData_2003());
		System.out.println("Jumlah simpul ; setelah simpul 7 ditambahkan :");
		System.out.println(tree.countNodes_2003());
		System.out.println("InOrder:");
		tree.printInorder_2003();
		System.out.println("\nPreOrder:");
		tree.printPreorder_2003();
		System.out.println("\nPostOrder:");
		tree.printPostorder_2003();
		System.out.println("\nmenampilkan simpul dalam bentuk phon : ");
		tree.print_2003();
		
	}
	

}
