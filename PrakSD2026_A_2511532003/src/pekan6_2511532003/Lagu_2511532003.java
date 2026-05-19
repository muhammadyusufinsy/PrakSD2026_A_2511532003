package pekan6_2511532003;

public class Lagu_2511532003 {

    // atribut lagu
    String judul_2003;
    String penyanyi_2003;

    // pointer DLL
    Lagu_2511532003 next_2003;
    Lagu_2511532003 prev_2003;

    // constructor
    public Lagu_2511532003(String judul_2003, String penyanyi_2003) {
        this.judul_2003 = judul_2003;
        this.penyanyi_2003 = penyanyi_2003;
        this.next_2003 = null;
        this.prev_2003 = null;
    }

    // getter judul
    public String getJudul_2003() {
        return judul_2003;
    }

    // setter judul
    public void setJudul_2003(String judul_2003) {
        this.judul_2003 = judul_2003;
    }

    // getter penyanyi
    public String getPenyanyi_2003() {
        return penyanyi_2003;
    }

    // setter penyanyi
    public void setPenyanyi_2003(String penyanyi_2003) {
        this.penyanyi_2003 = penyanyi_2003;
    }
}
