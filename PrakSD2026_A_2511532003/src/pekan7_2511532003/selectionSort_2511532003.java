package pekan7_2511532003;

public class selectionSort_2511532003 {
	public static void selectionSort (int[] arr_2003) {
		int n_2003 = arr_2003.length;
		for (int i_2003 = 0; i_2003 < n_2003; i_2003++) {
			int minIndex = i_2003;
			for (int j_2003 = i_2003 + 1; j_2003 < n_2003; j_2003++) {
			if (arr_2003[j_2003] < arr_2003 [minIndex]) {
				minIndex = j_2003;
			}
		}
		int temp_2003 = arr_2003[i_2003];
		arr_2003[i_2003] = arr_2003 [minIndex];
		
		arr_2003[minIndex] = temp_2003;
		}
	}	
	public static void main (String [] args ) {
		int arr_2003[] = {23, 78, 45, 8, 32, 56, 1};
		int n_2003 = arr_2003.length;
		System.out.printf("array yang belum terurt : \n");
		for (int i_2003 = 0; i_2003 < n_2003; i_2003++)
			System.out.print(arr_2003[i_2003] + " ");
		System.out.println ("");
		selectionSort (arr_2003);
		System.out.printf(" array yang belum terurut : \n");
		for (int i_2003 = 0; i_2003 < n_2003; i_2003++)
			System.out.print(arr_2003[i_2003] + " ");
		System.out.println("");
	}

}
