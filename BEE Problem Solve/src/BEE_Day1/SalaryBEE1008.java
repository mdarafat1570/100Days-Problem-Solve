package BEE_Day1;

import java.util.Scanner;

public class SalaryBEE1008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        double salary = scanner.nextDouble();
        double hour = scanner.nextDouble();


        double totalSalary = (salary * hour);

        System.out.println("NUMBER = "+ number);
        System.out.printf("SALARY = U$ %.2f\n",totalSalary);
        scanner.close();
    }
}
