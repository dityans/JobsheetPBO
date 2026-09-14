package Jobsheet2.TugasTeori;

public class Buku {
    public String judul;
    public String penulis;
    public int tahunTerbit;
    public String kategori;

    public Buku(String judul, String penulis, int tahunTerbit, String kategori) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.kategori = kategori;
    }

    public void tampilkanInfo() {
        System.out.println("Judul Buku : " + judul);
        System.out.println("Penulis    : " + penulis);
        System.out.println("Tahun      : " + tahunTerbit);
        System.out.println("Kategori   : " + kategori);
        System.out.println("----------------------------");
    }

    public void pinjamBuku() {
        System.out.println("Buku '" + judul + "' berhasil dipinjam.");
    }

    public void kembalikanBuku() {
        System.out.println("Buku '" + judul + "' telah dikembalikan.");
    }
}
