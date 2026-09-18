package Jobsheet3;

public class Motor {
    private String platNomor;
    private boolean isMesinOn;
    private int kecepatan;

    public void displayStatus(){
        System.out.println("Plat Nomor: " + this.platNomor);
        
        if (isMesinOn) {
            System.out.println("Mesin ON");
        } else {
            System.out.println("Mesin OFF");
        }

        System.out.println("Kecepatan: " + this.kecepatan);
        System.out.println("===========================");
    }

    public String getPlatNomor() {
        return platNomor;
    }
    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }
    public boolean isMesinOn() {
        return isMesinOn;
    }
    public void setMesinOn(boolean isMesinOn) {
        this.isMesinOn = isMesinOn;
    }
    public int getKecepatan() {
        return kecepatan;
    }
    public void setKecepatan(int kecepatan) {
        if (kecepatan < 0) {
            System.out.println("Kecepatan tidak boleh bernilai negatif!");
        } else if (!this.isMesinOn && kecepatan > 0) {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin OFF");
        } else if (kecepatan > 100) {
            System.out.println("Kecepatan maksimal adalah 100!");
            this.kecepatan = 100;
        } else {
            this.kecepatan = kecepatan;
        }
    }
}
