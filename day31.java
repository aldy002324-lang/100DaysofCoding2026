import java.util.Scanner;

public class day31 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Umur :");
        int umur = sc.nextInt();

        System.out.println("Apakah punya kartu mahasiswa? (true/false) : ");
        boolean kartu = sc.nextBoolean();

        System.out.println("Boleh masuk kelas : " + (umur >= 18 && kartu));
        System.out.println("boleh masuk kampus : " + (umur >= 18 || kartu));
        System.out.println("Tidak punya kartu : " + (!kartu));

        sc.close();

    }
}
