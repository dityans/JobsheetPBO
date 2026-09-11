package TugasTeori;

public class Mobil {
    public String merk, warna;
    public int tahunProduksi;
    public String jenisBahanBakar, platNomor;
    public double rasioBBM; 

    public Mobil(String merk, String warna, int tahunProduksi, String jenisBahanBakar, String platNomor, double rasioBBM) {
        this.merk = merk;
        this.warna = warna;
        this.tahunProduksi = tahunProduksi;
        this.jenisBahanBakar = jenisBahanBakar;
        this.platNomor = platNomor;
        this.rasioBBM = rasioBBM;
    }

    public void tampilkanInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Warna: " + warna);
        System.out.println("Tahun Produksi: " + tahunProduksi);
        System.out.println("Jenis Bahan Bakar: " + jenisBahanBakar);
        System.out.println("Plat Nomor: " + platNomor);
        System.out.println("Rasio BBM: " + rasioBBM + " KM/liter");
    }
    public int hitungUsia(int tahunSekarang) {
        return tahunSekarang - this.tahunProduksi;
    }
    public void setPlatNomor(String platBaru) {
        this.platNomor = platBaru;
    }
    public double estimasiBBM(double jarakKM) {
        double estimasi = jarakKM / rasioBBM;
        if (jenisBahanBakar.equalsIgnoreCase("Bensin")) {
            return estimasi * 10000; 
        } else {
            return estimasi * 6800; 
        }
    }
}
