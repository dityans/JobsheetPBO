package Jobsheet4.Perpus;

public class PerpusDemo {
    public static void main(String[] args) {
        Buku b1 = new Buku("B001", "Pemrograman Java", "Budi Santoso", 3);
        Buku b2 = new Buku("B002", "Basis Data", "Siti Aminah", 2);

        Anggota mhs = new Anggota("2023001", "Andi");

        Peminjaman p1 = new Peminjaman("P001", "30-09-2026", mhs);
        p1.tambahBuku(b1);
        p1.tambahBuku(b2);
        mhs.tambahPeminjaman(p1);

        mhs.tampilRiwayat();
        System.out.println("Total buku dipinjam: " + mhs.hitungTotalBukuDipinjam());
    }
}
