package pekan7_2511532003;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class SortingGui_2511532003 extends JFrame {

	 private JTextField namaField_2003, nimField_2003, prodiField_2003;
	    private JTextArea outputArea_2003;
	    private JComboBox<String> sortBox_2003;

	    private ArrayList<Mahasiswa_2511532003> data_2003 = new ArrayList<>();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SortingGui_2511532003 frame = new SortingGui_2511532003();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SortingGui_2511532003() {
		setTitle("Sorting Mahasiswa");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        add(new JLabel("Nama"));
        namaField_2003 = new JTextField(15);
        add(namaField_2003);

        add(new JLabel("NIM"));
        nimField_2003 = new JTextField(15);
        add(nimField_2003);

        add(new JLabel("Prodi"));
        prodiField_2003 = new JTextField(15);
        add(prodiField_2003);

        JButton tambahBtn_2003 = new JButton("Tambah");
        add(tambahBtn_2003);

        sortBox_2003 = new JComboBox<>(new String[]{
                "Insertion Sort",
                "Selection Sort",
                "Bubble Sort"
        });
        add(sortBox_2003);

        JButton sortBtn_2003 = new JButton("Mulai Sorting");
        add(sortBtn_2003);

        outputArea_2003 = new JTextArea(20, 55);
        outputArea_2003.setEditable(false);
        add(new JScrollPane(outputArea_2003));

        tambahBtn_2003.addActionListener(e -> tambahData_2003());
        sortBtn_2003.addActionListener(e -> prosesSorting_2003());
    }

    private void tambahData_2003() {
        data_2003.add(new Mahasiswa_2511532003(
                namaField_2003.getText(),
                nimField_2003.getText(),
                prodiField_2003.getText()
        ));

        outputArea_2003.append("Data ditambahkan\n");

        namaField_2003.setText("");
        nimField_2003.setText("");
        prodiField_2003.setText("");
    }

    private void prosesSorting_2003() {
        String pilihan = (String) sortBox_2003.getSelectedItem();

        if (pilihan.equals("Insertion Sort")) {
            insertionSort_2003();
        } else if (pilihan.equals("Selection Sort")) {
            selectionSort_2003();
        } else {
            bubbleSort_2003();
        }
    }

    private void tampilkanLangkah_2003(String langkah) {
        outputArea_2003.append(langkah + "\n");
    }

    private String tampilData_2003() {
        StringBuilder sb = new StringBuilder();
        for (Mahasiswa_2511532003 m : data_2003) {
            sb.append(m.getNama_2003()).append(" ");
        }
        return sb.toString();
    }

    private void insertionSort_2003() {
        outputArea_2003.setText("=== INSERTION SORT ===\n");

        for (int i = 1; i < data_2003.size(); i++) {
            Mahasiswa_2511532003 key = data_2003.get(i);
            int j = i - 1;

            while (j >= 0 &&
                    data_2003.get(j).getNama_2003()
                            .compareToIgnoreCase(key.getNama_2003()) > 0) {
                data_2003.set(j + 1, data_2003.get(j));
                j--;
            }

            data_2003.set(j + 1, key);
            tampilkanLangkah_2003("Langkah " + i + ": " + tampilData_2003());
        }
    }

    private void selectionSort_2003() {
        outputArea_2003.setText("=== SELECTION SORT ===\n");

        for (int i = 0; i < data_2003.size(); i++) {
            int min = i;

            for (int j = i + 1; j < data_2003.size(); j++) {
                if (data_2003.get(j).getNama_2003()
                        .compareToIgnoreCase(data_2003.get(min).getNama_2003()) < 0) {
                    min = j;
                }
            }

            Mahasiswa_2511532003 temp = data_2003.get(i);
            data_2003.set(i, data_2003.get(min));
            data_2003.set(min, temp);

            tampilkanLangkah_2003("Pass " + (i + 1) + ": " + tampilData_2003());
        }
    }

    private void bubbleSort_2003() {
        outputArea_2003.setText("=== BUBBLE SORT ===\n");

        for (int i = 0; i < data_2003.size(); i++) {
            for (int j = 0; j < data_2003.size() - i - 1; j++) {

                if (data_2003.get(j).getNama_2003()
                        .compareToIgnoreCase(data_2003.get(j + 1).getNama_2003()) > 0) {

                    Mahasiswa_2511532003 temp = data_2003.get(j);
                    data_2003.set(j, data_2003.get(j + 1));
                    data_2003.set(j + 1, temp);
                }
            }

            tampilkanLangkah_2003("Pass " + (i + 1) + ": " + tampilData_2003());
        }
    }
}
