package Jobsheet2.TugasTeori;

public class PerpustkaanDemo {
    public static void main(String[] args) {
        // Membuat Object Buku
        Buku buku1 = new Buku("Pemrograman Java", "Budi Raharjo", 2021, "Teknologi");
        
        // Membuat Object Anggota
        Anggota anggota1 = new Anggota("Dityan Satria", "254107060037", "Teknologi Informasi");

        System.out.println("=== INFO BUKU ===");
        buku1.tampilkanInfo();

        System.out.println("=== INFO ANGGOTA ===");
        anggota1.tampilkanInfo();

        System.out.println("=== TRANSAKSI ===");
        anggota1.pinjamBuku(buku1.judul);
        buku1.pinjamBuku();
        
        System.out.println();
        anggota1.kembalikanBuku(buku1.judul);
        buku1.kembalikanBuku();
    }
}
