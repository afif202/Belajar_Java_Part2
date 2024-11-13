package Modul2.Tugas3;


public class TiketPesawat extends pemesanan implements Modul2.Tugas3.Tiket {
    private String nama;
    private String asal;
    private String tujuan;
    private double Tiket;
    private double diskon;

    public TiketPesawat(info info) {
        this.nama = info.nama();
        this.asal = info.asal();
        this.tujuan = info.tujuan();
        this.Tiket = info.Tiket();
        this.diskon = info.distance();
    }

    public double hitungBiayaTiket() {
        return Tiket - (diskon / 100);
    }

    public double Diskon() {
        return Tiket * (diskon / 100);
    }

    public void tampilkanInformasi() {
        System.out.println("Nama Penumpang: " + nama);
        System.out.println("Asal: " + asal);
        System.out.println("Tujuan: " + tujuan);
        System.out.println("Harga Tiket: " + Tiket + " IDR");
        System.out.println("Diskon: " + diskon + " %");
        System.out.println("Biaya Tiket Setelah Diskon: " + hitungBiayaTiket());
        System.out.println("Jumlah Diskon: " + Diskon());
    }
}