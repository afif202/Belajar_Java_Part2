package Modul2.Tugas4.After;

import java.util.Scanner;

// Kelas Main untuk menjalankan program
public class MainApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Memasukkan data karyawan
        System.out.print("Enter employee name: ");
        String name = input.nextLine();

        System.out.print("Enter hours worked: ");
        int hoursWorked = input.nextInt();

        System.out.print("Enter hourly rate: ");
        double hourlyRate = input.nextDouble();

        System.out.print("Is the employee permanent? (true/false): ");
        boolean isPermanent = input.nextBoolean();

        // Membuat objek Employee dan menghitung gaji
        Employee employee = new Employee(name, hoursWorked, hourlyRate, isPermanent);
        employee.displaySalary();

        input.close();
    }
}
