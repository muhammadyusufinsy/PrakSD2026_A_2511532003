package pekan2_2511532003;

import java.util.ArrayList;
import java.util.Scanner;

public class Playlist_2511532003 {
	public static void main(String[] args) {
        ArrayList<musik_2511532003> playlist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("=== Playlist Musik NIM: 2511532003 ===");
            System.out.println("1. Tambah Lagu");
            System.out.println("2. Lihat Playlist");
            System.out.println("3. Hapus Lagu");
            System.out.println("4. Cek Kapasitas");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Judul: ");
                    String judul = sc.nextLine();
                    System.out.print("Masukkan Penyanyi: ");
                    String penyanyi = sc.nextLine();
                    System.out.print("Masukkan Durasi: ");
                    int durasi = sc.nextInt();
                    sc.nextLine();

                    playlist.add(new musik_2511532003(judul, penyanyi, durasi));
                    System.out.println("Data berhasil ditambahkan!");
                    break;

                case 2:
                    if (playlist.isEmpty()) {
                        System.out.println("Playlist kosong.");
                    } else {
                        for (int i = 0; i < playlist.size(); i++) {
                            System.out.println((i + 1) + ". " + playlist.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Masukkan nomor lagu yang akan dihapus: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    if (index > 0 && index <= playlist.size()) {
                        playlist.remove(index - 1);
                        System.out.println("Data berhasil dihapus!");
                    } else {
                        System.out.println("Index tidak valid!");
                    }
                    break;

                case 4:
                    System.out.println("Jumlah lagu dalam playlist: " + playlist.size());
                    break;

                case 5:
                    System.out.println("Keluar program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);

        sc.close();
    }
}


