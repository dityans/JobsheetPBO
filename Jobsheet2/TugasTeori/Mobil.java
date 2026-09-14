package Jobsheet2.TugasTeori;

public class Mobil {
    public String merk;
    public String platNomor;
    public String warna;
    public int kecepatanMaksimum;

    public void maju() {
        System.out.println("Mobil " + merk + " melaju di jalan.");
    }

    public void rem() {
        System.out.println("Mobil " + merk + " mengerem.");
    }

    public void klakson() {
        System.out.println("Mobil " + merk + " berbunyi: Bip Bip!");
    }
}
