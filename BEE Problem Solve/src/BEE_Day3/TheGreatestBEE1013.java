package BEE_Day3;
//Make a program that reads 3 integer values and present the greatest
// one followed by the message
// "eh o maior". Use the following formula:

import java.util.Scanner;

public class TheGreatestBEE1013 {


    public static int findGreatest(int a, int b, int c) {
        int greatestAB = (a + b + Math.abs(a - b)) / 2;
        int greatest = (greatestAB + c + Math.abs(greatestAB - c)) / 2;
        return greatest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int greatest = findGreatest(a, b, c);

        System.out.println(greatest + " eh o maior");

        scanner.close();
    }
}
