package pekan8_2511532003;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class MergeSortGUI_2511532003 extends JFrame {
    private static final long serialVersionUID = 1L;
    private int[] array_2003;
    private JLabel[] labelArray_2003;
    private JButton stepButton_2003, resetButton_2003, setButton_2003;
    private JTextField inputField_2003;
    private JPanel panelArray_2003;
    private JTextArea stepArea_2003;

    private int i_2003, j_2003, k_2003;
    private int left_2003, mid_2003, right_2003;
    private int[] temp_2003;
    
    private boolean isMerging_2003 = false;
    private boolean copying_2003 = false;
    
    private int stepCount_2003= 1;
    private Queue<int[]> mergeQueue = new LinkedList<>();

    public MergeSortGUI_2511532003() {
        setTitle("Merge Sort Langkah per Langkah");
        setSize(750, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new FlowLayout());
        inputField_2003 = new JTextField(30);
        setButton_2003 = new JButton("Set Array");
        inputPanel.add(new JLabel("Masukkan angka (pisahkan dengan koma):"));
        inputPanel.add(inputField_2003);
        inputPanel.add(setButton_2003);

        panelArray_2003 = new JPanel();
        panelArray_2003.setLayout(new FlowLayout());

        JPanel controlPanel = new JPanel();
        stepButton_2003 = new JButton("Langkah Selanjutnya");
        resetButton_2003 = new JButton("Reset");
        stepButton_2003.setEnabled(false);
        controlPanel.add(stepButton_2003);
        controlPanel.add(resetButton_2003);

        stepArea_2003 = new JTextArea(8, 60);
        stepArea_2003.setEditable(false);
        stepArea_2003.setFont(new Font("Monospaced", Font.PLAIN, 14));
        JScrollPane scrollPane = new JScrollPane(stepArea_2003);

        add(inputPanel, BorderLayout.NORTH);
        add(panelArray_2003, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.SOUTH);
        add(scrollPane, BorderLayout.EAST);

        setButton_2003.addActionListener(e -> setArrayFromInput_2511532003());
        stepButton_2003.addActionListener(e -> performStep());
        resetButton_2003.addActionListener(e -> reset_2511532003());
    }

    private void setArrayFromInput_2511532003() {
        String text = inputField_2003.getText().trim();
        if (text.isEmpty()) return;
        String[] parts = text.split(",");
        array_2003 = new int[parts.length];
        try {
            for (int i = 0; i < parts.length; i++) {
                array_2003[i] = Integer.parseInt(parts[i].trim());
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Masukkan hanya angka!",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        labelArray_2003 = new JLabel[array_2003.length];
        panelArray_2003.removeAll();
        for (int i = 0; i < array_2003.length; i++) {
            labelArray_2003[i] = new JLabel(String.valueOf(array_2003[i]));
            labelArray_2003[i].setFont(new Font("Arial", Font.BOLD, 24));
            labelArray_2003[i].setOpaque(true);
            labelArray_2003[i].setBackground(Color.WHITE);
            labelArray_2003[i].setBorder(BorderFactory.createLineBorder(Color.BLACK));
            labelArray_2003[i].setPreferredSize(new Dimension(50, 50));
            labelArray_2003[i].setHorizontalAlignment(SwingConstants.CENTER);
            panelArray_2003.add(labelArray_2003[i]);
        }
        mergeQueue.clear();
        generateMergeSteps_2511532003(0, array_2003.length - 1);
        stepButton_2003.setEnabled(true);
        stepArea_2003.setText("");
        stepCount_2003 = 1;
        isMerging_2003 = false;
        panelArray_2003.revalidate();
        panelArray_2003.repaint();
    }

    private void generateMergeSteps_2511532003(int l, int r) {
        if (l >= r) return;
        int m = (l + r) / 2;
        generateMergeSteps_2511532003(l, m);
        generateMergeSteps_2511532003(m + 1, r);
        mergeQueue.add(new int[]{l, m, r});
    }

    private void performStep() {
        resetHighlights_2511532003();

        if (!isMerging_2003 && !mergeQueue.isEmpty()) {
            int[] range = mergeQueue.poll();
            left_2003 = range[0];
            mid_2003 = range[1];
            right_2003 = range[2];
            temp_2003 = new int[right_2003 - left_2003 + 1];
            i_2003 = left_2003;
            j_2003 = mid_2003 + 1;
            k_2003 = 0;
            copying_2003 = false;
            isMerging_2003 = true;
            stepArea_2003.append("Langkah " + stepCount_2003++ +
                    ": Mulai merge dari " + left_2003 + " ke " + right_2003 + "\n");
            return;
        }

        if (isMerging_2003 && !copying_2003) {
            if (i_2003 <= mid_2003 && j_2003 <= right_2003) {
                labelArray_2003[i_2003].setBackground(Color.CYAN);
                labelArray_2003[j_2003].setBackground(Color.CYAN);
                if (array_2003[i_2003] <= array_2003[j_2003]) {
                    temp_2003[k_2003++] = array_2003[i_2003++];
                } else {
                    temp_2003[k_2003++] = array_2003[j_2003++];
                }
                stepArea_2003.append("Langkah " + stepCount_2003++ + ": Bandingkan dan salin elemen\n");
                return;
            } else if (i_2003 <= mid_2003) {
                temp_2003[k_2003++] = array_2003[i_2003++];
                stepArea_2003.append("Langkah " + stepCount_2003++ + ": Salin sisa kiri\n");
                return;
            } else if (j_2003 <= right_2003) {
                temp_2003[k_2003++] = array_2003[j_2003++];
                stepArea_2003.append("Langkah " + stepCount_2003++ + ": Salin sisa kanan\n");
                return;
            } else {
                copying_2003 = true;
                k_2003 = 0;
                return;
            }
        }

        if (copying_2003 && k_2003 < temp_2003.length) {
            array_2003[left_2003 + k_2003] = temp_2003[k_2003];
            labelArray_2003[left_2003 + k_2003].setText(String.valueOf(temp_2003[k_2003]));
            labelArray_2003[left_2003 + k_2003].setBackground(Color.GREEN);
            k_2003++;
            stepArea_2003.append("Langkah " + stepCount_2003++ + ": Tempelkan ke array utama\n");
            return;
        }

        if (copying_2003 && k_2003 == temp_2003.length) {
            isMerging_2003 = false;
            copying_2003 = false;
        }

        if (mergeQueue.isEmpty() && !isMerging_2003) {
            stepArea_2003.append("Selesai.\n");
            stepButton_2003.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Merge Sort selesai!");
        }
    }

    private void resetHighlights_2511532003() {
        if (labelArray_2003 == null) return;
        for (JLabel label : labelArray_2003) {
            label.setBackground(Color.WHITE);
        }
    }

    private void reset_2511532003() {
        inputField_2003.setText("");
        panelArray_2003.removeAll();
        panelArray_2003.revalidate();
        panelArray_2003.repaint();
        stepArea_2003.setText("");
        stepButton_2003.setEnabled(false);
        mergeQueue.clear();
        isMerging_2003 = false;
        stepCount_2003 = 1;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MergeSortGUI_2511532003 gui = new MergeSortGUI_2511532003();
            gui.setVisible(true);
        });
    }
}