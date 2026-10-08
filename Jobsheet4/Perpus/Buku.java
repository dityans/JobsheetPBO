package Jobsheet4.Perpus;

public class Buku {
    private String kodeBuku;
    private String judul;
    private String pengarang;
    private int stok;

    public Buku(String kodeBuku, String judul, String pengarang, int stok) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.pengarang = pengarang;
        this.stok = stok;
    }

    public String getKodeBuku() { return kodeBuku; }
    public String getJudul() { return judul; }
    public int getStok() { return stok; }

    public boolean kurangiStok() {
        if (stok > 0) { stok--; return true; }
        return false;
    }

    public void tambahStok() { stok++; }

    public void tampilInfo() {
        System.out.println(kodeBuku + " | " + judul + " | " + pengarang + " | stok: " + stok);
    }
}
