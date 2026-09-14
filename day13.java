import java.util.Scanner;

public class soal4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("masukkan umur");
        int umur = sc.nextInt();

        System.out.println("masukkan ktp");
        boolean ktp = sc.nextBoolean();

        System.out.println("masukkan tiket");
        boolean tiket = sc.nextBoolean();

        System.out.printf("Data Penonton\n");
        System.out.printf("USIA : %d tahun\n" , umur);
        System.out.printf("Data : %b\n", ktp);
        System.out.printf("Data : %b\n", tiket);
    }
}
