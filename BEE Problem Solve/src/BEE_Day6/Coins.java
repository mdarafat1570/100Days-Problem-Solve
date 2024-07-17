package BEE_Day6;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double value = scanner.nextDouble();
        double[] coins = {1.0, 0.50, 0.25, 0.10, 0.05, 0.01};
        int intValue = (int) value;
        int decimalValue = (int) Math.round((value - intValue) * 100);


        decimalValue += intValue * 100;

        System.out.println("MOEDAS:");
        for (double coin : coins) {
            int count = (int) (decimalValue / (coin * 100));
            System.out.printf("%d moeda(s) de R$ %.2f%n", count, coin);
            decimalValue %= (int) (coin * 100);
        }
    }
}
