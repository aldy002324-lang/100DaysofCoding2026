import java.util.Scanner;

public class t {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        
        System.out.println("Masukkan angka");
        int angka = a.nextInt();

        if(angka % 2 == 0){

            System.out.println(angka + " adalah bilangan genap ");
        }else{
            System.out.println(angka + " adalah bilangan ganjil ");
        }
        a.close();
    }
}
