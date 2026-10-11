import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("masukkan angka pertama");
        double a = sc.nextDouble();

        System.out.println("masukkan angka kedua");
        double b = sc.nextDouble();

        System.out.println("pilih operasi");
        System.out.println("1. penjumlahan (+)");
        System.out.println("2. pengurangan (-)");
        System.out.println("3. perkalian (*)");
        System.out.println("4. pembagian (/)");

        System.out.println("masukkan pilihan (1-4)");
        int pilihan = sc.nextInt();

        if(pilihan == 1){
            System.out.println("hasil = " + (a + b));
        }else if(pilihan == 2){
            System.out.println("hasil = " + (a - b));
        }else if(pilihan == 3){
            System.out.println("hasil = " + (a * b));
        }else if (pilihan == 4){
            if( b != 0){
                System.out.println("hasil " + (a / b));
            }else{
                System.out.println("hasil tidak di bagi dengan nol");
            }
        }else{
            System.out.println("pilihan tidak ada");
        }
        sc.close();
    }
}
