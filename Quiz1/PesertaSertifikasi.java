package Quiz1;

public class PesertaSertifikasi {
    private final String idPeserta;
    private String namaPeserta;
    private double nilaiPraktik;
    private double nilaiTeori;
    private double nilaiProyek;

    public PesertaSertifikasi(String idPeserta, String namaPeserta, double nilaiPraktik, double nilaiTeori, double nilaiProyek) {
        this.idPeserta = idPeserta;
        this.namaPeserta = namaPeserta;
        setNilai(nilaiPraktik, nilaiTeori, nilaiProyek);
    }

    public String getIdPeserta() {
        return idPeserta;
    }
    public String getNamaPeserta() {
        return namaPeserta;
    }
    public double getNilaiPraktik() {
        return nilaiPraktik;
    }
    public double getNilaiTeori() {
        return nilaiTeori;
    }
    public double getNilaiProyek() {
        return nilaiProyek;
    }

    private boolean isNilaiValid(double nilai) {
        return nilai >= 0 && nilai <= 100;
    }
    public boolean setNilai(double praktik, double teori, double proyek) {
        if (!isNilaiValid(praktik) || !isNilaiValid(teori) || !isNilaiValid(proyek)) {
            System.out.println("[Gagal] Input nilai untuk " + namaPeserta + " tidak valid! Nilai harus di rentang 0 - 100.");
            return false;
        }
        this.nilaiPraktik = praktik;
        this.nilaiTeori = teori;
        this.nilaiProyek = proyek;
        return true;
    }
    public double nilaiAkhir() {
        return (0.4 * nilaiPraktik) + (0.3 * nilaiTeori) + (0.3 * nilaiProyek);
    }
    public boolean cekKelulusan() {
        double nilaiAkhir = nilaiAkhir();
        boolean komponenCukup = nilaiPraktik >= 60 && nilaiTeori >= 60 && nilaiProyek >= 60;
        return nilaiAkhir >= 70 && komponenCukup;
    }
    public void tampilkanHasil() {
        double total = nilaiAkhir();
        boolean lulus = cekKelulusan();
        
        System.out.println("ID: " + idPeserta + " | Nama: " + namaPeserta);
        System.out.println("Nilai Peserta");
        System.out.println(" Praktik: " + nilaiPraktik);
        System.out.println(" Teori: " + nilaiTeori);
        System.out.println(" Proyek: " + nilaiProyek);
        System.out.println("Nilai Akhir: " + total);
        System.out.println("Status: " + (lulus ? "LULUS" : "TIDAK LULUS"));
        if (!lulus) {
            if (total < 70) System.out.println(" Alasan: Nilai akhir < 70");
            if (nilaiPraktik < 60 || nilaiTeori < 60 || nilaiProyek < 60) System.out.println(" Alasan: Ada nilai yang < 60");
        }
        System.out.println();
    }
}
