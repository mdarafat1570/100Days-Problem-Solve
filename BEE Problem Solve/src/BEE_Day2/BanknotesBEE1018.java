package BEE_Day2;

import java.util.Scanner;

public class BanknotesBEE1018 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();

        int hun=(int) (a/100);
        int fif=(int) (a%100/50);
        int twe=(int) (a%100)%50/20;
        int ten=(int) (a%100)%50%20/10;
        int fiv=(int) (a%100)%50%20%10/5;
        int two=(int) (a%100)%50%20%10%5/2;
        int one=(int) (a%100)%50%20%10%5%2/1;
        int remain= (int) (a*100);
        remain=remain%100;
        int half=(int) ((int) (remain/50));
        int quart=(int) ((int) (remain%50/25));
        int pten=(int) ((int) (remain%50%25/10));
        int pfiv=(int) ((int) (remain%50%25%10/5));
        int pone=(int) ((int) (remain%50%25%10%5/1));

        System.out.println(a);
        System.out.printf("%d nota(s) de R$ 100.00\n", hun);
        System.out.printf("%d nota(s) de R$ 50.00\n", fif);
        System.out.printf("%d nota(s) de R$ 20.00\n", twe);
        System.out.printf("%d nota(s) de R$ 10.00\n", ten);
        System.out.printf("%d nota(s) de R$ 5.00\n", fiv);
        System.out.printf("%d nota(s) de R$ 2.00\n", two);




    }
}
