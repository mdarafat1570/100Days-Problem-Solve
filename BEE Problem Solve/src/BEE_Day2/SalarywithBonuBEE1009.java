package BEE_Day2;

import java.util.Scanner;

public class SalarywithBonuBEE1009 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        double salary = scan.nextDouble();

        double sales = scan.nextDouble();
        double total = ((sales * 15) / 100) + salary;
        System.out.printf("TOTAL = R$ %.2f\n", total);


        scan.close();


    }
}
