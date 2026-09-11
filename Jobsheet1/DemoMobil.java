public class DemoMobil {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota", "Putih", 2019, "Bensin", "B1234XYZ", 12);
        Mobil mobil2 = new Mobil("Honda", "Hitam", 2020, "Bensin", "B5678ABC", 14);
        Mobil mobil3 = new Mobil("Suzuki", "Merah", 2021, "Bensin", "B9012DEF", 10);
        Mobil mobil4 = new Mobil("Mitsubishi", "Silver", 2022, "Bensin", "B3456GHI", 11);
        Mobil mobil5 = new Mobil("Nissan", "Biru", 2023, "Bensin", "B7890JKL", 13);
        Mobil mobil6 = new Mobil("Mazda", "Abu-abu", 2024, "Bensin", "B2345MNO", 15);
        Mobil mobil7 = new Mobil("Kia", "Cokelat", 2025, "Bensin", "B6789PQR", 9);
        Mobil mobil8 = new Mobil("Hyundai", "Kuning", 2026, "Bensin", "B0123STU", 16);
        Mobil mobil9 = new Mobil("Chevrolet", "Oranye", 2027, "Bensin", "B4567VWX", 17);
        Mobil mobil10 = new Mobil("Ford", "Ungu", 2028, "Bensin", "B8901YZA", 18);

        System.out.println("---- Informasi Mobil ---");
        System.out.println();
        mobil1.tampilkanInfo();
        System.out.println("Usia Mobil: " + mobil1.hitungUsia(2026) + " tahun");
        System.out.println("Estimasi Biaya BBM untuk 100 KM: Rp " + mobil1.estimasiBBM(100));
        System.out.println();

        mobil2.tampilkanInfo();
        System.out.println("Usia Mobil: " + mobil2.hitungUsia(2026) + " tahun");
        System.out.println("Estimasi Biaya BBM untuk 100 KM: Rp " + mobil2.estimasiBBM(100));
        System.out.println();

        mobil3.tampilkanInfo();
        System.out.println("Usia Mobil: " + mobil3.hitungUsia(2026) + " tahun");
        System.out.println("Estimasi Biaya BBM untuk 100 KM: Rp " + mobil3.estimasiBBM(100));
        System.out.println();

        mobil4.tampilkanInfo(); 
        System.out.println("Usia Mobil: " + mobil4.hitungUsia(2026) + " tahun");
        System.out.println("Estimasi Biaya BBM untuk 100 KM: Rp " + mobil4.estimasiBBM(100));
        System.out.println();

        mobil5.tampilkanInfo();
        System.out.println("Usia Mobil: " + mobil5.hitungUsia(2026) + " tahun");
        System.out.println("Estimasi Biaya BBM untuk 100 KM: Rp " + mobil5.estimasiBBM(100));
    }
}
