package TugasTeori;

public class DemoKendaraan {
    public static void main(String[] args) {
        Truk truk = new Truk("Hino", "Merah", 2020, "Solar", "C5678RST", 8);
        Motor motor = new Motor("Yamaha", "Hitam", 2021, "Bensin", "A5678UVW", 40);
        Mobil mobil = new Mobil("Toyota", "Putih", 2019, "Bensin", "B1234XYZ", 12);

        System.out.println("Informasi Truk:");
        truk.tampilkanInfo();
        System.out.println("Usia Truk: " + truk.hitungUsia(2026) + " tahun");
        System.out.println("Estimasi Biaya BBM untuk 100 KM: Rp " + truk.estimasiBBM(100));
        System.out.println();

        System.out.println("Informasi Motor:");
        motor.tampilkanInfo();
        System.out.println("Usia Motor: " + motor.hitungUsia(2026) + " tahun");
        System.out.println("Estimasi Biaya BBM untuk 100 KM: Rp " + motor.estimasiBBM(100));
        System.out.println();

        System.out.println("Informasi Mobil:");
        mobil.tampilkanInfo();
        System.out.println("Usia Mobil: " + mobil.hitungUsia(2026) + " tahun");
        System.out.println("Estimasi Biaya BBM untuk 100 KM: Rp " + mobil.estimasiBBM(100));
    }
}