
import java.util.Scanner;

public class day39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double a = sc.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double b = sc.nextDouble();

        System.out.println("Pilih operasi:");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");

        System.out.print("Masukkan pilihan (1-4): ");
        int pilihan = sc.nextInt();

        if (pilihan == 1) {
            System.out.println("Hasil = " + (a + b));
        }

        if (pilihan == 2) {
            System.out.println("Hasil = " + (a - b));
        }

        if (pilihan == 3) {
            System.out.println("Hasil = " + (a * b));
        }

        if (pilihan == 4) {
            if (b != 0) {
                System.out.println("Hasil = " + (a / b));
            } else {
                System.out.println("Tidak bisa dibagi dengan nol!");
            }
        }

        if (pilihan < 1 || pilihan > 4) {
            System.out.println("Pilihan tidak valid!");
        }

        sc.close();
    }
}
