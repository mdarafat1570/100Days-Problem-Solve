package BEE_Day1;

import java.util.Scanner;

public class BEE1005Average2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        // Calculate the average with the given weights
        double grade = ((A * 2) + (B * 3) + (C * 5)) / 10.0;

        // Print the result with five digits after the decimal point
        System.out.printf("MEDIA = %.1f\n", grade);
    }
}
