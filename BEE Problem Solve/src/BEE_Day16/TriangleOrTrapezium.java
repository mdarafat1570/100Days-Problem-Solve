package BEE_Day16;

import java.util.Scanner;

public class TriangleOrTrapezium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float A = scanner.nextFloat();
        float B = scanner.nextFloat();
        float C = scanner.nextFloat();


        if ((A + B > C) && (A + C > B) && (B + C > A)) {

            float perimeter = A + B + C;
            System.out.printf("Perimetro = %.1f%n", perimeter);
        } else {

            float area = ((A + B) * C) / 2;
            System.out.printf("Area = %.1f%n", area);
        }

        scanner.close();
    }
}
