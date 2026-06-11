package pekan8_2511532003;


import java.util.Scanner;

class Lagu_2003 {
    String judul_2003;
    String penyanyi_2003;
    int durasi_2003;

    public Lagu_2003(String judul_2003, String penyanyi_2003, int durasi_2003) {
        this.judul_2003 = judul_2003;
        this.penyanyi_2003 = penyanyi_2003;
        this.durasi_2003 = durasi_2003;
    }
}

public class Sorting_2511532003 {

    Lagu_2003[] dataLagu_2003 = new Lagu_2003[20];
    int jumlah_2003 = 7;

    public void inputData_2003() {
        dataLagu_2003[0] = new Lagu_2003("La Perla", "Artist A", 196);
        dataLagu_2003[1] = new Lagu_2003("Mio Cristo Piange Diamanti", "Artist B", 270);
        dataLagu_2003[2] = new Lagu_2003("La Rumba Del Perdon", "Artist C", 252);
        dataLagu_2003[3] = new Lagu_2003("Yellow", "Coldplay", 245);
        dataLagu_2003[4] = new Lagu_2003("Numb", "Linkin Park", 210);
        dataLagu_2003[5] = new Lagu_2003("Fix You", "Coldplay", 258);
        dataLagu_2003[6] = new Lagu_2003("Believer", "Imagine Dragons", 204);
    }

    public void tampilData_2003(String title) {
        System.out.println("\n=== " + title + " ===");
        for (int i_2003 = 0; i_2003 < jumlah_2003; i_2003++) {
            System.out.println((i_2003 + 1) + ". " +
                dataLagu_2003[i_2003].judul_2003 +
                " - " +
                dataLagu_2003[i_2003].durasi_2003 +
                " detik");
        }
    }

    public void shellSort_2003() {
        int n_2003 = jumlah_2003;
        int gap_2003 = n_2003 / 2;

        while (gap_2003 > 0) {
            for (int i_2003 = gap_2003; i_2003 < n_2003; i_2003++) {
                Lagu_2003 temp_2003 = dataLagu_2003[i_2003];
                int j_2003 = i_2003;

                while (j_2003 >= gap_2003 &&
                        dataLagu_2003[j_2003 - gap_2003].judul_2003
                        .compareTo(temp_2003.judul_2003) > 0) {

                    dataLagu_2003[j_2003] = dataLagu_2003[j_2003 - gap_2003];
                    j_2003 -= gap_2003;
                }

                dataLagu_2003[j_2003] = temp_2003;
            }
            gap_2003 /= 2;
        }
    }

    public static void main(String[] args) {
        Sorting_2511532003 obj_2003 = new Sorting_2511532003();

        obj_2003.inputData_2003();

        obj_2003.tampilData_2003("Data Sebelum Sorting");

        obj_2003.shellSort_2003();

        obj_2003.tampilData_2003("Data Setelah Shell Sort (Judul A-Z)");
    }
}
