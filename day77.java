import java.util.Scanner;

public class day77 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan teks: ");
        String teks = sc.nextLine();

        String bersih = teks.trim();

        System.out.println("\nHasil Manipulasi String:");
        System.out.println("Teks asli       : " + teks);
        System.out.println("Jumlah huruf    : " + bersih.length());
        System.out.println("Huruf besar     : " + bersih.toUpperCase());
        System.out.println("Huruf kecil     : " + bersih.toLowerCase());
        System.out.println("Ganti huruf a   : " + bersih.replace("a", "o"));
        System.out.println("Mengandung Java : " + bersih.contains("Java"));
        System.out.println("Sama dengan Java: " + bersih.equalsIgnoreCase("Java"));

        sc.close();
    }
}
