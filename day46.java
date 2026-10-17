import java.util.Scanner;

public class day46 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("=== MENU MAKANAN ===");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Ayam");
        System.out.println("3. Bakso");
        System.out.println("4. Ayam Geprek");

        System.out.println("Pilih menu (1-4): ");
        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Saya memilih Nasi Goreng");
                break;
            case 2:
                System.out.println("Saya memilih Mie Ayam");
                break;
            case 3:
                System.out.println("Saya memilih Bakso");
                break;
            case 4:
                System.out.println("Saya memilih Ayam Geprek");
                break;
            default:
                System.out.println("Menu tidak tersedia!");
        }

        sc.close();
    }
}
