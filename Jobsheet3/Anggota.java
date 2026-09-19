package Jobsheet3;

public class Anggota {
    private String nomorKTP;
    private String nama;
    private float limitPinjaman;
    private float jumlahPinjaman;

    // Constructor
    public Anggota(String nomorKTP, String nama, float limitPinjaman) {
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0;
    }

    // Getter untuk Nama
    public String getNama() {
        return nama;
    }

    // Getter untuk Nomor KTP
    public String getNomorKTP() {
        return nomorKTP;
    }

    // Getter untuk Limit Pinjaman
    public float getLimitPinjaman() {
        return limitPinjaman;
    }

    // Getter untuk Jumlah Pinjaman
    public float getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    // Method untuk meminjam uang
    public void pinjam(float nominal) {
        if (jumlahPinjaman + nominal > limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            jumlahPinjaman += nominal;
        }
    }

    // Method untuk mengangsur pinjaman (Tugas 2: Minimal 10% dari pinjaman saat ini)
    public void angsur(float nominal) {
        float minimalAngsuran = 0.10f * jumlahPinjaman;
        
        if (nominal < minimalAngsuran) {
            System.out.println("Maaf, angsuran harus minimal 10% dari jumlah pinjaman");
        } else {
            jumlahPinjaman -= nominal;
            if (jumlahPinjaman < 0) {
                jumlahPinjaman = 0;
            }
        }
    }
}
