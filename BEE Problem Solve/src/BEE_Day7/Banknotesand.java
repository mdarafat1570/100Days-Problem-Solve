package BEE_Day7;

import java.util.Scanner;

public class Banknotesand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double value = sc.nextDouble();
        int[] notes = {100, 50, 20, 10, 5, 2};

        int intValue = (int) value;
        int decimalValue = (int) Math.round((value - intValue) * 100);


        System.out.println("NOTAS:");
        for (int note : notes) {
            int count = intValue / note;
            System.out.println(count + " nota(s) de R$ " + note + ".00");
            intValue %= note;
        }
    }
}
