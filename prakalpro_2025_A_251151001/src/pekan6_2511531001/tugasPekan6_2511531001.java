package pekan6_2511531001;
import java.util.Scanner;
import java.util.Random;
public class tugasPekan6_2511531001 {
 public static void main(String [] args) {
	 
	 Random acak= new Random ();
	 Scanner a= new Scanner(System.in);
	 int jumlah=0;
	 int coba=0;
	 boolean menang = false;
	 boolean terus = true;
	 int target = 7;
	 while(terus) {
		 coba++; 
		 int d1 = acak.nextInt(6)+1;
		 int d2 = acak.nextInt(6)+1;
		 jumlah = d1+d2;
		 System.out.println(d1 + " + " + d2 + " = " + jumlah);
			if(jumlah==target) {
				System.out.println("Tebakan Anda Benar");
				System.out.println("Anda Menang Setelah " +coba+ " kali Percobaan");
			menang=true;
			break;
			
			}else {
				System.out.println("Tebakan Anda Salah");
				System.out.print("Apakah mau melempar dadu lagi? (ya/tidak):");
				String jawab= a.nextLine();
				if (jawab.equalsIgnoreCase("tidak")) {
				terus=false;
			}
		}
	 } 
	 			if (!menang) {
	 				System.out.println("Anda Gagal Menang");
	 }
	 					a.close();
 	}
	 
	} 
 
 

