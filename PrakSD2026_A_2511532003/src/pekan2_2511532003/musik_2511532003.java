package pekan2_2511532003;

public class musik_2511532003 {
	 private String judul_2003;
	    private String penyanyi_2003;
	    private int durasi_2003;

	    public musik_2511532003 (String judul, String penyanyi, int durasi) {
	        this.judul_2003 = judul;
	        this.penyanyi_2003 = penyanyi;
	        this.durasi_2003 = durasi;
	    }

	    public String getJudul_2003() {
	        return judul_2003;
	    }

	    public void setJudul_2003(String judul) {
	        this.judul_2003 = judul;
	    }

	    public String getPenyanyi_2003() {
	        return penyanyi_2003;
	    }

	    public void setPenyanyi_2003(String penyanyi) {
	        this.penyanyi_2003 = penyanyi;
	    }

	    public int getDurasi_2003() {
	        return durasi_2003;
	    }

	    public void setDurasi_2003(int durasi) {
	        this.durasi_2003 = durasi;
	    }

	    @Override
	    public String toString() {
	        return "Judul: " + judul_2003 + ", Penyanyi: " + penyanyi_2003 + ", Durasi: " + durasi_2003 + " detik";
	    }
	}


