package pekan8_2511532003;

public class MergeSort_2511532003 {
	void merge_2003(int[] arr_2003, int l_2003, int m_2003, int r_2003) {
	    // find sizes of two subarrays to be merged
	    int n1_2003 = m_2003 - l_2003 + 1;
	    int n2_2003 = r_2003 - m_2003;

	    /* create temp arrays */
	    int L_2003[] = new int[n1_2003];
	    int R_2003[] = new int[n2_2003];

	    /* copy data to temp arrays */
	    for (int i_2003 = 0; i_2003 < n1_2003; ++i_2003)
	        L_2003[i_2003] = arr_2003[l_2003 + i_2003];

	    for (int j_2003 = 0; j_2003 < n2_2003; ++j_2003)
	        R_2003[j_2003] = arr_2003[m_2003 + 1 + j_2003];

	    int i_2003 = 0, j_2003 = 0;

	    // initial index merged subarray array
	    int k_2003 = l_2003;

	    while (i_2003 < n1_2003 && j_2003 < n2_2003) {
	        if (L_2003[i_2003] <= R_2003[j_2003]) {
	            arr_2003[k_2003] = L_2003[i_2003];
	            i_2003++;
	        } else {
	            arr_2003[k_2003] = R_2003[j_2003];
	            j_2003++;
	        }
	        k_2003++;
	    }

	    /* copy remaining elements of L[] if any */
	    while (i_2003 < n1_2003) {
	        arr_2003[k_2003] = L_2003[i_2003];
	        i_2003++;
	        k_2003++;
	    }

	    /* copy remaining elements of R[] if any */
	    while (j_2003 < n2_2003) {
	        arr_2003[k_2003] = R_2003[j_2003];
	        j_2003++;
	        k_2003++;
	    }
	}

	void sort_2003(int arr_2003[], int l_2003, int r_2003) {
	    if (l_2003 < r_2003) {
	        // find the middle point
	        int m_2003 = (l_2003 + r_2003) / 2;

	        // sort first and second halves
	        sort_2003(arr_2003, l_2003, m_2003);
	        sort_2003(arr_2003, m_2003 + 1, r_2003);

	        // merge the sorted halves
	        merge_2003(arr_2003, l_2003, m_2003, r_2003);
	    }
	}

	/* a utility function to print array of size n */
	static void printArray_2003(int arr_2003[]) {
	    int n_2003 = arr_2003.length;

	    for (int i_2003 = 0; i_2003 < n_2003; ++i_2003)
	        System.out.print(arr_2003[i_2003] + " ");

	    System.out.println();
	}

	public static void main(String args[]) {
	    int arr_2003[] = {12, 11, 13, 5, 6, 7};

	    System.out.println("Sebelum terurut: ");
	    printArray_2003(arr_2003);

	    MergeSort_2511532003 ob_2003 = new MergeSort_2511532003();
	    ob_2003.sort_2003(arr_2003, 0, arr_2003.length - 1);

	    System.out.println("\nSesudah Terurut menggunakan merge sort");
	    printArray_2003(arr_2003);
	}
}