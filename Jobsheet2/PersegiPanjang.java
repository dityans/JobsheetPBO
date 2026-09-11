package Jobsheet2;

public class PersegiPanjang {
    public double panjang;
    public double lebar;

    public double getLuas() {
        return panjang * lebar;
    }
    public double getKeliling() {
        return 2 * (panjang + lebar);
    }
    public void displayInfo() {
        System.out.println("Panjang : " + panjang);
        System.out.println("Lebar   : " + lebar);
        System.out.println("Luas    : " + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }
}
