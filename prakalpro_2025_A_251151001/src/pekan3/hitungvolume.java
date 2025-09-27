package pekan3;
import java.util.Scanner;
public class hitungvolume {
	public static void main(String[] args) {
		double r;
		double t;
		final double PI = 3.142857142857143;
		double v;
	System.out.println("-----------SELAMAT DATANG-------------");
	System.out.println("--APLIKASI PENGHITUNG VOLUME KERUCUT--");
	Scanner keyboard = new Scanner(System.in);
	System.out.print("Silakan masukkan panjang jari jari kerucut anda :");
	r = keyboard.nextDouble();
	System.out.print("Silakan masukkan tinggi kerucut anda            :");
	t = keyboard.nextDouble();
	keyboard.close();
	v = (1.0 / 3.0) * PI * r * r * t;
	
	System.out.println("Volume Kerucut Anda = " + v );
	System.out.println("Terima kasih sudah menggunakan aplikasi ini");
	}
}
