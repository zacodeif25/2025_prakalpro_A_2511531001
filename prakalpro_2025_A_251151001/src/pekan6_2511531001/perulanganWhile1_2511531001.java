package pekan6_2511531001;

import java.util.Scanner;

public class perulanganWhile1_2511531001 {
	public static void main (String [] args) {
		int counter = 0;
		String jawab ;
		boolean running = true;
		//deklarasi scanner
		Scanner scan = new Scanner (System.in);
		while (running) {
			counter++;
			System.out.println("Jumlah = "+counter);
			System.out.print("Apakah lanjut? (Iya/Tidak)=");
			jawab = scan.nextLine();
			//cek jawab = tidak, perulangan berhenti
			if (jawab.equalsIgnoreCase("tidak")){
				running = false;
			}	
			}
		System.out.println("Anda Sudah melakukan perulangan sebanyak "+counter+" kali");
		
	}
}
