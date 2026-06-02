package pekan8_2511532003;

public class ShellSort_2511532003 {
	public static void shellSort_2511532003(int[] A) {
		int n = A.length;
		int gap = n / 2;
		while (gap > 0) {
			for (int i = gap; i < n; i++) {
				int temp = A[i];
				int j = i;
				while (j >= gap && A[j - gap] > temp) {
					A[j]= A[j - gap];
					j = j - gap;
				}
				A[j] = temp;
			}
			gap = gap / 2;
		}
	}
	
	public static void main (String[] args) {
		int [] data = {3, 10, 4, 6, 8, 9, 7, 2, 1, 5};
		
		System.out.print("sebelum:");
		printArray_2511532003(data);
		
		shellSort_2511532003(data);
		
		System.out.print("sesudah (shell sort) :");
		printArray_2511532003(data);
	}
	
	public static void printArray_2511532003(int[] arr) {
		for (int i : arr) System.out.print(i + " ");
		System.out.println();
	}

}
