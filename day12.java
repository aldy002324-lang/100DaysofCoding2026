package soal;

import java.util.Scanner;

public class day12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Nama: ");
        String nama = sc.nextLine();

        System.out.print("Umur: ");
        int umur = sc.nextInt();

        System.out.print("Tinggi Badan (cm): ");
        double tinggi = sc.nextDouble();

        System.out.print("Jenis Kelamin L/P: ");
        char jk = sc.next().charAt(0);


        System.out.println("====== BIODATA ======");
        System.out.println("Nama           : " + nama);
        System.out.println("Umur           : " + umur + " tahun");
        System.out.println("Tinggi Badan   : " + tinggi + " cm");
        System.out.println("Jenis Kelamin  : " + jk);
        
    }
}
