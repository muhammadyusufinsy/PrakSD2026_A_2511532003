package pekan4_2511532003;

import java.util.Scanner;

public class MainAntrian_2511532003 {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        AntrianLoket_2511532003 antrian = new AntrianLoket_2511532003(10);

	        int pilihan;

	        do {
	            System.out.println("\n=== PROGRAM ANTRIAN LOKET ===");
	            System.out.println("1. Tambah Antrian");
	            System.out.println("2. Hapus Antrian");
	            System.out.println("3. Tampilkan Antrian");
	            System.out.println("4. Reverse");
	            System.out.println("5. Keluar");
	            System.out.print("Pilih menu: ");
	            pilihan = sc.nextInt();
	            sc.nextLine();

	            switch (pilihan) {
	                case 1:
	                    System.out.print("Masukkan nama pelanggan: ");
	                    String nama = sc.nextLine();
	                    antrian.enqueue(nama);
	                    break;

	                case 2:
	                    antrian.dequeue();
	                    break;

	                case 3:
	                    antrian.display();
	                    break;

	                case 4:
	                    antrian.reverse();
	                    antrian.display();
	                    break;

	                case 5:
	                    System.out.println("Program selesai");
	                    break;

	                default:
	                    System.out.println("Pilihan tidak valid!");
	            }

	        } while (pilihan != 5);

	        sc.close();
	    }
	}

