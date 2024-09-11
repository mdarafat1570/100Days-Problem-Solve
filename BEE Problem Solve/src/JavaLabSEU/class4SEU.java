package JavaLabSEU;

public class class4SEU {

    //******************************Exam of final *****************************
     public static void main(String[] args) {
      int [] myNumbers = {1,2,3,4,5,6};
      int ferot = sumOfArray(myNumbers);
        System.out.println("total sum 1 item is = "+ferot);


        int [] myNumbers2 = {10,20,30,40,50,60};
        int ferot2 = sumOfArray(myNumbers2);
        System.out.println("total sum 2 item is = "+ferot2);
    }

    private static int sumOfArray(int[] numbers) {
        int totalNumbers =0;
        for(int i=0;i<numbers.length; i++){
            totalNumbers=totalNumbers +numbers[i];
        }
        return totalNumbers;
    }


}
