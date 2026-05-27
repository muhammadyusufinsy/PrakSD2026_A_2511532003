package pekan7_2511532003;

public class Mahasiswa_2511532003 {
    private String nama_2003;
    private String nim_2003;
    private String prodi_2003;

    public Mahasiswa_2511532003(String nama_2003, String nim_2003, String prodi_2003) {
        this.nama_2003 = nama_2003;
        this.nim_2003 = nim_2003;
        this.prodi_2003 = prodi_2003;
    }

    public String getNama_2003() {
        return nama_2003;
    }

    public String getNim_2003() {
        return nim_2003;
    }

    public String getProdi_2003() {
        return prodi_2003;
    }

    @Override
    public String toString() {
        return nama_2003 + " | " + nim_2003 + " | " + prodi_2003;
    }
}