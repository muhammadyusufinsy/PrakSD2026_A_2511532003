package pekan2_2511532003;

import java.util.ArrayList;
import java.util.Scanner;

public class MahasiswaDriver_2511532003 {
	// 1. method untuk menampilkan menu
	public static void tampilkanMenu_2511532003() {
		System.out.println ("\nMenu:");
		System.out.println ("1. tambah mahasiswa");
		System.out.println ("2. tampilkan semua mahasiswa");
		System.out.println ("3. hapus mahasiswa berdasarkan NIM");
		System.out.println ("4. cari mahasiwa berdasasrkan NIM");
		System.out.println ("5. keluar");
	}
	
	// 2. method untuk tambah mahasiswa
	public static void tambahMahasiswa_2511532003 (ArrayList<Mahasiswa_2511532003> list, Scanner sc) {
		System.out.println ("masukan NIM :");
		String nim = sc.nextLine();
		System.out.println ("masukan nama:");
		String nama = sc.nextLine();
		System.out.println ("masukan prodi :");
		String prodi = sc.nextLine();
		list.add(new Mahasiswa_2511532003 (nim, nama, prodi));
		System.out.println("mahasiswa berhasil ditambahkan.");
		
	}
	// 3. method untuk tampilkan semua data
	public static void tampilkanSemuaMahasiswa_2511532003 (ArrayList<Mahasiswa_2511532003> list) {
		if (list.isEmpty()) {
			System.out.println("daftar mahasiswa kosong");
		}else {
			System.out.println ("data mahasiswa:");
			for (Mahasiswa_2511532003 mhs : list) {
				System.out.println(mhs);
			}
		}
		
	}
	
	// 4. method untuk hapus mahasiswa berdasarkan nim
	public static void hapusMahasiswa_2511532003 (ArrayList<Mahasiswa_2511532003> list, Scanner sc) {
		System.out.print("masukan NIM yang akan di hapus :");
		String nimHapus = sc.nextLine();
		boolean removed = list.removeIf(mhs -> mhs.nim.equals(nimHapus));
		
		if (removed ) {
			System.out.println ("data dengan NIM " + nimHapus + " berhasil dihapus.");
		}else {
			System.out.println("NIM tidak dapat ditemukan.");
		}
	}
	// 5. method untuk cari mahasiswa berdasarkan NIM
	public static void cariMahasiswa_2511532003 (ArrayList<Mahasiswa_2511532003> list, Scanner sc) {
		System.out.print("Masukan Nim yang dicari : ");
		String nimCari = sc.nextLine();
		boolean ditemukan = false;
		
		for (Mahasiswa_2511532003 mhs : list) {
			if (mhs.nim.equals(nimCari)) {
				System.out.println ("hasil pencarian : " + mhs );
				ditemukan = true;
				break;
			}
		}
		if (!ditemukan) {
			System.out.println("NIM tidak ada");
			
		}
	}
	public static void main (String [] args) {
		ArrayList<Mahasiswa_2511532003> mahasiswaList = new ArrayList<> ();
		Scanner scanner = new Scanner (System.in);
		int choice;
		
		do {
			tampilkanMenu_2511532003();
			System.out.print("pilih menu :");
			choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
			case 1 :
				tambahMahasiswa_2511532003 (mahasiswaList, scanner);
				break;
			case 2 : 
				tampilkanSemuaMahasiswa_2511532003(mahasiswaList);
				break;
			case 3 :
				hapusMahasiswa_2511532003(mahasiswaList, scanner);
				break;
			case 4 :
				cariMahasiswa_2511532003 ( mahasiswaList, scanner);
				break;
			case 5 :
				System.out.println ("keluar dari program.");
				break;
			default : 
				System.out.println ("pilihan tidak valid.");	
			}
		} while (choice != 5);
		scanner.close();
		
	
	}

}
