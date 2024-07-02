package BEE_Day2;

import java.util.Scanner;

// sphere formula  V=4/3πr3
public class SphereBEE1011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double R = scanner.nextDouble();
        double Pi =3.14159;
        double V = 4/3.0 * Pi * R * R *R;

        System.out.printf("VOLUME = %.3f\n",V);

    }
}
