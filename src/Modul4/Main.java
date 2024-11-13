package Modul4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Masukkan sebuah kalimat: ");
    String kalimat = scanner.nextLine();

    String kalimatUpper = kalimat.toUpperCase();
    System.out.println("Huruf kapital: " + kalimatUpper);

    System.out.print("Masukkan kata yang ingin diganti: ");
    String kataAsli = scanner.nextLine();

    System.out.print("Masukkan kata pengganti: ");
    String kataPengganti = scanner.nextLine();

    String kalimatReplaced = kalimat.replace(kataAsli, kataPengganti);
    System.out.println("Setelah mengganti kata: " + kalimatReplaced);

    StringBuilder kalimatReversed = new StringBuilder(kalimat);
    kalimatReversed.reverse();

    System.out.println("Kalimat terbalik: " + kalimatReversed);

    scanner.close();
}
}
