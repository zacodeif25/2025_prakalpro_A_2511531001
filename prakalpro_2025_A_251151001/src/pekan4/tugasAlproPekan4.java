package pekan4;
import java.util.Scanner;

public class tugasAlproPekan4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" SELAMAT DATANG DI APLIKASI ");
        System.out.print(" Masukkan Nama Anda : ");
        String nama = input.nextLine();

        System.out.print(" Masukkan Berat Paket Anda (kg): ");
        double beratpkt = input.nextDouble();

        System.out.print(" Masukkan Jarak Pengiriman Paket (km): ");
        int jarak = input.nextInt();
        input.nextLine(); // konsumsi newline

        System.out.println(" Silakan Pilih Jenis Layanan Berdasarkan Kebutuhan Anda");
        System.out.println(" 1 = Reguler");
        System.out.println(" 2 = Express");
        System.out.println(" 3 = Same day");
        System.out.print(" Tipe Layanan Anda (1/2/3) : ");
        char jenislyn = input.nextLine().charAt(0);

        System.out.println(" Silakan Pilih Jenis Paket Berdasarkan Kebutuhan Anda");
        System.out.println(" 1 = Dokumen");
        System.out.println(" 2 = Barang Biasa");
        System.out.println(" 3 = Barang Elektronik");
        System.out.print(" Tipe Paket Anda (1/2/3) : ");
        char jenispkt = input.nextLine().charAt(0);

        input.close();

        // Inisialisasi
        String npaket = "";
        String nlayanan = "";
        double bjenispkt = 0;
        double blayanan = 0;
        int persen = 0;

        // Jenis paket
        if (jenispkt == '1') {
            bjenispkt = 6000;
            npaket = "Dokumen";
        } else if (jenispkt == '2') {
            bjenispkt = 12000;
            npaket = "Barang Biasa";
        } else if (jenispkt == '3') {
            bjenispkt = 20000;
            npaket = "Barang Elektronik";
        } else {
            System.out.println("Jenis paket tidak valid!");
            return;
        }

        // Jenis layanan
        if (jenislyn == '1') {
            nlayanan = "Reguler";
            persen = 0;
        } else if (jenislyn == '2') {
            nlayanan = "Express";
            persen = 50;
        } else if (jenislyn == '3') {
            nlayanan = "Same Day";
            persen = 100;
        } else {
            System.out.println("Jenis layanan tidak valid!");
            return;
        }

        // Perhitungan
        double bdasar = beratpkt * 5000;
        double bjarak = jarak * 3000;
        double subtotal = bdasar + bjarak;
        blayanan = (persen / 100.0) * subtotal;
        double tsdiskon = blayanan + bjenispkt ;
        double diskon = (tsdiskon > 150000) ? 0.1 * tsdiskon : 0;
        double tsel = tsdiskon - diskon;

        // TAMPILKAN OUTPUT DENGAN println SAJA
        System.out.println("\n");
        System.out.println("===== BIAYA PENGIRIMAN PAKET =====");
        System.out.println("Nama Pengirim        : " + nama);
        System.out.println("Berat Paket          : " + beratpkt + " kg");
        System.out.println("Jarak Pengiriman     : " + jarak + " km");
        System.out.println("Jenis Layanan        : " + nlayanan);
        System.out.println("Jenis Paket          : " + npaket);
        System.out.println("----------------------------------");
        System.out.println("Biaya Dasar          : Rp" + (int) bdasar);
        System.out.println("Biaya Jarak          : Rp" + (int) bjarak);
        System.out.println("Subtotal             : Rp" + (int) subtotal);
        System.out.println("Biaya Layanan (" + persen + "%) : Rp" + (int) blayanan);
        System.out.println("Biaya Jenis Paket    : Rp" + (int) bjenispkt);
        System.out.println("Total Sebelum Diskon : Rp" + (int) tsdiskon);
        System.out.println("Diskon               : Rp" + (int) diskon);
        System.out.println("----------------------------------");
        System.out.println("Total Biaya          : Rp" + (int) tsel);
    }
}