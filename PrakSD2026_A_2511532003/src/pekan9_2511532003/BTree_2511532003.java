	package pekan9_2511532003;
	
	public class BTree_2511532003 {
	    private Node_2511532003 root_2003;
	    private Node_2511532003 currentNode_2003;

	    public BTree_2511532003() {
	        root_2003 = null;
	    }

	    public boolean search_2003(int data_2003) {
	        return search_2003(root_2003, data_2003);
	    }

	    private boolean search_2003(Node_2511532003 node_2003, int data_2003) {
	        if (node_2003.getData_2003() == data_2003)
	            return true;

	        if (node_2003.getLeft_2003() != null)
	            if (search_2003(node_2003.getLeft_2003(), data_2003))
	                return true;

	        if (node_2003.getRight_2003() != null)
	            if (search_2003(node_2003.getRight_2003(), data_2003))
	                return true;

	        return false;
	    }

	    public void printInorder_2003() {
	        root_2003.printInorder_2003(root_2003);
	    }

	    public void printPreorder_2003() {
	        root_2003.printPreorder_2003(root_2003);
	    }

	    public void printPostorder_2003() {
	        root_2003.printPostorder_2003(root_2003);
	    }

	    public Node_2511532003 getRoot_2003() {
	        return root_2003;
	    }

	    public boolean isEmpty_2003() {
	        return root_2003 == null;
	    }

	    public int countNodes_2003() {
	        return countNodes_2003(root_2003);
	    }

	    private int countNodes_2003(Node_2511532003 node_2003) {
	        int count_2003 = 1;

	        if (node_2003 == null) {
	            return 0;
	        } else {
	            count_2003 += countNodes_2003(node_2003.getLeft_2003());
	            count_2003 += countNodes_2003(node_2003.getRight_2003());
	            return count_2003;
	        }
	    }

	    public void print_2003() {
	        root_2003.print_2003();
	    }

	    public Node_2511532003 getCurrent_2003() {
	        return currentNode_2003;
	    }

	    public Node_2511532003 setCurrent_2003(Node_2511532003 node_2003) {
	        return currentNode_2003 = node_2003;
	    }

	    public void setRoot_2003(Node_2511532003 root_2003) {
	        this.root_2003 = root_2003;
	    }
	}