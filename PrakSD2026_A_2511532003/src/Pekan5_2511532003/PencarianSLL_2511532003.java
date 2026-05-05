package Pekan5_2511532003;

public class PencarianSLL_2511532003 {

    static boolean searchKey(NodeSLL_2511532003 head_2003, int key_2003) {
        NodeSLL_2511532003 curr_2003 = head_2003;

        while (curr_2003 != null) {
            if (curr_2003.data_2003 == key_2003)
                return true;

            curr_2003 = curr_2003.next;
        }
        return false;
    }

    static void traversal(NodeSLL_2511532003 head_2003) {
        NodeSLL_2511532003 curr_2003 = head_2003;

        while (curr_2003 != null) {
            System.out.print(" " + curr_2003.data_2003);
            curr_2003 = curr_2003.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        NodeSLL_2511532003 head_2003 = new NodeSLL_2511532003(14);
        head_2003.next = new NodeSLL_2511532003(21);
        head_2003.next.next = new NodeSLL_2511532003(13);
        head_2003.next.next.next = new NodeSLL_2511532003(30);
        head_2003.next.next.next.next = new NodeSLL_2511532003(10);

        System.out.print("Penelusuran SLL :");
        traversal(head_2003);

        int key_2003 = 30;
        System.out.print("cari data " + key_2003 + " = ");

        if (searchKey(head_2003, key_2003))
            System.out.println("ketemu");
        else
            System.out.println("tidak ada");
    }
}