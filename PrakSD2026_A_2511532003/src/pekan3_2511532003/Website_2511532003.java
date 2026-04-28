package pekan3_2511532003;

public class Website_2511532003 {
	private String judul_2003;
    private String url_2003;

    public Website_2511532003(String judul, String url) {
        this.judul_2003 = judul;
        this.url_2003 = url;
    }

    public String getJudul_2003() {
        return judul_2003;
    }

    public void setJudul_2003(String judul) {
        this.judul_2003 = judul;
    }

    public String getUrl_2003() {
        return url_2003;
    }

    public void setUrl_2003(String url) {
        this.url_2003 = url;
    }

    @Override
    public String toString() {
        return "Judul: " + judul_2003 + " | URL: " + url_2003;
    }
}

