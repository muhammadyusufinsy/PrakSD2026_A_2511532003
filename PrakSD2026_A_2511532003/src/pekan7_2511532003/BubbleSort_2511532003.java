package pekan7_2511532003;

public class BubbleSort_2511532003 {
    public static void bubbleSort_2003(int[] arr_2003) {
        int n_2003 = arr_2003.length;
        for (int i_2003 = 0; i_2003 < n_2003; i_2003++) {
            for (int j_2003 = 0; j_2003 < n_2003 - i_2003 - 1; j_2003++) {
                if (arr_2003[j_2003] > arr_2003[j_2003 + 1]) {
                    int temp_2003 = arr_2003[j_2003];
                    arr_2003[j_2003] = arr_2003[j_2003 + 1];
                    arr_2003[j_2003 + 1] = temp_2003;
                    // System.out.println("data:" + arr_2003[j_2003] + " " + arr_2003[j_2003 + 1]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr_2003[] = { 23, 78, 45, 8, 32, 56, 1 };
        int n_2003 = arr_2003.length;

        System.out.print("array yang belum terurut: ");
        for (int i_2003 = 0; i_2003 < n_2003; i_2003++)
            System.out.print(arr_2003[i_2003] + " ");
        System.out.println("");

        bubbleSort_2003(arr_2003);

        System.out.print("array yang terurut menggunakan BubbleSort: ");
        for (int i_2003 = 0; i_2003 < n_2003; i_2003++)
            System.out.print(arr_2003[i_2003] + " ");
        System.out.println("");
    }
}
