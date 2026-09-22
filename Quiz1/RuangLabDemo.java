package Quiz1;

public class RuangLabDemo {
    public static void main(String[] args) {
        // Minimal 3 object ruang awal
        RuangLab r1 = new RuangLab("LAB-01", "Lab Sistem Informasi", 30);
        RuangLab r2 = new RuangLab("LAB-02", "Lab Jaringan", 25);
        RuangLab r3 = new RuangLab("LAB-03", "Lab Pemrograman", 20);

        System.out.println("--- Kondisi Awal ---");
        r1.tampilkanInfoRuang();
        System.out.println();
        r2.tampilkanInfoRuang();
        System.out.println();
        r3.tampilkanInfoRuang();
        System.out.println();

        System.out.println("--- Pengujian Kondisi Berhasil ---");
        r1.pemesananRuang(20); // 1. Pemesanan valid
        r1.batalPemesanan();   // 2. Pembatalan valid

        System.out.println("\n--- Pengujian Kondisi Ditolak ---");
        r2.pemesananRuang(0);   // 1. Peserta 0/negatif
        r2.pemesananRuang(35);  // 2. Peserta melebihi kapasitas
        
        r3.pemesananRuang(15);  // Berhasil dipesan dulu
        r3.pemesananRuang(10);  // 3. Ditolak karena sudah dipesan
        r2.batalPemesanan();   // 4. Ditolak pembatalan pada ruang yang belum dipesan
    }
}
