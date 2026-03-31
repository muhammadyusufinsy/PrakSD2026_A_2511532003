package pekan1_2511532003;

import java.util.Scanner;

public class jamDriver2_2511532003 {
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		System.out.println ("=== Program Driver Objek Jam ===");
		//1. input jam pertama
		System.out.println("\n--- input jam 1 ---");
		jam_2511532003 j1 = buatJamDariInput(input);
		
		// 2. input jam kedua
		System.out.println ("\n--- input jam 2 ---");
		jam_2511532003 j2 = buatJamDariInput(input);
		
		//3. menampilkan data 
		System.out.println("\n--- Hasil Operasi ---");
		System.out.println("jam 1 (String)       :" + j1.toString());
		System.out.println("jam 2 (String)       :" + j2.toString());
		System.out.println("jam 1 dalam detik    :" + j1.toSeconds());
		System.out.println("jam 2 dalam detik    :" + j2.toSeconds());
		
		// 4. Operasi Relasional (perbandingan)
		int perbandingan = j1.compareTo(j2);
		if (perbandingan > 0) {
			System.out.println("status               : jam 1 lebih lambat (setelah) jam 2");
		} else if (perbandingan < 0) {
			System.out.println("status               : jam 1 lebih awal (sebelum) jam 2");
		} else {
			System.out.println("status               : jam 1 dan jam 2 sama persis");
		}
		
		// 5. Operasi Aritmatika 
		System.out.println("durasi (J1 ke J2      : " + jam_2511532003.durasiDetik(j1, j2) + "detik");
		
		jam_2511532003 jNext = j1.nextSecond();
		System.out.println ("jam 1 Detik Berikutnya:" + jNext);

		jam_2511532003 jprev = j1.prevSecond();
		System.out.println ("jam 1 Detik Berikutnya:" + jprev);
		
		// 6. Operasi Penjumlahan Jam
		
		jam_2511532003 jHasilPlus = j1.plus(j2);
		System.out.println ("hasil J1 + J2        : " + jHasilPlus);
		
		input.close();
		System.out.println("\nProgram Selesai");
	}
	
//	prosedur pembantu untuk melakukan input dan validasi secara berulang
//	sampai user memasukan angka yang benae (0..23,0..59)
	
	private static jam_2511532003 buatJamDariInput (Scanner sc) {
		int h, m, s;
		while (true) {
			System.out.print("masukan jam (0-23    :");
			h = sc.nextInt();
			System.out.print("masukan menit (0-59    :");
			m = sc.nextInt();
			System.out.print("masukan detik (0-59    :");
			s = sc.nextInt();
			
			// memanggil method static isValid dari kelas jam
			if (jam_2511532003.isValid (h, m, s)) {
			return new jam_2511532003 (h, m, s);
			} else {
				System.out.println("[error] input tidak valid! silahkan ulangi. \n ");
		}
		}
		
	}

}
