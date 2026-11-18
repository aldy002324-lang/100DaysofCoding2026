import java.util.Scanner;

public class day78 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String username, password;
        String userBenar, passBenar;

        System.out.println("=== MEMBUAT AKUN ===");

        System.out.print("Buat Username: ");
        userBenar = sc.nextLine();

        System.out.print("Buat Password: ");
        passBenar = sc.nextLine();

        System.out.println("\n=== LOGIN AKUN ===");

        while (true) {
            System.out.print("Masukkan Username: ");
            username = sc.nextLine();

            System.out.print("Masukkan Password: ");
            password = sc.nextLine();

            if (username.equals(userBenar) &&
                password.equals(passBenar)) {

                System.out.println("\nLogin Berhasil!");
                break;

            } else {
                System.out.println("\nUsername atau Password Salah!");
                System.out.println("Silakan Coba Lagi.\n");
            }
        }

        sc.close();
    }
}
