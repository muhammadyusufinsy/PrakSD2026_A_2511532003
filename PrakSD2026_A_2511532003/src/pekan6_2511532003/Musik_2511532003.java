package pekan6_2511532003;

import java.util.Scanner;

public class Musik_2511532003 {

    Lagu_2511532003 head_2003 = null;
    Lagu_2511532003 tail_2003 = null;

    // method tambah lagu di akhir
    void tambahLagu_2003(String judul_2003, String penyanyi_2003) {

        Lagu_2511532003 laguBaru_2003 =
                new Lagu_2511532003(judul_2003, penyanyi_2003);

        // jika playlist kosong
        if (head_2003 == null) {
            head_2003 = laguBaru_2003;
            tail_2003 = laguBaru_2003;
        } else {

            // hubungkan node
            tail_2003.next_2003 = laguBaru_2003;
            laguBaru_2003.prev_2003 = tail_2003;

            // pindahkan tail
            tail_2003 = laguBaru_2003;
        }

        System.out.println("Lagu berhasil ditambahkan!");
    }

    // method hapus lagu awal
    void hapusLaguAwal_2003() {

        // cek playlist kosong
        if (head_2003 == null) {
            System.out.println("Playlist kosong!");
            return;
        }

        // jika hanya satu lagu
        if (head_2003 == tail_2003) {
            head_2003 = null;
            tail_2003 = null;
        } else {

            // pindahkan head
            head_2003 = head_2003.next_2003;

            // prev dibuat null
            head_2003.prev_2003 = null;
        }

        System.out.println("Lagu pertama berhasil dihapus!");
    }

    // tampil maju
    void tampilMaju_2003() {

        if (head_2003 == null) {
            System.out.println("Playlist kosong!");
            return;
        }

        Lagu_2511532003 current_2003 = head_2003;

        System.out.println("=== Playlist Maju ===");

        while (current_2003 != null) {

            System.out.println(
                    current_2003.judul_2003 +
                    " - " +
                    current_2003.penyanyi_2003);

            current_2003 = current_2003.next_2003;
        }
    }

    // tampil mundur
    void tampilMundur_2003() {

        if (tail_2003 == null) {
            System.out.println("Playlist kosong!");
            return;
        }

        Lagu_2511532003 current_2003 = tail_2003;

        System.out.println("=== Playlist Mundur ===");

        while (current_2003 != null) {

            System.out.println(
                    current_2003.judul_2003 +
                    " - " +
                    current_2003.penyanyi_2003);

            current_2003 = current_2003.prev_2003;
        }
    }

    // cari lagu
    void cariLagu_2003(String judulCari_2003) {

        if (head_2003 == null) {
            System.out.println("Playlist kosong!");
            return;
        }

        Lagu_2511532003 current_2003 = head_2003;
        boolean ditemukan_2003 = false;

        while (current_2003 != null) {

            if (current_2003.judul_2003.equalsIgnoreCase(judulCari_2003)) {

                System.out.println("Lagu ditemukan!");
                System.out.println("Judul    : " + current_2003.judul_2003);
                System.out.println("Penyanyi : " + current_2003.penyanyi_2003);

                ditemukan_2003 = true;
                break;
            }

            current_2003 = current_2003.next_2003;
        }

        if (!ditemukan_2003) {
            System.out.println("Lagu tidak ditemukan!");
        }
    }

    // main program
    public static void main(String[] args) {

        Scanner input_2003 = new Scanner(System.in);

        Musik_2511532003 playlist_2003 =
                new Musik_2511532003();

        int pilihan_2003;

        do {

            System.out.println("\n=== Playlist Musik NIM: 2511532003 ===");
            System.out.println("1. Tambah Lagu");
            System.out.println("2. Hapus Lagu Pertama");
            System.out.println("3. Lihat Playlist (Maju)");
            System.out.println("4. Lihat Playlist (Mundur)");
            System.out.println("5. Cari Lagu");
            System.out.println("6. Keluar");

            System.out.print("Pilihan: ");
            pilihan_2003 = input_2003.nextInt();
            input_2003.nextLine();

            switch (pilihan_2003) {

                case 1:

                    System.out.print("Judul Lagu : ");
                    String judul_2003 = input_2003.nextLine();

                    System.out.print("Penyanyi   : ");
                    String penyanyi_2003 = input_2003.nextLine();

                    playlist_2003.tambahLagu_2003(
                            judul_2003,
                            penyanyi_2003);

                    break;

                case 2:

                    playlist_2003.hapusLaguAwal_2003();

                    break;

                case 3:

                    playlist_2003.tampilMaju_2003();

                    break;

                case 4:

                    playlist_2003.tampilMundur_2003();

                    break;

                case 5:

                    System.out.print("Masukkan judul lagu: ");
                    String cari_2003 = input_2003.nextLine();

                    playlist_2003.cariLagu_2003(cari_2003);

                    break;

                case 6:

                    System.out.println("Program selesai.");

                    break;

                default:

                    System.out.println("Pilihan tidak tersedia!");
            }

        } while (pilihan_2003 != 6);

        input_2003.close();
    }
}
