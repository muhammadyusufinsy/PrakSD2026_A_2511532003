package Pekan5_2511532003;
import java.util.Scanner;

public class RumahSakit_2511532003 {
	static Pasien_2511532003 head_2003 = null;
    static int counter_2003 = 0;

    // Insert at Tail
    public static void daftarkanPasien_2003(String nama_2003, String penyakit_2003) {

        counter_2003++;

        Pasien_2511532003 pasienBaru_2003 =
                new Pasien_2511532003(nama_2003, penyakit_2003, counter_2003);

        // Jika list kosong
        if (head_2003 == null) {
            head_2003 = pasienBaru_2003;
        } else {

            // Menelusuri sampai node terakhir
            Pasien_2511532003 bantu_2003 = head_2003;

            while (bantu_2003.next_2003 != null) {
                bantu_2003 = bantu_2003.next_2003;
            }

            // Sambungkan node terakhir ke node baru
            bantu_2003.next_2003 = pasienBaru_2003;
        }

        System.out.println("Pasien berhasil didaftarkan!");
        System.out.println("Nomor Antrian : " + counter_2003);
    }

    // Delete Head
    public static void panggilPasien_2003() {

        if (head_2003 == null) {
            System.out.println("Antrian kosong!");
        } else {

            System.out.println("Pasien Dipanggil:");
            System.out.println("Nomor Antrian : " + head_2003.getNomorAntrian_2003());
            System.out.println("Nama          : " + head_2003.getNamaPasien_2003());
            System.out.println("Keluhan       : " + head_2003.getPenyakit_2003());

            // Geser head ke node berikutnya
            head_2003 = head_2003.next_2003;
        }
    }

    // Display
    public static void tampilkanAntrian_2003() {

        if (head_2003 == null) {
            System.out.println("Antrian masih kosong!");
        } else {

            Pasien_2511532003 bantu_2003 = head_2003;
            int posisi_2003 = 1;

            System.out.println("\n=== DAFTAR ANTRIAN PASIEN ===");

            while (bantu_2003 != null) {

                System.out.println("Posisi Antrian : " + posisi_2003);
                System.out.println("Nomor Antrian  : " + bantu_2003.getNomorAntrian_2003());
                System.out.println("Nama Pasien    : " + bantu_2003.getNamaPasien_2003());
                System.out.println("Keluhan        : " + bantu_2003.getPenyakit_2003());
                System.out.println("-----------------------------");

                bantu_2003 = bantu_2003.next_2003;
                posisi_2003++;
            }
        }
    }

    // Search
    public static void cariPasien_2003(String namaCari_2003) {

        if (head_2003 == null) {
            System.out.println("Antrian kosong!");
            return;
        }

        Pasien_2511532003 bantu_2003 = head_2003;
        boolean ditemukan_2003 = false;

        while (bantu_2003 != null) {

            // Case-Insensitive
            if (bantu_2003.getNamaPasien_2003().equalsIgnoreCase(namaCari_2003)) {

                System.out.println("Pasien ditemukan!");
                System.out.println("Nomor Antrian : " + bantu_2003.getNomorAntrian_2003());
                System.out.println("Nama          : " + bantu_2003.getNamaPasien_2003());
                System.out.println("Keluhan       : " + bantu_2003.getPenyakit_2003());

                ditemukan_2003 = true;
                break;
            }

            bantu_2003 = bantu_2003.next_2003;
        }

        if (!ditemukan_2003) {
            System.out.println("Pasien tidak ditemukan!");
        }
    }

    // Cek Status Antrian
    public static void cekStatusAntrian_2003() {

        if (head_2003 == null) {
            System.out.println("Antrian kosong!");
            return;
        }

        Pasien_2511532003 bantu_2003 = head_2003;
        int jumlah_2003 = 0;

        while (bantu_2003 != null) {
            jumlah_2003++;
            bantu_2003 = bantu_2003.next_2003;
        }

        System.out.println("Jumlah Pasien Dalam Antrian : " + jumlah_2003);
        System.out.println("Pasien Terdepan             : "
                + head_2003.getNamaPasien_2003());
    }

    // Main Program
    public static void main(String[] args) {

        Scanner input_2003 = new Scanner(System.in);

        int pilihan_2003;

        do {

            System.out.println("\n=== Antrian Rumah Sakit NIM: 2511532003 ===");
            System.out.println("1. Daftarkan Pasien (Insert)");
            System.out.println("2. Panggil Pasien (Delete Head)");
            System.out.println("3. Tampilkan Antrian (Display)");
            System.out.println("4. Cari Pasien (Search)");
            System.out.println("5. Cek Status Antrian");
            System.out.println("6. Keluar");
            System.out.print("Pilihan : ");

            pilihan_2003 = input_2003.nextInt();
            input_2003.nextLine();

            switch (pilihan_2003) {

                case 1:

                    System.out.print("Masukkan Nama Pasien : ");
                    String nama_2003 = input_2003.nextLine();

                    System.out.print("Masukkan Keluhan     : ");
                    String keluhan_2003 = input_2003.nextLine();

                    daftarkanPasien_2003(nama_2003, keluhan_2003);

                    break;

                case 2:

                    panggilPasien_2003();

                    break;

                case 3:

                    tampilkanAntrian_2003();

                    break;

                case 4:

                    System.out.print("Masukkan Nama Pasien yang Dicari : ");
                    String cari_2003 = input_2003.nextLine();

                    cariPasien_2003(cari_2003);

                    break;

                case 5:

                    cekStatusAntrian_2003();

                    break;

                case 6:

                    System.out.println("Program selesai.");

                    break;

                default:

                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan_2003 != 6);

        input_2003.close();
    }
}


