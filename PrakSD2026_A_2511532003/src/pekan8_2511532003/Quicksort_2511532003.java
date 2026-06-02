package pekan8_2511532003;

public class Quicksort_2511532003 {
	static void swap (int[] arr, int i, int j) 
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	// metode tambahan untuk mengatur pivot menggunakan median of three
	static void medianOfThree_2511532003 (int[] arr, int low, int high)
	{
		int mid = low + (high - low) / 2;
		
		// urutkan elemen low, mid, dan higt
		if (arr[low] > arr[mid]) {
			swap (arr, low, mid);
		}
		if (arr[low] > arr[high]) {
			swap(arr, low, high);
		}
		if (arr[mid] > arr[high]) {
			swap(arr, mid, high);
		}
		swap(arr, mid, high);
	}
	static int partition_2511532003 (int[] arr, int low, int high)
	{
		// panggil fungsi medianOfThree sebelum menentukan pivot
		medianOfThree_2511532003(arr, low, high);
		
		int pivot = arr[high];
		int i = (low - 1);
		
		for (int j = low; j <= high - 1; j++) {
			// jika elemen saat ini lebih kecil dari atau sama dengan pivot
			if(arr[j] < pivot ) {
				// increment indeks elemen yang lebih kecil
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);
		return (i + 1);
	}
	
	static void quickSort_2511532003(int[] arr, int low, int high)
	{
		if (low < high) {
			int pi = partition_2511532003(arr, low, high);
			quickSort_2511532003(arr, low, pi -1);
			quickSort_2511532003(arr, pi + 1, high);
		}
	}
	
	public static void printArr_2511532003(int[] arr)
	{
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main (String[] args)
	{
		int [] arr = {10, 7, 8, 9, 1, 5, };
		int N = arr.length;
		System.out.print("data sebelum di urutkan: ");
		printArr_2511532003(arr);
		
		quickSort_2511532003(arr, 0, N - 1);
		
		System.out.print("data terurut quictsort: ");
		printArr_2511532003(arr);
	}

}
