package pekan8_2511531001;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TugasAlproPekan8_2511531001 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBil1;
	private JTextField txtBil2;
	private JTextField txtHasil;
	
	private void pesanPeringatan(String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "Peringatan", JOptionPane.WARNING_MESSAGE);}
	private void pesanError(String pesan) {
		JOptionPane.showMessageDialog(this,pesan, "Kesalahan", JOptionPane.ERROR_MESSAGE);}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TugasAlproPekan8_2511531001 frame = new TugasAlproPekan8_2511531001();
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
	public TugasAlproPekan8_2511531001() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 314, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("OPERATOR ASSIGNMENT");
		lblNewLabel.setFont(new Font("Rockwell", Font.PLAIN, 16));
		lblNewLabel.setBounds(55, 10, 214, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Bilangan 1");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_1.setBounds(10, 41, 75, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Bilangan 2");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_1_1.setBounds(10, 83, 75, 20);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Operator");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_1_2.setBounds(10, 130, 75, 20);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Hasil");
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_1_3.setBounds(10, 176, 75, 20);
		contentPane.add(lblNewLabel_1_3);
		
		txtBil1 = new JTextField();
		txtBil1.setHorizontalAlignment(SwingConstants.CENTER);
		txtBil1.setBounds(95, 42, 96, 18);
		contentPane.add(txtBil1);
		txtBil1.setColumns(10);
		
		txtBil2 = new JTextField();
		txtBil2.setHorizontalAlignment(SwingConstants.CENTER);
		txtBil2.setColumns(10);
		txtBil2.setBounds(95, 84, 96, 18);
		contentPane.add(txtBil2);
		
		txtHasil = new JTextField();
		txtHasil.setEditable(false);
		txtHasil.setHorizontalAlignment(SwingConstants.CENTER);
		txtHasil.setColumns(10);
		txtHasil.setBounds(95, 177, 96, 18);
		contentPane.add(txtHasil);
		
		JComboBox cbOperator = new JComboBox();
		cbOperator.setModel(new DefaultComboBoxModel(new String[] {"+=", "-=", "*=", "/=", "%="}));
		cbOperator.setBounds(95, 130, 52, 20);
		contentPane.add(cbOperator);
		
		JButton btnProses = new JButton("PROSES");
		btnProses.addActionListener(new ActionListener() {
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
						String op = (String) cbOperator.getSelectedItem();
						
						if (op=="+=") {hasil=a+=b;}
						if (op=="-=") {hasil=a-=b;}
						if (op=="*=") {hasil=a*=b;}
						if (op=="/=") {hasil=a/=b;}
						if (op=="%=") {hasil=a%=b;}
						
						txtHasil.setText(String.valueOf(a));
						txtBil1.setText(String.valueOf(a));
						txtBil1.setEditable(false);
						txtBil2.requestFocus();
					} catch (NumberFormatException ex) {
						pesanError("Bilangan 1 dan 2 harus Angka");
					}
				}
				
				}
				
			
		});
		btnProses.setFont(new Font("Times New Roman", Font.BOLD, 10));
		btnProses.setBounds(33, 221, 84, 20);
		contentPane.add(btnProses);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtBil1.setText("");
				txtBil1.requestFocus();
				txtBil1.setEditable(true);
				txtBil2.setText("");
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 10));
		btnReset.setBounds(161, 220, 84, 20);
		contentPane.add(btnReset);

	}
}
