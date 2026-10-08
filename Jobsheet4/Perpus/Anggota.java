package Jobsheet4.Perpus;

import java.util.ArrayList;

public class Anggota {
    private String nim;
    private String nama;
    private ArrayList<Peminjaman> daftarPeminjaman = new ArrayList<>();

    public Anggota(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public String getNim() { 
        return nim; 
    }
    public String getNama() { 
        return nama; 
    }

    public void tambahPeminjaman(Peminjaman p) { 
        daftarPeminjaman.add(p); 
    }

    public int hitungTotalBukuDipinjam() {
        int total = 0;
        for (Peminjaman p : daftarPeminjaman) {
            total += p.getJumlahBuku();
        }
        return total;
    }

    public void tampilRiwayat() {
        System.out.println("Riwayat peminjaman " + nama + " (" + nim + "):");
        for (Peminjaman p : daftarPeminjaman) {
            p.tampilDetail();
        }
    }
}
