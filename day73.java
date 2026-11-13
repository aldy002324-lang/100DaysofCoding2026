import java.util.Scanner;

public class day73 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Halo");
            System.out.println("2. Selamat Datang");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Halo!");
                    break;

                case 2:
                    System.out.println("Selamat Datang!");
                    break;

                case 3:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia!");
            }

        } while (pilihan != 3);

        sc.close();
    }
}
