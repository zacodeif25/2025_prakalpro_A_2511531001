package pekan7_2511531001;
import java.util.Scanner;
public class tugasAlproPekan7_2511531001 {

	public static void main(String[] args) {
		Akun_2511531001 a = new Akun_2511531001();
		Scanner input = new Scanner (System.in);
		System.out.println("===== REGISTRASI AKUN BARU =====");
		System.out.print("Masukkan Username     : ");
		String p = input.nextLine();
		System.out.print("Masukkan Password     : ");
		String q = input.nextLine();
		System.out.print("Masukkan Email        : ");
		String r = input.nextLine();
		System.out.print("Masukkan PIN (6 digit): ");
		int s = input.nextInt();
		
		a.setEmail(r);
		a.setpinAngka(s);
		a.setPssword(q);
		a.setUsrname(p);
		
		boolean isPasswordValid = a.isPasswordValid();
		boolean isEmailValid = a.isEmailValid();
		
		if (isPasswordValid && isEmailValid) {
			System.out.println();
			System.out.println("--- REGISTRASI BERHASIL ---");
			System.out.println("Akun untuk \"" + a.getUsrname() + "\" telah berhasil dibuat." );
			System.out.println(" ");
			System.out.println("--- Detail Akun ---");
			System.out.println("Username (Lowercase)  :" + a.getUsrname().toLowerCase());
			System.out.println("Email (Uppercase)     :" + a.getEmail().toUpperCase());
			System.out.println("ID Pengguna (Gabungan):" +(a.getUsrname()+a.getpinAngka()));
			System.out.println("");
			System.out.println("--- Uji Tipe Data (PIN Anda :" + a.getpinAngka()+ ") ---");
			System.out.println("PIN (int) + 10         = " +(a.getpinAngka()+10));
			System.out.println("PIN (String) + \"10\"    = " + a.getpinAngka()+"10");
		} else {
			System.out.println("--- REGISTRASI GAGAL ---");
			
			if (!a.isPasswordValid()) {
				System.out.println("Password Anda \"" + q + "\" tidak valid (minimal 8 karakter atau lebih)");
			}
			if (!a.isEmailValid()) {
				System.out.println("Email Anda \"" + r + "\" tidak valid (harus mengandung '@' dan '.')");
			}
			System.out.println("Silakan Coba Lagi");
		}
		
			input.close();
		
		
	}
}
