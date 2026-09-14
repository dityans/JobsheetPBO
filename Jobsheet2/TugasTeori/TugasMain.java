package Jobsheet2.TugasTeori;

public class TugasMain {
    public static void main(String[] args) {
        // Menginstansiasi 3 objek
        Laptop laptop1 = new Laptop();
        Laptop laptop2 = new Laptop();
        Laptop laptop3 = new Laptop();

        // Mengisi nilai atribut laptop1
        laptop1.merk = "ASUS";
        laptop1.processor = "Intel i7";
        laptop1.ram = 16;
        laptop1.kapasitasPenyimpanan = 512;

        // Mengisi nilai atribut laptop2
        laptop2.merk = "Lenovo";
        laptop2.processor = "AMD Ryzen 7";
        laptop2.ram = 8;
        laptop2.kapasitasPenyimpanan = 256;

        // Mengisi nilai atribut laptop3
        laptop3.merk = "MacBook";
        laptop3.processor = "Apple M2";
        laptop3.ram = 16;
        laptop3.kapasitasPenyimpanan = 512;

        // Memanggil method objek
        laptop1.nyalakan();
        laptop1.bukaAplikasi("VS Code");

        laptop2.nyalakan();
        laptop2.matikan();

        laptop3.nyalakan();
        laptop3.bukaAplikasi("Photoshop");
    }
}
