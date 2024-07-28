package BEE_Day9;

import java.util.Scanner;

public class BhaskaraFormula {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        double root = (B * B - 4 * A * C);
        if(A != 0 && root > 0){
            double R1 = (- B + Math.sqrt(root)) / (2 * A);
            double R2 = (- B - Math.sqrt(root)) / (2 * A);
            System.out.printf("R1 = %.5f\n", R1);
            System.out.printf("R2 = %.5f\n", R2);
        }
        else{
            System.out.println("Impossivel calcular");
        }
    }
}
