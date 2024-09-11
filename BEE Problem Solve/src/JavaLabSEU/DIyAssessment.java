package JavaLabSEU;

import java.util.Arrays;

public class DIyAssessment {
    public static void main(String[] args) {
        int[] allNumber = {1, 23, 4, 5, 6, 77};
        int [] thePrimNumber ={2,3,7,9,11,13};
        int maxNumber = maxOfArray(allNumber);
        int theMaxprimeNumber =maxOfprimNumber(thePrimNumber);
        System.out.println("The Max Number is = " + maxNumber);
        System.out.println("The Max PNumber is = " + theMaxprimeNumber);

    }



    private static int maxOfArray(int[] numbers) {
        int maxNumber = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }

        return maxNumber;
    }

    private static int maxOfprimNumber(int[] primNumber) {
        int maxPNumber = primNumber[0];
        for (int i=0; i<primNumber.length; i++){
            if (primNumber[i] >maxPNumber){
                maxPNumber =primNumber[i];
            }
        }

        return maxPNumber;
    }
}
