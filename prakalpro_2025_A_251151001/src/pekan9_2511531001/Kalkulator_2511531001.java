package pekan9_2511531001;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Kalkulator_2511531001 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTampil;

		double Bil1;
		double Bil2;
		double hasil;
		String op;
		String jawab;
		
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kalkulator_2511531001 frame = new Kalkulator_2511531001();
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
	public Kalkulator_2511531001() {

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 253, 343);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtTampil = new JTextField();
		txtTampil.setEditable(false);
		txtTampil.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtTampil.setBounds(22, 10, 196, 58);
		contentPane.add(txtTampil);
		txtTampil.setColumns(10);
		
		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace =null;
				if(txtTampil.getText().length()>0);{
					StringBuilder str = new StringBuilder(txtTampil.getText());
					str.deleteCharAt(txtTampil.getText().length()-1);
					backSpace = str.toString();
					txtTampil.setText(backSpace);
					}
			}
		});
		btnBackspace.setBounds(10, 93, 59, 37);
		contentPane.add(btnBackspace);
		
		JButton angka7 = new JButton("7");
		angka7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtTampil.getText()+ angka7.getText();
				txtTampil.setText(number);
			}
		});
		angka7.setBounds(10, 130, 59, 37);
		contentPane.add(angka7);
		
		JButton angka8 = new JButton("8");
		angka8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtTampil.getText()+ angka8.getText();
			txtTampil.setText(number);
			}
		});
		angka8.setBounds(65, 130, 59, 37);
		contentPane.add(angka8);
		
		JButton angka9 = new JButton("9");
		angka9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtTampil.getText()+ angka9.getText();
				txtTampil.setText(number);
			}
		});
		angka9.setBounds(120, 130, 59, 37);
		contentPane.add(angka9);
		
		JButton angka4 = new JButton("4");
		angka4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtTampil.getText()+ angka4.getText();
				txtTampil.setText(number);
			}
		});
		angka4.setBounds(10, 167, 59, 37);
		contentPane.add(angka4);
		
		JButton angka5 = new JButton("5");
		angka5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtTampil.getText()+ angka5.getText();
				txtTampil.setText(number);
			}
		});
		angka5.setBounds(65, 167, 59, 37);
		contentPane.add(angka5);
		
		JButton angka6 = new JButton("6");
		angka6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtTampil.getText()+ angka6.getText();
				txtTampil.setText(number);
			}
		});
		angka6.setBounds(120, 167, 59, 37);
		contentPane.add(angka6);
		
		JButton angka1 = new JButton("1");
		angka1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtTampil.getText()+ angka1.getText();
				txtTampil.setText(number);
			}
		});
		angka1.setBounds(10, 204, 59, 37);
		contentPane.add(angka1);
		
		JButton angka2 = new JButton("2");
		angka2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtTampil.getText()+ angka2.getText();
				txtTampil.setText(number);
			}
		});
		angka2.setBounds(65, 204, 59, 37);
		contentPane.add(angka2);
		
		JButton angka3 = new JButton("3");
		angka3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtTampil.getText()+ angka3.getText();
				txtTampil.setText(number);
			}
		});
		angka3.setBounds(120, 204, 59, 37);
		contentPane.add(angka3);
		
		JButton angka0 = new JButton("0");
		angka0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtTampil.getText()+ angka0.getText();
				txtTampil.setText(number);
			}
		});
		angka0.setBounds(10, 241, 59, 40);
		contentPane.add(angka0);
		
		JButton btnBagi_2511531001 = new JButton("/");
		btnBagi_2511531001.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Bil1=Double.parseDouble(txtTampil.getText());
				txtTampil.setText("");
				op ="/";
			}
		});
		btnBagi_2511531001.setBounds(175, 204, 45, 37);
		contentPane.add(btnBagi_2511531001);
		
		JButton btnKali_2511531001 = new JButton("*");
		btnKali_2511531001.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Bil1=Double.parseDouble(txtTampil.getText());
				txtTampil.setText("");
				op ="*";
			}
		});
		btnKali_2511531001.setBounds(175, 167, 45, 37);
		contentPane.add(btnKali_2511531001);
		
		JButton btnHasil = new JButton("=");
		btnHasil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String jawab;
				Bil2=Double.parseDouble(txtTampil.getText());
				if (op=="+") {
					hasil = Bil1 + Bil2;
					jawab = String.format("%.2f",hasil);
					txtTampil.setText(jawab);}
				else if (op=="-") {
					hasil = Bil1 - Bil2;
					jawab = String.format("%.2f",hasil);
					txtTampil.setText(jawab);}
				else if (op=="*") {
					hasil = Bil1 * Bil2;
					jawab = String.format("%.2f",hasil);
					txtTampil.setText(jawab);}
				else if (op=="/") {
					hasil = Bil1 / Bil2;
					jawab = String.format("%.2f",hasil);
					txtTampil.setText(jawab);}
				else if (op=="%") {
					hasil = Bil1 % Bil2;
					jawab = String.format("%.2f",hasil);
					txtTampil.setText(jawab);}
				
			}
		});
		btnHasil.setBounds(120, 241, 59, 40);
		contentPane.add(btnHasil);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtTampil.getText()+ btnDot.getText();
				txtTampil.setText(number);
			}
		});
		btnDot.setBounds(65, 241, 59, 40);
		contentPane.add(btnDot);
		
		JButton btnTambah_2511531001 = new JButton("+");
		btnTambah_2511531001.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Bil1=Double.parseDouble(txtTampil.getText());
				txtTampil.setText("");
				op ="+";
			}
		});
		btnTambah_2511531001.setBounds(175, 93, 45, 37);
		contentPane.add(btnTambah_2511531001);
		
		JButton btnKurang_2511531001 = new JButton("-");
		btnKurang_2511531001.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Bil1=Double.parseDouble(txtTampil.getText());
				txtTampil.setText("");
				op ="-";
			}
		});
		btnKurang_2511531001.setBounds(174, 130, 45, 37);
		contentPane.add(btnKurang_2511531001);
		
		JButton btnHapus = new JButton("C");
		btnHapus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtTampil.setText(null);
			}
		});
		btnHapus.setBounds(65, 93, 59, 37);
		contentPane.add(btnHapus);
		
		JButton angka00 = new JButton("00");
		angka00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtTampil.getText()+ angka00.getText();
				txtTampil.setText(number);
			}
		});
		angka00.setBounds(120, 93, 70, 37);
		contentPane.add(angka00);
		
		JButton btnMod_2511531001 = new JButton("%");
		btnMod_2511531001.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Bil1=Double.parseDouble(txtTampil.getText());
				txtTampil.setText("");
				op ="%";
			}
		});
		btnMod_2511531001.setBounds(175, 241, 45, 40);
		contentPane.add(btnMod_2511531001);

	}
}
