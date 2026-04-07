package pekan2_2511532003;

import java.util.ArrayList;

public class DaftarKata_2511532003 {
	private final ArrayList <String> data;
	// konstruktor : inisisalisasi list kosong
	public DaftarKata_2511532003() {
		this.data = new ArrayList<>();
	}
	// menambahkan elemnt di akhir list
	public void tambah_2511532003(String elemen) {
		data.add(elemen);
	}
	//manambahkan elemn pada index tertentu (menyisipkan).
	public void tambahPada_2511532003 (int index, String elemen) {
		data.add(index, elemen);
	}
	//mengubah elemen pada posisi 'index' menjadi 'nilaiBaru'
	// bertindak sebagai "setter" untuk elemen tertentu.
	
	public void ubahElemen_2511532003 (int index, String nilaiBaru) {
		data.set(index,  nilaiBaru);
	}
	//menghapus elemen pada posisi 'index' dan mengembalikan nilai yang dihapus.
	
	public String hapusElemen_2511532003 (int index) {
		return data.remove(index);
	}
	//melakukan iterasidan mencetak setiap elemen dalam format : [index] nilai
	//metode ini tidak mengembalikan nilai; hanya demonstrasi iterasi.
	
	public void iterasiCetak_2511532003() {
		for (int i = 0; i < data.size(); i++) {
		System.out.print(data.get (i)+ " ");
		}
	}
	//mengambil elemen berdasarkan indeks
	public String get (int index) {
		return data.get(index);
		}
	// representasi string agar mudah dicetak
	@Override
	public String toString() {
		return data.toString();
	}
	}


