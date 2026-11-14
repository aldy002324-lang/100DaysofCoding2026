import java.util.Scanner;

public class day74 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = sc.nextLine();

        System.out.println("Nama asli: " + nama);
        System.out.println("Jumlah huruf: " + nama.length());
        System.out.println("Huruf besar: " + nama.toUpperCase());
        System.out.println("Huruf kecil: " + nama.toLowerCase());

        sc.close();
    }
}
