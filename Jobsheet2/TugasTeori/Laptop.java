package Jobsheet2.TugasTeori;

public class Laptop {
    public String merk;
    public String processor;
    public int ram;
    public int kapasitasPenyimpanan;

    // Constructor tanpa parameter
    public Laptop() {
        this.merk = "ASUS";
        this.processor = "Intel i5";
        this.ram = 8;
        this.kapasitasPenyimpanan = 256;
    }

    // Constructor berparameter
    public Laptop(String merk, String processor, int ram, int kapasitasPenyimpanan) {
        this.merk = merk;
        this.processor = processor;
        this.ram = ram;
        this.kapasitasPenyimpanan = kapasitasPenyimpanan;
    }

    public void nyalakan() {
        System.out.println("Laptop " + merk + " sedang dinyalakan.");
    }

    public void matikan() {
        System.out.println("Laptop " + merk + " dimatikan.");
    }

    public void bukaAplikasi(String namaAplikasi) {
        System.out.println("Membuka aplikasi " + namaAplikasi + " di laptop " + merk + ".");
    }
}
