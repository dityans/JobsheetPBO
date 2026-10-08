package Jobsheet4.Perpus;

import java.util.ArrayList;

public class Peminjaman {
    private String idPeminjaman;
    private String tanggalPinjam;
    private Anggota anggota;
    private ArrayList<Buku> daftarBuku = new ArrayList<>();

    public Peminjaman(String idPeminjaman, String tanggalPinjam, Anggota anggota) {
        this.idPeminjaman = idPeminjaman;
        this.tanggalPinjam = tanggalPinjam;
        this.anggota = anggota;
    }

    public void tambahBuku(Buku b) {
        if (b.kurangiStok()) {
            daftarBuku.add(b);
        } else {
            System.out.println("Stok buku '" + b.getJudul() + "' habis.");
        }
    }

    public void hapusBuku(Buku b) {
        if (daftarBuku.remove(b)) {
            b.tambahStok();
        }
    }

    public int getJumlahBuku() { return daftarBuku.size(); }

    public void tampilDetail() {
        System.out.println("ID: " + idPeminjaman + " | Tanggal: " + tanggalPinjam + " | Peminjam: " + anggota.getNama());
        System.out.println("Daftar Buku:");
        for (Buku b : daftarBuku) {
            System.out.print("  - ");
            b.tampilInfo();
        }
    }
}
