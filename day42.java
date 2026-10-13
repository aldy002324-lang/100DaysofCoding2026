import java.util.Scanner;

public class day42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama karyawan: ");
        String nama = sc.nextLine();

        System.out.print("Masukkan gaji pokok: ");
        double gajiPokok = sc.nextDouble();

        System.out.print("Masukkan tunjangan: ");
        double tunjangan = sc.nextDouble();

        double totalGaji = gajiPokok + tunjangan;
        double pajak = 0;

        if (totalGaji >= 5000000) {
            pajak = totalGaji * 0.05;
        } else {
            pajak = totalGaji * 0.02;
        }

        double gajiBersih = totalGaji - pajak;

        System.out.println("\n=== RINCIAN GAJI ===");
        System.out.println("Nama karyawan: " + nama);
        System.out.println("Gaji pokok: Rp" + gajiPokok);
        System.out.println("Tunjangan: Rp" + tunjangan);
        System.out.println("Total gaji: Rp" + totalGaji);
        System.out.println("Pajak: Rp" + pajak);
        System.out.println("Gaji bersih: Rp" + gajiBersih);

        sc.close();
    }
}
