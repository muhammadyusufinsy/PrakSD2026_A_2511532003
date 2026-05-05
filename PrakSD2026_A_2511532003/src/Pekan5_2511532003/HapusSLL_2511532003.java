package Pekan5_2511532003;

public class HapusSLL_2511532003 {

    // fungsi untuk menghapus head
    public static NodeSLL_2511532003 deleteHead(NodeSLL_2511532003 head_2003) {
        if (head_2003 == null)
            return null;

        head_2003 = head_2003.next;
        return head_2003;
    }

    // fungsi menghapus node terakhir SLL
    public static NodeSLL_2511532003 removeLastNode(NodeSLL_2511532003 head_2003) {
        if (head_2003 == null)
            return null;

        if (head_2003.next == null)
            return null;

        NodeSLL_2511532003 secondLast_2003 = head_2003;
        while (secondLast_2003.next.next != null) {
            secondLast_2003 = secondLast_2003.next;
        }

        secondLast_2003.next = null;
        return head_2003;
    }

    // fungsi menghapus node di posisi tertentu
    public static NodeSLL_2511532003 deleteNode(NodeSLL_2511532003 head_2003, int position_2003) {
        NodeSLL_2511532003 temp_2003 = head_2003;
        NodeSLL_2511532003 prev_2003 = null;

        if (temp_2003 == null)
            return head_2003;

        if (position_2003 == 1) {
            head_2003 = temp_2003.next;
            return head_2003;
        }

        for (int i_2003 = 1; temp_2003 != null && i_2003 < position_2003; i_2003++) {
            prev_2003 = temp_2003;
            temp_2003 = temp_2003.next;
        }

        if (temp_2003 != null) {
            prev_2003.next = temp_2003.next;
        } else {
            System.out.println("Data tidak ada");
        }

        return head_2003;
    }

    // fungsi mencetak SLL
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

    // kelas main
    public static void main(String[] args) {

        NodeSLL_2511532003 head_2003 = new NodeSLL_2511532003(1);
        head_2003.next= new NodeSLL_2511532003(2);
        head_2003.next.next = new NodeSLL_2511532003(3);
        head_2003.next.next.next = new NodeSLL_2511532003(4);
        head_2003.next.next.next.next = new NodeSLL_2511532003(5);
        head_2003.next.next.next.next.next = new NodeSLL_2511532003(6);

        System.out.println("List awal:");
        printList(head_2003);

        head_2003 = deleteHead(head_2003);
        System.out.println("Setelah hapus head:");
        printList(head_2003);

        head_2003 = removeLastNode(head_2003);
        System.out.println("Setelah hapus node terakhir:");
        printList(head_2003);

        int position_2003 = 2;
        head_2003 = deleteNode(head_2003, position_2003);

        System.out.println("Setelah hapus posisi 2:");
        printList(head_2003);
    }
}