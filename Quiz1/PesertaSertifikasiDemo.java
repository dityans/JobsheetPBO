package Quiz1;

public class PesertaSertifikasiDemo {
    public static void main(String[] args) {
        PesertaSertifikasi p1 = new PesertaSertifikasi("P01", "Budi", 80, 85, 90); // Lulus
        PesertaSertifikasi p2 = new PesertaSertifikasi("P02", "Siti", 65, 60, 65); // Tidak Lulus (nilai akhir < 70)
        PesertaSertifikasi p3 = new PesertaSertifikasi("P03", "Andi", 90, 90, 50); // Tidak Lulus (ada nilai < 60)

        System.out.println("--- Hasil Penilaian Peserta ---");
        p1.tampilkanHasil();
        p2.tampilkanHasil();
        p3.tampilkanHasil();

        System.out.println("--- Pengujian Input Nilai Tidak Valid (0-100) ---");
        PesertaSertifikasi p4 = new PesertaSertifikasi("P04", "Eko", 80, 105, 70); // Nilai > 100
        p1.setNilai(-10, 80, 80); // Nilai < 0
    }
}
