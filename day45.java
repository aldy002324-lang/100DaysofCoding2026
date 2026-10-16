import java.util.Scanner;

public class day45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== PILIH TEMPAT WISATA ===");
        System.out.println("A. Pantai");
        System.out.println("B. Gunung");
        System.out.println("C. Air Terjun");
        System.out.println("D. Wai turang");

        System.out.print("Pilih tempat wisata (A-D): ");
        char pilihan = sc.next().toUpperCase().charAt(0);

        switch (pilihan) {
            case 'A':
                System.out.println("Pergi ke Pantai");
                break;
            case 'B':
                System.out.println("Pergi ke Gunung");
                break;
            case 'C':
                System.out.println("Pergi ke Air Terjun");
                break;
            case 'D':
                System.out.println("Pergi ke Wai turang");
                break;
            default:
                System.out.println("Pilihan tidak tersedia!");
        }

        sc.close();
    }
}
