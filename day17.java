public class day17 {
    public static void main(String[] args) {

        int saldo = 0;

        // Setor tunai
        saldo += 500000;
        System.out.println("Saldo setelah setor   = Rp" + saldo);

        // Penarikan
        saldo -= 120000;
        System.out.println("Saldo setelah tarik   = Rp" + saldo);

        // Bunga tabungan
        int bunga = 1;
        saldo *= bunga;
        System.out.println("Saldo setelah bunga   = Rp" + saldo);

        // Memindahkan setengah saldo
        saldo /= 2;
        System.out.println("Saldo setelah dibagi  = Rp" + saldo);

        // Mencari sisa saldo
        int pembagi = 50000;
        saldo %= pembagi;
        System.out.println("Sisa saldo            = Rp" + saldo);
    }
}
