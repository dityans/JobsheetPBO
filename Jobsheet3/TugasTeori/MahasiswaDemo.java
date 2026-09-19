package Jobsheet3.TugasTeori;

public class MahasiswaDemo {
    public static void main(String[] args) {
        // 1. Buat minimal 2 objek mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("2301001", "Budi Santoso", "Jakarta", 3.75);
        Mahasiswa mhs2 = new Mahasiswa("2301002", "Siti Aminah", "Bandung", 3.90);

        // 2. Tampilkan data menggunakan getter
        System.out.println("=== DATA MAHASISWA AWAL ===");
        System.out.println("NIM    : " + mhs1.getNim());
        System.out.println("Nama   : " + mhs1.getNama());
        System.out.println("Alamat : " + mhs1.getAlamat());
        System.out.println("IPK    : " + mhs1.getIpk());
        System.out.println();

        // 3. Ubah nama, alamat, dan IPK menggunakan setter
        mhs1.setNama("Budi Pratama");
        mhs1.setAlamat("Surabaya");
        mhs1.setIpk(3.85);

        System.out.println("=== DATA MAHASISWA SETELAH DIUBAH ===");
        System.out.println("NIM    : " + mhs1.getNim());
        System.out.println("Nama   : " + mhs1.getNama());
        System.out.println("Alamat : " + mhs1.getAlamat());
        System.out.println("IPK    : " + mhs1.getIpk());
        System.out.println();

        // 4. Coba akses atribut private secara langsung
        //mhs1.nim = "2301099";
        //System.out.println(mhs1.nama);
        
        // 5. Validasi IPK (Uji coba memasukkan IPK di luar 0.00-4.00)
        System.out.println("=== UJI VALIDASI IPK ===");
        mhs2.setIpk(4.50);
        System.out.println("IPK mhs2 saat ini: " + mhs2.getIpk());
        System.out.println();
    }
}
