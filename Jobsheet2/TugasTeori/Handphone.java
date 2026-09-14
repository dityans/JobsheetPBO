package Jobsheet2.TugasTeori;

public class Handphone {
    public String merk;
    public String tipe;
    public int kapasitasBaterai;
    public double ukuranLayar;

    public void telepon(String nomorTujuan) {
        System.out.println("Menghubungi " + nomorTujuan + " dari HP " + merk);
    }

    public void kirimPesan(String pesan) {
        System.out.println("Mengirim pesan: " + pesan);
    }

    public void foto() {
        System.out.println("Mengambil foto menggunakan HP " + merk);
    }
}
