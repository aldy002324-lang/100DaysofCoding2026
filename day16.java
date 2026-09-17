public class day16 {
    public static void main(String[] args) {
        
        int siswa = 47;
        int kapasitasBus = 10;

        int busPenuh = siswa / kapasitasBus;
        int siswaSisa = siswa % kapasitasBus;

        System.out.println("bus penuh : " + busPenuh);
        System.out.println("siswa sisa : " + siswaSisa);

    }
}
