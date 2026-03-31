package pekan1_2511532003;

public class driver_2511532003 {

    public static void main(String[] args) {

        // buat objek mobil
        mobil_2511532003 m1 = new mobil_2511532003("Avanza", 2020, 1300, 150000000, "Toyota");
        mobil_2511532003 m2 = new mobil_2511532003("Brio", 2022, 1200, 170000000, "Honda");

        // tambah mobil
        mobil_2511532003.tambahMobil(m1);
        mobil_2511532003.tambahMobil(m2);

        System.out.println("=== Daftar Mobil ===");
        mobil_2511532003.tampilkanMobil();

        // hapus mobil
        mobil_2511532003.hapusMobil("Avanza");

        System.out.println("\n=== Setelah Hapus Avanza ===");
        mobil_2511532003.tampilkanMobil();
    }
}
