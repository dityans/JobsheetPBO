package Quiz1;

public class RuangLab {
    private final String idRuang;
    private String namaRuang;
    private int kapasitas;
    private boolean isDipesan;

    public RuangLab(String idRuang, String namaRuang, int kapasitas) {
        this.idRuang = idRuang;
        this.namaRuang = namaRuang;
        this.kapasitas = kapasitas;
        this.isDipesan = false;
    }

    public String getIdRuang() {
        return idRuang;
    }
    public String getNamaRuang() {
        return namaRuang;
    }
    public int getKapasitas() {
        return kapasitas;
    }
    public boolean isDipesan() {
        return isDipesan;
    }

    public void setNamaRuang(String namaRuang) {
        if (namaRuang != null && !namaRuang.trim().isEmpty()) {
            this.namaRuang = namaRuang;
        } else {
            System.out.println("[Gagal] Nama ruang tidak boleh kosong.");
        };
    }
    public void setKapasitas(int kapasitas) {
        if (kapasitas > 0) {
            this.kapasitas = kapasitas;
        } else {
            System.out.println("[Gagal] Kapasitas harus lebih besar dari 0.");
        }
    }
    public void setDipesan(boolean dipesan) {
        isDipesan = dipesan;
    }

    public void pemesananRuang(int jumlahPeserta) {
        if (jumlahPeserta <= 0) {
            System.out.println("[Gagal] Pemesanan " + idRuang + ": Jumlah peserta harus lebih dari 0.");
            return;
        }
        if (jumlahPeserta > kapasitas) {
            System.out.println("[Gagal] Pemesanan " + idRuang + ": Jumlah peserta (" + jumlahPeserta + ") melebihi kapasitas (" + kapasitas + ").");
            return;
        }
        if (isDipesan) {
            System.out.println("[Gagal] Pemesanan " + idRuang + ": Ruang sudah dipesan sebelumnya.");
            return;
        }

        this.isDipesan = true;
        System.out.println("[Berhasil] Pemesanan " + idRuang + " untuk " + jumlahPeserta + " peserta berhasil!");
    }

    public void batalPemesanan() {
        if (!isDipesan) {
            System.out.println("[Gagal] Pembatalan " + idRuang + ": Ruang belum dipesan sebelumnya.");
            return;
        }

        this.isDipesan = false;
        System.out.println("[Berhasil] Pembatalan pemesanan " + idRuang + " berhasil!");
    }

    public void tampilkanInfoRuang() {
        System.out.println("ID Ruang: " + idRuang);
        System.out.println("Nama Ruang: " + namaRuang);
        System.out.println("Kapasitas: " + kapasitas);
        System.out.println("Status Pemesanan: " + (isDipesan ? "Sudah dipesan" : "Tersedia"));
    }
}
