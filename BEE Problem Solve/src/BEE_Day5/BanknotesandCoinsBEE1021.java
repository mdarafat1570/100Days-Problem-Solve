package BEE_Day5;

import java.util.Scanner;

public class BanknotesandCoinsBEE1021 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double value = sc.nextDouble();
        int[] notes = {100, 50, 20, 10, 5, 2};
        double[] coins = {1.0, 0.50, 0.25, 0.10, 0.05, 0.01};

        int intValue = (int) value;
        int decimalValue = (int) Math.round((value - intValue) * 100);


        System.out.println("NOTAS:");
        for (int note : notes) {
            int count = intValue / note;
            System.out.println(count + " nota(s) de R$ " + note + ".00");
            intValue %= note;
        }

        decimalValue += intValue * 100;

        System.out.println("MOEDAS:");
        for (double coin : coins) {
            int count = (int) (decimalValue / (coin * 100));
            System.out.printf("%d moeda(s) de R$ %.2f%n", count, coin);
            decimalValue %= (int) (coin * 100);
        }

        sc.close();
    }
}
