package Jobsheet3.TugasTeori;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String alamat;
    private double ipk;

    public Mahasiswa(String nim, String nama, String alamat, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        setIpk(ipk); // Menggunakan setter untuk validasi IPK
    }

    // Getter
    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public double getIpk() {
        return ipk;
    }
    
    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setIpk(double ipk) {
        if (ipk >= 0.00 && ipk <= 4.00) {
            this.ipk = ipk;
        } else {
            System.out.println("Error: Nilai IPK " + ipk + " tidak valid! Harus antara 0.00 - 4.00.");
        }
    }

    public void tampilkanInfo() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("IPK: " + ipk);
    }
}
