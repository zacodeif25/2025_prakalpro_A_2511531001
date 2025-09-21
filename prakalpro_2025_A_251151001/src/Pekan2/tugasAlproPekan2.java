package Pekan2;

import java.util.Scanner;
public class tugasAlproPekan2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan NIM         :");
		String NIM = scanner.nextLine();
		System.out.print("Masukkan Nama Lengkap:");
		String NAMA = scanner.nextLine();
		System.out.print("Masukkan Umur        :");
		int UMUR = scanner.nextInt();
		
		String umur = String.valueOf(UMUR);
		long nim = Long.parseLong(NIM);
		long umurlong = Long.parseLong(umur);
		long hasil = nim + umurlong;
		
		System.out.println("\n*****DATA MAHASISWA*****");
		System.out.println("NIM		: " +NIM);
		System.out.println("NAMA LENGKAP    : " +NAMA);
		System.out.println("UMUR 		: " +UMUR + " tahun");
		System.out.println("\nUMUR		: " +umur);
		System.out.println("NIM + Umur	: " +hasil);
	scanner.close();
	}

}
