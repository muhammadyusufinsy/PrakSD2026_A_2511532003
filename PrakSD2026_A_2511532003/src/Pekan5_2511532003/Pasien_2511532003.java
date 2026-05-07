package Pekan5_2511532003;


public class Pasien_2511532003 {



	    private String namaPasien_2003;
	    private String penyakit_2003;
	    private int nomorAntrian_2003;

	    // Pointer next
	    Pasien_2511532003 next_2003;

	    // Constructor
	    public Pasien_2511532003(String namaPasien_2003, String penyakit_2003, int nomorAntrian_2003) {
	        this.namaPasien_2003 = namaPasien_2003;
	        this.penyakit_2003 = penyakit_2003;
	        this.nomorAntrian_2003 = nomorAntrian_2003;
	        this.next_2003 = null;
	    }

	    // Getter
	    public String getNamaPasien_2003() {
	        return namaPasien_2003;
	    }

	    public String getPenyakit_2003() {
	        return penyakit_2003;
	    }

	    public int getNomorAntrian_2003() {
	        return nomorAntrian_2003;
	    }

	    public Pasien_2511532003 getNext_2003() {
	        return next_2003;
	    }

	    // Setter
	    public void setNamaPasien_2003(String namaPasien_2003) {
	        this.namaPasien_2003 = namaPasien_2003;
	    }

	    public void setPenyakit_2003(String penyakit_2003) {
	        this.penyakit_2003 = penyakit_2003;
	    }

	    public void setNomorAntrian_2003(int nomorAntrian_2003) {
	        this.nomorAntrian_2003 = nomorAntrian_2003;
	    }

	    public void setNext_2003(Pasien_2511532003 next_2003) {
	        this.next_2003 = next_2003;
	    }
	}


