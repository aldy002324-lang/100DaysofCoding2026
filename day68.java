import java.util.Scanner;

public class day68 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int n = sc.nextInt();

        System.out.print("Masukkan nomor yang dilewati: ");
        int rusak = sc.nextInt();

        System.out.print("Masukkan nomor batas: ");
        int batas = sc.nextInt();

        if (n < 1) {
            return;
        }

        System.out.print("Nomor diperiksa: ");

        for (int i = 1; i <= n; i++) {

            if (i == batas) {
                break;
            }
          
            if (i == rusak) {
                continue;
            }

            System.out.print(i + " ");
        }

        System.out.println("\nPemeriksaan selesai");

    }
}
