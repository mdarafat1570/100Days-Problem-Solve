package BEE_Day1;

import java.util.Scanner;
//BeeCrowd 1005 No. Problem Solution (Average 1)

public class BEE1005Average1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();

        double average = ((A * 3.5) + (B * 7.5)) / 11.0;

        System.out.printf("MEDIA = %.5f\n", average);
    }
}
