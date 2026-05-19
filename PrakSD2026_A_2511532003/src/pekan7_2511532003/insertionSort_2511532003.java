package pekan7_2511532003;

public class insertionSort_2511532003 {
	public static void insertionSort (int [] arr_2003) {
		int n_2003 = arr_2003.length;
		for (int i_2003 = 1; i_2003 < n_2003; i_2003++) {
			int key_2003 = arr_2003[i_2003];
			int j_2003 = i_2003 - 1;
			while (j_2003 >= 0 && arr_2003 [j_2003] > key_2003) {
				arr_2003[j_2003 + 1] = arr_2003 [j_2003];
				j_2003--;
			}
			arr_2003 [ j_2003 + 1] = key_2003;
		}
		
	}
	public static void main (String [] args ) {
		int arr_2003 [] = {23, 78, 45, 8, 32, 56, 1 };
		int n_2003 = arr_2003.length;
		System.out.printf("array yang belum terurut :\n");
		for (int i_2003 = 0; i_2003 < n_2003; i_2003++)
			System.out.print(arr_2003[i_2003] + ",");
		insertionSort (arr_2003);
		System.out.printf("\narray yang terurut : \n");
		for (int i_2003 = 0; i_2003 < n_2003; i_2003++)
			System.out.print(arr_2003[i_2003] + ",");
	}

}
