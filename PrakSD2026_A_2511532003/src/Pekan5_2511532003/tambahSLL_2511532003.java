package Pekan5_2511532003;

public class tambahSLL_2511532003 {

    public static NodeSLL_2511532003 insertAtFront(NodeSLL_2511532003 head_2003, int value_2003) {
        NodeSLL_2511532003 new_node_2003 = new NodeSLL_2511532003(value_2003);
        new_node_2003.next = head_2003;
        return new_node_2003;
    }

    // fungsi menambahkan node di akhir SLL
    public static NodeSLL_2511532003 insertAtEnd(NodeSLL_2511532003 head_2003, int value_2003) {
        NodeSLL_2511532003 newNode_2003 = new NodeSLL_2511532003(value_2003);

        if (head_2003 == null) {
            return newNode_2003;
        }

        NodeSLL_2511532003 last_2003 = head_2003;

        while (last_2003.next != null) {
            last_2003 = last_2003.next;
        }

        last_2003.next = newNode_2003;
        return head_2003;
    }

    static NodeSLL_2511532003 GetNode(int data_2003) {
        return new NodeSLL_2511532003(data_2003);
    }

    static NodeSLL_2511532003 insertPos(NodeSLL_2511532003 headNode_2003, int position_2003, int value_2003) {
        NodeSLL_2511532003 head_2003 = headNode_2003;

        if (position_2003 < 1)
            System.out.print("invalid position");

        if (position_2003 == 1) {
            NodeSLL_2511532003 new_node_2003 = new NodeSLL_2511532003(value_2003);
            new_node_2003.next = head_2003;
            return new_node_2003;
        } else {
            while (position_2003-- != 0) {
                if (position_2003 == 1) {
                    NodeSLL_2511532003 newNode_2003 = GetNode(value_2003);
                    newNode_2003.next = headNode_2003.next;
                    headNode_2003.next = newNode_2003;
                    break;
                }
                headNode_2003 = headNode_2003.next;
            }

            if (position_2003 != 1)
                System.out.print("posisi di luar jangkauan");
        }
        return head_2003;
    }

    public static void printList(NodeSLL_2511532003 head_2003) {
        NodeSLL_2511532003 curr_2003 = head_2003;

        while (curr_2003 != null) {
            if (curr_2003.next != null) {
                System.out.print(curr_2003.data_2003 + "-->");
            } else {
                System.out.print(curr_2003.data_2003);
            }
            curr_2003 = curr_2003.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        NodeSLL_2511532003 head_2003 = new NodeSLL_2511532003(2);
        head_2003.next = new NodeSLL_2511532003(3);
        head_2003.next.next = new NodeSLL_2511532003(5);
        head_2003.next.next.next = new NodeSLL_2511532003(6);

        System.out.print("Senarai berantai awal: ");
        printList(head_2003);

        System.out.print("Tambah 1 simpul di depan: ");
        int data_2003 = 1;
        head_2003 = insertAtFront(head_2003, data_2003);
        printList(head_2003);

        System.out.print("Tambah 1 simpul di belakang: ");
        int data2_2003 = 7;
        head_2003 = insertAtEnd(head_2003, data2_2003);
        printList(head_2003);

        System.out.print("Tambah 1 simpul ke posisi 4: ");
        int data3_2003 = 4;
        int pos_2003 = 4;
        head_2003 = insertPos(head_2003, pos_2003, data3_2003);
        printList(head_2003);
    }
}