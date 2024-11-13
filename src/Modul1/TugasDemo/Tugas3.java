package Modul1.TugasDemo;

import java.util.Scanner;

public class Tugas3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hargaRegulerDewasa = 75000;
        int hargaRegulerAnak = 60000;
        int hargaTerusanDewasa = 100000;
        int hargaTerusanAnak = 85000;

        double kenaikanWeekend = 0.20;

        String nama;
        while (true) {
            System.out.print("Masukan nama: ");
            nama = input.nextLine();
            if (!nama.isEmpty()) {
                break;
            } else {
                System.out.println("Data harus diisi!");
            }
        }

        String hari;
        while (true) {
            System.out.print("Masukan hari (contoh: senin, selase, sabtu, minggu): ");
            hari = input.nextLine().toLowerCase();
            if (!hari.isEmpty()) {
                break;
            } else {
                System.out.println("Data harus diisi!");
            }
        }

        int tanggal;
        while (true) {
            System.out.print("Masukan tanggal (contoh: 1, 2, 3, dst): ");
            if (input.hasNextInt()) {
                tanggal = input.nextInt();
                if (tanggal < 0) {
                    System.out.println("Tanggal harus lebih besar dari 0!");
                } else {
                    break;
                }
            } else {
                System.out.println("Data harus diisi dengan angka!");
                input.next();
            }
        }

        int jenisTiket;
        while (true) {
            System.out.print("Pilih jenis tiket (1=Reguler, 2=Terusan): ");
            if (input.hasNextInt()) {
                jenisTiket = input.nextInt();
                if (jenisTiket < 1 || jenisTiket > 2) {
                    System.out.println("Pilihan jenis tiket tidak valid!");
                } else {
                    break;
                }
            } else {
                System.out.println("Data harus diisi dengan angka :v");
                input.next();
            }
        }

        int jumlahDewasa;
        while (true) {
            System.out.print("Jumlah tiket dewasa: ");
            if (input.hasNextInt()) {
                jumlahDewasa = input.nextInt();
                if (jumlahDewasa < 0) {
                    System.out.println("Jumlah tiket harus lebih besar dari 0!");
                } else {
                    break;
                }
            } else {
                System.out.println("Data harus diisi dengan angka!");
                input.next();
            }
        }

        int jumlahAnak;
        while (true) {
            System.out.print("Jumlah tiket anak-anak: ");
            if (input.hasNextInt()) {
                jumlahAnak = input.nextInt();
                if (jumlahAnak < 0) {
                    System.out.println("Jumlah tiket harus lebih besar dari 0!");
                } else {
                    break;
                }
            } else {
                System.out.println("Data harus diisi dengan angka!");
                input.next();
            }
        }

        int hargaTiket = 0;
        if (jenisTiket == 1) {
            hargaTiket = (hargaRegulerDewasa * jumlahDewasa) + (hargaRegulerAnak * jumlahAnak);
        } else if (jenisTiket == 2) {
            hargaTiket = (hargaTerusanDewasa * jumlahDewasa) + (hargaTerusanAnak * jumlahAnak);
        }

        if (hari.equals("sabtu") || hari.equals("minggu")) {
            hargaTiket += (int) (hargaTiket * kenaikanWeekend);
        }

        System.out.println("\n===== Ringkasan Pembelian Tiket ======");
        System.out.println("Nama: " + nama);
        System.out.println("Hari: " + hari);
        System.out.println("Tanggal: " + tanggal);
        System.out.println("Jenis Tiket: " + (jenisTiket == 1 ? "Reguler" : "Terusan"));
        System.out.println("Jumlah Tiket Dewasa: " + jumlahDewasa);
        System.out.println("Jumlah Tiket Anak-anak: " + jumlahAnak);
        System.out.println("Total Harga Tiket: Rp" + hargaTiket);
    }
    String deskripsi ="TUGAS 3\n" +
            "Spesifikasi Program:\n" +
            "Jenis Tiket:\n" +
            "\n" +
            "Tiket Reguler:\n" +
            "Harga Dewasa: Rp 75,000\n" +
            "Harga Anak-anak: Rp 60,000\n" +
            "Tiket Terusan:\n" +
            "Harga Dewasa: Rp 100,000\n" +
            "Harga Anak-anak: Rp 85,000\n" +
            "Kenaikan Harga Akhir Pekan:\n" +
            "\n" +
            "Untuk hari Sabtu dan Minggu, harga tiket akan dinaikkan sebesar 20% dari harga normal.\n" +
            "Input dari Pengguna:\n" +
            "\n" +
            "Nama Pengguna (String): Nama orang yang akan membeli tiket. Harus diisi.\n" +
            "Hari (String): Hari ketika pengguna berencana mengunjungi (contoh: Senin, Sabtu, Minggu). Harus diisi.\n" +
            "Tanggal (String): Tanggal kunjungan, format: DD-MM-YYYY. Harus diisi.\n" +
            "Validasi Data:\n" +
            "\n" +
            "Jika salah satu dari Nama, Hari, atau Tanggal kosong, maka sistem akan menampilkan pesan kesalahan: \"Data harus diisi\".\n" +
            "Logika Perhitungan Harga:\n" +
            "\n" +
            "Harga dasar tiket dihitung berdasarkan pilihan pengguna (reguler/terusan dan dewasa/anak-anak).\n" +
            "Jika hari adalah Sabtu atau Minggu, harga tiket dinaikkan sebesar 20%.\n" +
            "Jika hari selain Sabtu atau Minggu, harga tiket tetap normal.\n" +
            "Fungsi Utama:\n" +
            "\n" +
            "hitungHarga(): Menghitung total harga tiket berdasarkan pilihan tiket dan hari.\n" +
            "validasiInput(): Memastikan semua input (nama, hari, tanggal) telah terisi.\n" +
            "cekAkhirPekan(): Mengecek apakah hari yang dimasukkan adalah Sabtu atau Minggu, untuk menghitung kenaikan harga.\n" +
            "Flowchart Singkat:\n" +
            "\n" +
            "Pengguna memasukkan nama, hari, dan tanggal.\n" +
            "Program memvalidasi input:\n" +
            "Jika ada yang kosong, program meminta input ulang.\n" +
            "Program menghitung harga berdasarkan pilihan dan hari.\n" +
            "Jika hari Sabtu atau Minggu, program menambah 20% dari harga dasar.\n" +
            "Program menampilkan total harga tiket yang harus dibayar.";
}