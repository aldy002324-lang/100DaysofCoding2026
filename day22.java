public class day21 {
    public static void main(String[] args) {
    
        int a = 22;
        int b = 17;

        // Menampilkan nilai sebelum ditukar
        System.out.println("Sebelum ditukar:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Menukar nilai menggunakan variabel sementara
        int sementara = a;
        a = b;
        b = sementara;

        // Menampilkan nilai setelah ditukar
        System.out.println("\nSetelah ditukar:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
