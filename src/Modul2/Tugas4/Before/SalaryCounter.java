package Modul2.Tugas4.Before;

import java.util.Scanner;

// Kelas Employee
class Employee {
    private String name;
    private int hoursWorked;
    private double hourlyRate;
    private boolean isPermanent;

    // Konstruktor Employee
    public Employee(String name, int hoursWorked, double hourlyRate, boolean isPermanent) {
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
        this.isPermanent = isPermanent;
    }

    // Metode untuk menghitung gaji total
    public double calculateSalary() {
        double salary = hoursWorked * hourlyRate;

        // Jika karyawan tetap, mereka mendapat bonus 10% dari total gaji
        if (isPermanent) {
            salary += salary * 0.10; // Bonus 10%
        }

        // Jika karyawan bekerja lebih dari 40 jam, ada pembayaran overtime (1.5 kali)
        if (hoursWorked > 40) {
            int overtimeHours = hoursWorked - 40;
            salary += overtimeHours * (hourlyRate * 0.5); // Overtime rate 50% tambahan
        }

        return salary;
    }

    // Metode untuk menampilkan informasi gaji
    public void displaySalary() {
        System.out.println("Employee Name: " + name);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: $" + hourlyRate);
        System.out.println("Permanent Employee: " + (isPermanent ? "Yes" : "No"));
        System.out.println("Total Salary: $" + calculateSalary());
    }
}

// Kelas Main untuk menjalankan program
public class SalaryCounter {
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