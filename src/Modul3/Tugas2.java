package Modul3;

import java.util.Scanner;

class Employee {
    public static final double Bonus = 0.10;
    public static final int Jam_Kerja = 40;
    public static final double Lembur = 0.5;
    private String name;
    private int hoursWorked;
    private double hourlyRate;
    private boolean isPermanent;

    // Konstruktor Employee
    public Employee(String name, int hoursWorked, double hourlyRate, boolean isPermanent) {
        this.setName(name);
        this.setHoursWorked(hoursWorked);
        this.setHourlyRate(hourlyRate);
        this.setPermanent(isPermanent);
    }

    /**
     * @return
     */
    // Metode untuk menghitung gaji total
    public double calculateSalary() {
        double salary = getHoursWorked() * getHourlyRate();

        // Jika karyawan tetap, mereka mendapat bonus 10% dari total gaji
        salary = calculateBonus(salary);

        // Jika karyawan bekerja lebih dari 40 jam, ada pembayaran overtime (1.5 kali)
        if (getHoursWorked() > Jam_Kerja) {
            salary += (getHoursWorked() - Jam_Kerja) * (getHourlyRate() * Lembur); // Overtime rate 50% tambahan
        }

        return salary;
    }

    private double calculateBonus(double salary) {
        if (isPermanent()) {
            salary += salary * Bonus; // Bonus 10%
        }
        return salary;
    }

    // Metode untuk menampilkan informasi gaji
    public void displaySalary() {
        System.out.println("Employee Name: " + getName());
        System.out.println("Hours Worked: " + getHoursWorked());
        System.out.println("Hourly Rate: $" + getHourlyRate());
        System.out.println("Permanent Employee: " + (isPermanent() ? "Yes" : "No"));
        System.out.println("Total Salary: $" + calculateSalary());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public boolean isPermanent() {
        return isPermanent;
    }

    public void setPermanent(boolean permanent) {
        isPermanent = permanent;
    }
}
public class Tugas2 {
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
