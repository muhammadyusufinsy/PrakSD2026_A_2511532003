package pekan9_2511532003;

public class Node_2511532003 {
    int data_2003; // bisa diganti dengan String
    Node_2511532003 left_2003;
    Node_2511532003 right_2003;

    public Node_2511532003(int data_2003) {
        this.data_2003 = data_2003;
        left_2003 = null;
        right_2003 = null;
    }

    public void setLeft_2003(Node_2511532003 node_2003) {
        if (left_2003 == null)
            left_2003 = node_2003;
    }

    public void setRight_2003(Node_2511532003 node_2003) {
        if (right_2003 == null)
            right_2003 = node_2003;
    }

    public Node_2511532003 getLeft_2003() {
        return left_2003;
    }

    public Node_2511532003 getRight_2003() {
        return right_2003;
    }

    public int getData_2003() {
        return data_2003;
    }

    public void setData_2003(int data_2003) {
        this.data_2003 = data_2003;
    }

    void printPreorder_2003(Node_2511532003 node_2003) {
        if (node_2003 == null)
            return;

        System.out.print(node_2003.data_2003 + " ");
        printPreorder_2003(node_2003.left_2003);
        printPreorder_2003(node_2003.right_2003);
    }

    void printPostorder_2003(Node_2511532003 node_2003) {
        if (node_2003 == null)
            return;

        printPostorder_2003(node_2003.left_2003);
        printPostorder_2003(node_2003.right_2003);
        System.out.print(node_2003.data_2003 + " ");
    }

    void printInorder_2003(Node_2511532003 node_2003) {
        if (node_2003 == null)
            return;

        printInorder_2003(node_2003.left_2003);
        System.out.print(node_2003.data_2003 + " ");
        printInorder_2003(node_2003.right_2003);
    }

    public String print_2003() {
        return this.print_2003("", true, "");
    }

    public String print_2003(String prefix_2003, boolean isTail_2003, String sb_2003) {
        if (right_2003 != null) {
            right_2003.print_2003(
                    prefix_2003 + (isTail_2003 ? "|   " : "   "),
                    false,
                    sb_2003);
        }

        System.out.println(prefix_2003 + (isTail_2003 ? "\\--" : "/--") + data_2003);

        if (left_2003 != null) {
            left_2003.print_2003(
                    prefix_2003 + (isTail_2003 ? "   " : "|   "),
                    true,
                    sb_2003);
        }

        return sb_2003;
    }
}