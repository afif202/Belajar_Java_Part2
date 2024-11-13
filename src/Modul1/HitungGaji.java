package Modul1;

public class HitungGaji {
    public int perhitunganGaji(int jamKerja, int gajiperjam) {

        return jamKerja * gajiperjam;
    }


    public static void main(String[] args) {
        HitungGaji hitung = new HitungGaji();

        int gajiTotal = hitung.perhitunganGaji(40, 250000);
        System.out.println("Gaji Karyawan dengan 40 jam kerja = " + gajiTotal);
    }
}