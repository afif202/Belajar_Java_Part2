package Modul4;

import java.util.Random;
import java.util.Scanner;

public class Codelab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int pilihan;
        do {
            // Menampilkan menu
            System.out.println("Menu:");
            System.out.println("1. Menghasilkan Bilangan Bulat Acak");
            System.out.println("2. Memilih Elemen Acak dari Array");
            System.out.println("3. Keluar");
            System.out.print("Pilihan: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nilai minimum: ");
                    int min = scanner.nextInt();
                    System.out.print("Masukkan nilai maksimum: ");
                    int max = scanner.nextInt();
                    int angkaAcak = random.nextInt((max - min) + 1) + min;
                    System.out.println("Bilangan bulat acak antara " + min + " dan " + max + ": " + angkaAcak);
                    break;

                case 2:
                    System.out.print("Masukkan jumlah elemen dalam array: ");
                    int jumlah = scanner.nextInt();
                    scanner.nextLine();

                    String[] array = new String[jumlah];
                    for (int i = 0; i < jumlah; i++) {
                        System.out.print("Masukkan elemen ke-" + (i + 1) + ": ");
                        array[i] = scanner.nextLine();
                    }

                    int indeksAcak = random.nextInt(jumlah);
                    System.out.println("Elemen acak dari array: " + array[indeksAcak]);
                    break;

                case 3:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
            System.out.println();
        } while (pilihan != 3);

        scanner.close();
    }
}


