import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("masukkan nama");
        String nama = sc.nextLine();

        System.out.println("masukka umur");
        int umur = sc.nextInt();

        System.out.println("nama saya : " + nama);
        System.out.println("umur saya : " + umur + " tahun");

        sc.close();
    }
}
