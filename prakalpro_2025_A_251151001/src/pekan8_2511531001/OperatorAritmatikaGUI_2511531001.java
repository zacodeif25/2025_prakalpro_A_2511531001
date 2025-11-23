package pekan8_2511531001;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.MatteBorder;

public class OperatorAritmatikaGUI_2511531001 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBil1;
	private JTextField txtBil2;
	private JTextField txtHasil;
	
	private void pesanPeringatan(String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "Peringatan", JOptionPane.WARNING_MESSAGE);	}
	private void pesanError(String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "Kesalahan", JOptionPane.ERROR_MESSAGE);	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperatorAritmatikaGUI_2511531001 frame = new OperatorAritmatikaGUI_2511531001();
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
	public OperatorAritmatikaGUI_2511531001() {
		setResizable(false);
		setTitle("OPERATOR ARITMATIKA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 326, 305);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setForeground(new Color(192, 192, 192));
		contentPane.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("OPERATOR ARITMATIKA");
		lblNewLabel.setBackground(new Color(104, 245, 10));
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.BOLD, 14));
		lblNewLabel.setBounds(58, 10, 214, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Bilangan 1");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 10));
		lblNewLabel_1.setBounds(26, 55, 72, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Bilangan 2");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 10));
		lblNewLabel_1_1.setBounds(26, 88, 56, 28);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Operator");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 10));
		lblNewLabel_1_2.setBounds(26, 139, 44, 12);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Hasil");
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 10));
		lblNewLabel_1_3.setBounds(26, 175, 56, 23);
		contentPane.add(lblNewLabel_1_3);
		
		txtBil1 = new JTextField();
		txtBil1.setBackground(Color.WHITE);
		txtBil1.setHorizontalAlignment(SwingConstants.CENTER);
		txtBil1.setBounds(119, 55, 72, 18);
		contentPane.add(txtBil1);
		txtBil1.setColumns(10);
		
		txtBil2 = new JTextField();
		txtBil2.setBackground(Color.WHITE);
		txtBil2.setHorizontalAlignment(SwingConstants.CENTER);
		txtBil2.setBounds(119, 92, 72, 18);
		contentPane.add(txtBil2);
		txtBil2.setColumns(10);
		
		JComboBox cbOperator = new JComboBox();
		cbOperator.setModel(new DefaultComboBoxModel(new String[] {"+", "_", "*", "/", "%"}));
		cbOperator.setBounds(119, 134, 72, 20);
		contentPane.add(cbOperator);
		
		txtHasil = new JTextField();
		txtHasil.setBackground(Color.WHITE);
		txtHasil.setHorizontalAlignment(SwingConstants.CENTER);
		txtHasil.setEditable(false);
		txtHasil.setColumns(10);
		txtHasil.setBounds(119, 176, 72, 18);
		contentPane.add(txtHasil);
		
		JButton btnNewButton = new JButton("Proses");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton.addActionListener(new ActionListener() {
			int hasil;
			public void actionPerformed(ActionEvent e) {
				if(txtBil1.getText().trim().isEmpty()) {
					pesanPeringatan ("Silakan Isi Bilangan 1");
				} else if (txtBil2.getText().trim().isEmpty()) {
					pesanPeringatan ("Silakan Isi Bilangan 2");
				}else if (txtBil2.getText().trim().startsWith("0")) {
					pesanPeringatan ("Bilangan 2 tidak boleh angka 0");
				} else {
					try {
						int a = Integer.parseInt(txtBil1.getText());
						int b = Integer.parseInt(txtBil2.getText());
						int c = cbOperator.getSelectedIndex();
						
						if (c==0) {hasil=a+b;}
						if (c==1) {hasil=a-b;}
						if (c==2) {hasil=a*b;}
						if (c==3) {hasil=a/b;}
						if (c==4) {hasil=a%b;}
						
						txtHasil.setText(String.valueOf(hasil));
					} catch (NumberFormatException ex) {
						pesanError("Bilangan 1 dan 2 harus Angka");
					}
				}
				
				int a = Integer.parseInt(txtBil1.getText());
				int b = Integer.parseInt(txtBil2.getText());
				int c = cbOperator.getSelectedIndex();
				
				if (c==0) {hasil=a+b;}
				if (c==1) {hasil=a-b;}
				if (c==2) {hasil=a*b;}
				if (c==3) {hasil=a/b;}
				if (c==4) {hasil=a%b;}
				
				txtHasil.setText(String.valueOf(hasil));
			}
		});
		btnNewButton.setBounds(201, 134, 84, 20);
		contentPane.add(btnNewButton);

	}
}
