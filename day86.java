import java.util.Scanner;

public class day86 {        
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah data : ");
        int jumlah = sc.nextInt();

        int data[] = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan data ke-" + (i + 1) + " : ");
            data[i] = sc.nextInt();
        }

        System.out.print("Masukkan angka yang dicari : ");
        int cari = sc.nextInt();

        boolean ditemukan = false;

        for (int i = 0; i < jumlah; i++) {
            if (data[i] == cari) {
                ditemukan = true;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("Angka " + cari + " ditemukan dalam array.");
        } else {
            System.out.println("Angka " + cari + " tidak ditemukan dalam array.");
        }

        sc.close();
    }
}
    
