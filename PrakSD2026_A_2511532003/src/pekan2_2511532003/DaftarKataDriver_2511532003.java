package pekan2_2511532003;

public class DaftarKataDriver_2511532003 {
	public static void main (String [] args) {
		DaftarKata_2511532003 a1 = new DaftarKata_2511532003();
		
		// menambahkan elemen (akhir)
		a1.tambah_2511532003 ("kami");
		a1.tambah_2511532003("informatika");
		
		//menyisipkan elemen pada indeks
		a1.tambahPada_2511532003(1,  "mahasiswa");
		
		//cetak isi awal
		System.out.println ("awal  : " + a1);
		
		// mengubah elemen (index 1)
		a1.ubahElemen_2511532003(1, "department");
		System.out.println("setelah ubah : " +a1);
		 
		//menghapus elemen (hapus index 0)
		String terhapus = a1.hapusElemen_2511532003(0);
		System.out.println("terhapus : " + terhapus);
		System.out.println("setelah hapus : " + a1);
		
		// iterasi pada ArrayList (cetak setiap elemen)
		System.out.print("iterasi:");
		a1.iterasiCetak_2511532003();
		System.out.println();
	}

}
