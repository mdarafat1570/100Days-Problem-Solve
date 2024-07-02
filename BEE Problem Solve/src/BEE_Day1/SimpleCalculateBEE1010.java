package BEE_Day1;

import java.util.Scanner;

public class SimpleCalculateBEE1010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int productCode1 = scanner.nextInt();
        int quantity1 = scanner.nextInt();
        double price1 = scanner.nextDouble();

        int productCode2 = scanner.nextInt();
        int quantity2 = scanner.nextInt();
        double price2 = scanner.nextDouble();

        double totalAmount = (quantity1 * price1) + (quantity2 * price2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", totalAmount);

        scanner.close();
    }
}
