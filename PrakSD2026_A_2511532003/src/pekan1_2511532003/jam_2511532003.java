package pekan1_2511532003;

public final class jam_2511532003 {
	private int hh; // 0...23
	private int mm; // o..59
	private int ss; // 0..59
	
	//---validator---
	public static boolean isValid(int h, int m, int s) {
		return (0 <= h && h <= 23) && (0 <= m && m <= 59) && (0 <= s && s <= 59);
	}

	//---konstruktor/kreator---
	public jam_2511532003 (int h, int m, int s) {
		this.hh = h;this.mm = m;this.ss = s;
	}
	
	//---selector---
	public int getHour() {return hh;}
	public int getMinute() {return mm;}
	public int getSecond() {return ss;}
	
	//---mutator---
	public void setHour (int h) {this.hh = h;}
	public void setMinute (int m) {this.mm = m;}
	public void setSecond (int s) {this.ss = s;}
	
	//---konversi---
	public int toSeconds () {return hh * 3600 + mm * 60 + ss;}
	public static jam_2511532003 fromSeconds (int total) {
		if (total < 0) throw new IllegalArgumentException ("detik negatif ");
		total %=24 * 3600;
		int h = total / 3600; total %= 3600;
		int m = total / 60; int s = total % 60;
		return new jam_2511532003 (h, m, s);
		
	}
	
	//---relasional---
	public int compareTo (jam_2511532003 other) {return Integer.compare(this.toSeconds(), other.toSeconds());}
	public boolean equals(Object o) {
		if (!(o instanceof jam_2511532003 j)) return false;
		return hh == j.hh && mm == j.mm && ss == j.ss;
	}
	 public int hashCode () { return java.util.Objects.hash(hh, mm, ss);}
	 
	 //---Aritmatika---
	 public jam_2511532003 plus(jam_2511532003 other) {return fromSeconds(this.toSeconds() + other.toSeconds());}
	 public jam_2511532003 minus(jam_2511532003 other) {return fromSeconds (Math.floorMod(this.toSeconds() - other.toSeconds(), 24*3600));}
	 public jam_2511532003 nextSecond () {return fromSeconds(this.toSeconds() + 1);}
	 public jam_2511532003 nextNSeconds (int n) {return fromSeconds(this.toSeconds() + Math.max(0, n));}
	 public jam_2511532003 prevSecond () {return fromSeconds(Math.floorMod(this.toSeconds()- 1, 24*3600));}
	 public jam_2511532003 prevNSeconds (int n) {return fromSeconds(Math.floorMod(this.toSeconds() - Math.max(0, n),  24*3600));}
	 
	 //--- durasi (detik) -- bisa negatif jika this > other? sesuai spesifikasidurasi(JAw, JAjh
	 public static int durasiDetik(jam_2511532003 jaw, jam_2511532003 jakh) {return jakh.toSeconds() - jaw.toSeconds();}
	 //ocerrideing ke string
	 public String toString() {return String.format("%02d:%02d:%02d", hh, mm, ss);}
	 
	 
	
	}
