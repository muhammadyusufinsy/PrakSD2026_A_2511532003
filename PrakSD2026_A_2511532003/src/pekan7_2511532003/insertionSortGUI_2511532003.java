package pekan7_2511532003;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;

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
import javax.swing.border.EmptyBorder;

public class insertionSortGUI_2511532003 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane_2003;
	private int[] array_2003;
	private JLabel[] labelArray_2003;
	private JButton stepButton_2003, resetButton_2003, setButton_2003;
	private JTextField inputField_2003;
	private JPanel panelArray_2003;
	private JTextArea stepArea_2003;
	
	
	private int  i_2003 = 1, j_2003;
	private boolean sorting_2003 = false;
	private int stepCount_2003 = 1;

//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					insertionSortGUI_2511532003 frame = new insertionSortGUI_2511532003();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public insertionSortGUI_2511532003() {
		setTitle ("insertion sort langkah per langkah ");
		setSize (750, 400);
		setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout (new BorderLayout ());
		
		// panel input
		JPanel inputPanel = new JPanel (new FlowLayout());
		inputField_2003 = new JTextField(30);
		setButton_2003 = new JButton ("set array");
		inputPanel.add(new JLabel ("masukan angka pisahkan dengan koma : "));
		inputPanel.add (inputField_2003);
		inputPanel.add(setButton_2003);
		
		// panel array visual
		panelArray_2003 = new JPanel ();
		panelArray_2003.setLayout (new FlowLayout());
		
		// panel kontrol
		JPanel controlPanel = new JPanel ();
		stepButton_2003 = new JButton ("langkah selanjutnya");
		resetButton_2003 = new JButton ("reset");
		stepButton_2003.setEnabled(false);
		controlPanel.add(stepButton_2003);
		controlPanel.add(resetButton_2003);
		
		// area teks untuk log langkah langkah
		stepArea_2003 = new JTextArea (8, 60) ;
		stepArea_2003.setEditable(false);
		stepArea_2003.setFont(new Font ("monospaced", Font.PLAIN, 14));
		JScrollPane scrollPane = new JScrollPane (stepArea_2003);
		
		// tambahkan panel ke frame
		add(inputPanel, BorderLayout.NORTH);
		add(panelArray_2003, BorderLayout.CENTER);
		add(controlPanel, BorderLayout.SOUTH);
		add(scrollPane, BorderLayout.EAST);
		
		// event set array
		setButton_2003.addActionListener(e -> setArrayFromInput_2003());
		
		// event langkah selanjutnya 
		stepButton_2003.addActionListener (e -> performStep_2003());
		
		// event reset
		resetButton_2003.addActionListener (e -> reset_2003());
		
	}
		
		private void setArrayFromInput_2003 () {
			String text = inputField_2003.getText ().trim();
			if (text.isEmpty())return;
			String [] parts = text.split(",");
			array_2003 = new int [parts.length];
			try {
				for (int k = 0; k < parts.length; k++) {
					array_2003[k] = Integer.parseInt(parts[k].trim()); 	}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog (this, "masukan hanya angka yang dipisahkan " + "dengan koma", "error", JOptionPane.ERROR_MESSAGE);
				return; 	}
			i_2003 = 1;
			stepCount_2003 = 1;
			sorting_2003 = true;
			stepButton_2003.setEnabled(true);
			stepArea_2003.setText("");
			panelArray_2003.removeAll();
			labelArray_2003 = new JLabel [array_2003.length];
			for (int k = 0; k < array_2003.length; k++) {
				labelArray_2003[k] = new JLabel(String.valueOf(array_2003[k]));
				labelArray_2003[k].setFont(new Font ("arial", Font.BOLD, 24));
				labelArray_2003[k].setBorder(BorderFactory.createLineBorder(Color.BLACK));
				labelArray_2003[k].setPreferredSize(new Dimension (50, 50));
				labelArray_2003[k].setHorizontalAlignment(SwingConstants.CENTER);
				panelArray_2003.add(labelArray_2003[k]);
			}
			panelArray_2003.revalidate();
			panelArray_2003.repaint();
				
			}
		
		
		private void performStep_2003 () {
			if (i_2003 < array_2003.length && sorting_2003) {
				int key = array_2003[i_2003];
				j_2003 = i_2003 - 1;
				
				StringBuilder stepLog = new StringBuilder ();
				stepLog.append ("langkah ").append(stepCount_2003).
				append (": memasukan ").append(key).append("\n");
				
				while (j_2003 >= 0 && array_2003 [j_2003] > key) {
					array_2003 [j_2003 + 1] = array_2003 [j_2003];
					j_2003--;
				}
				array_2003 [j_2003 + 1]= key;
			
				updateLabels_2003();
				stepLog.append("hasil :").append(arrayToString_2003(array_2003)).append ("\n\n");
				stepArea_2003.append(stepLog.toString());
				
				i_2003++;
				stepCount_2003++;
				
				if (i_2003 == array_2003.length) {
					sorting_2003 = false;
					stepButton_2003.setEnabled (false);
					JOptionPane.showMessageDialog(this,  "sorting selesai");
				}
			}
			
		}
		private void updateLabels_2003() {
			for (int k = 0; k < array_2003.length; k++) {
				labelArray_2003[k].setText(String.valueOf(array_2003[k]));
			}
		}
		private void reset_2003 () {
			inputField_2003.setText("");
			panelArray_2003.removeAll();
			panelArray_2003.revalidate();
			panelArray_2003.repaint();
			stepArea_2003.setText("");
			stepButton_2003.setEnabled(false);
			sorting_2003 = false;
			i_2003 = 1;
			stepCount_2003 = 1;
		}
		private String arrayToString_2003 (int[] arr) {
			StringBuilder sb_2003 = new StringBuilder();
			for (int k_2003 = 0; k_2003 < arr.length; k_2003++) {
				sb_2003.append(arr[k_2003]);
				if (k_2003 < arr.length - 1) sb_2003.append(", ");
			}
			return sb_2003.toString();
		}
		public static void main (String [] args) {
			SwingUtilities.invokeLater(() -> {
				insertionSortGUI_2511532003 gui = new insertionSortGUI_2511532003();
				gui.setVisible(true);
			});
		}
	}


