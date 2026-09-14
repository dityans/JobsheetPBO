package Jobsheet2.TugasTeori;

public class Anggota {
    public String nama;
    public String nim;
    public String jurusan;

    public Anggota(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Anggota : " + nama);
        System.out.println("NIM          : " + nim);
        System.out.println("Jurusan      : " + jurusan);
        System.out.println("----------------------------");
    }

    public void pinjamBuku(String judulBuku) {
        System.out.println(nama + " (NIM: " + nim + ") meminjam buku: " + judulBuku);
    }

    public void kembalikanBuku(String judulBuku) {
        System.out.println(nama + " (NIM: " + nim + ") mengembalikan buku: " + judulBuku);
    }
}
