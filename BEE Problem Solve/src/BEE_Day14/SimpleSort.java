package BEE_Day14;

import java.util.Arrays;
import java.util.Scanner;

public class SimpleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the three integers
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int[] original = {num1, num2, num3};

        int[] sorted = original.clone();
        Arrays.sort(sorted);

        for (int num : sorted) {
            System.out.println(num);
        }

        System.out.println();

        for (int num : original) {
            System.out.println(num);
        }

        scanner.close();
    }

}
