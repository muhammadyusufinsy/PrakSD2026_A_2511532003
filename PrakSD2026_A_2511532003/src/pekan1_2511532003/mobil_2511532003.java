package pekan1_2511532003;

import java.util.ArrayList;

public class mobil_2511532003 {

    // atribut
    private String nama;
    private int tahun;
    private int cc;
    private double harga;
    private String merk;

    // list untuk simpan banyak mobil
    private static ArrayList<mobil_2511532003> daftarMobil = new ArrayList<>();

    // konstruktor
    public mobil_2511532003(String nama, int tahun, int cc, double harga, String merk) {
        this.nama = nama;
        this.tahun = tahun;
        this.cc = cc;
        this.harga = harga;
        this.merk = merk;
    }

    // --- selector (getter) ---
    public String getNama() { return nama; }
    public int getTahun() { return tahun; }
    public int getCc() { return cc; }
    public double getHarga() { return harga; }
    public String getMerk() { return merk; }

    // --- mutator (setter) ---
    public void setNama(String nama) { this.nama = nama; }
    public void setTahun(int tahun) { this.tahun = tahun; }
    public void setCc(int cc) { this.cc = cc; }
    public void setHarga(double harga) { this.harga = harga; }
    public void setMerk(String merk) { this.merk = merk; }

    // --- method tambah mobil ---
    public static void tambahMobil(mobil_2511532003 m) {
        daftarMobil.add(m);
    }

    // --- method hapus mobil ---
    public static void hapusMobil(String nama) {
        daftarMobil.removeIf(m -> m.getNama().equalsIgnoreCase(nama));
    }

    // --- tampilkan semua mobil ---
    public static void tampilkanMobil() {
        for (mobil_2511532003 m : daftarMobil) {
            System.out.println(m);
        }
    }

    // toString
    public String toString() {
        return nama + ", " + tahun + ", " + cc + "cc, " + harga + ", " + merk;
    }
}
