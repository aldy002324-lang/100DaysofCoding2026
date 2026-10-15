import java.util.Scanner;

public class day44 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan nilai : ");
        int nilai = sc.nextInt();

        if(nilai >= 80){
            System.out.println("Predikat : A");
        }else if (nilai >= 70){
            System.out.println("Predikat : B");
        }else if (nilai >= 60){
            System.out.println("Predikat : C");
        }else if (nilai >= 50){
            System.out.println("Predikat : D");
        }else{
            System.out.println("Predikat : E");
        }
        sc.close();
    }
}
