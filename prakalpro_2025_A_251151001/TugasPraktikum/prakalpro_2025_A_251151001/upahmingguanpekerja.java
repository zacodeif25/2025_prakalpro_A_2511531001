package prakalpro_2025_A_251151001;
import java.util.Scanner;
public class upahmingguanpekerja {
	public static void main (String[] args) {
	String nama;
	char golongan;
	int jamkerja;
	int tarifupah;
	long upahlembur;
	long totalupah;
	Scanner keyboard = new Scanner (System.in);
	System.out.print("Nama Lengkap = " );
	nama = keyboard.nextLine();

	System.out.print("Golongan  (A/B/C/D) = " );
	golongan = keyboard.next().charAt(0);
	System.out.print("Jumlah jam kerja = " );
	jamkerja = keyboard.nextInt();
	keyboard.close();
	
	if (golongan=='A') {
		tarifupah= 1000;
	} else if (golongan=='B') {
		tarifupah= 2000;
	} else if (golongan=='C') {
		tarifupah= 3000;
	} else if (golongan=='D') {
		tarifupah= 4000;
	} else {
			System.out.println("Golongan Anda Tidak Valid");
            return; }
	if (jamkerja >60) {
	 upahlembur= (jamkerja-60)*5000;
	} else {
	 upahlembur=0;}
	
	totalupah = (jamkerja*tarifupah) + upahlembur;
	
	System.out.println("\nTOTAL UPAH MINGGUAN");
	System.out.println("Nama Lengkap : " + nama);
	System.out.println("Total Upah   :Rp " + totalupah);
	
	
		
		}
		
	}
	
