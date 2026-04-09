package pekan3_2511532003;

import java.util.ArrayList;

class Siswa_2003{
	String nama_2003;
	int nim_2003;
	
	public Siswa_2003 (String nama_2003, int nim_2003) {
		this.nama_2003 = nama_2003;
		this.nim_2003 = nim_2003;
	}
	
	@Override
	public String toString() {
		return "Nim: " + nim_2003 + ", Nama: " + nama_2003;
	}
}


public class SiswaStack_2511532003 {
private ArrayList<Siswa_2003> stack_2003;
	
	public SiswaStack_2511532003() {
		stack_2003 = new ArrayList<>();
	}
	
	public void push_2003(Siswa_2003 mhs) {
		stack_2003.add(mhs);
	}
	public Siswa_2003 pop () {
		if (!isEmpty() ) {
			return stack_2003.remove(stack_2003.size() - 1);
		}
		return null;
	}
	public Siswa_2003 peek() {
		if (!isEmpty()) {
			return stack_2003.get(stack_2003.size() - 1);
		}
		return null;
	}
	
	public boolean isEmpty() {
		return stack_2003.isEmpty();
	}
	
	public void tampilkanSiswa_2003() {
		for (int i = stack_2003.size() - 1; i >= 0; i--) {
			System.out.println(stack_2003.get(i));
		}
	}
	public static void main (String[] args) {
		SiswaStack_2511532003 studentStack_2003 = new SiswaStack_2511532003();
		
		Siswa_2003 mhs1_2003 = new Siswa_2003("Ali", 1);
		Siswa_2003 mhs2_2003 = new Siswa_2003("Boby", 2);
		Siswa_2003 mhs3_2003 = new Siswa_2003("Charles", 3);
		studentStack_2003.push_2003(mhs1_2003);
		studentStack_2003.push_2003(mhs2_2003);
		studentStack_2003.push_2003(mhs3_2003);
		
		System.out.println("Siswa di dalam staack:");
		studentStack_2003.tampilkanSiswa_2003();
		
		System.out.println("siswa teratas " + studentStack_2003.peek());
		studentStack_2003.tampilkanSiswa_2003();
		
		System.out.println("siswa teratas " + studentStack_2003.peek());
		System.out.println("mengeluarkan siswa teratas dari stack: " + studentStack_2003.pop());
		System.out.println("daftar siswa setelah di pop : ");
		studentStack_2003.tampilkanSiswa_2003();
	}



}
