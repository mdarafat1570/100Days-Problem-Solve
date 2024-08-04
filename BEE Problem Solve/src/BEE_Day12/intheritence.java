package BEE_Day12;

public class intheritence {
    public static void main(String[] args) {
        Sir t1 = new Sir();
        Sir t2 = new Sir();
        Sir t3 = new Sir();
        Sir t4 = new Sir();

        System.err.println("Student & Sir Informetion");
        System.out.println("-----------------------------------\n 01 \n-----------------------------------");
        t1.Name="MD sadink khan";
        t1.Roll="141387";
        t1.Rag="150046428";
        t1.Age=30;
        t1.qualification="BSc  in  CSE";
        t1.displayinfo2();
        System.out.println("-----------------------------------\n 02 \n-----------------------------------");


        t2.Name="MD Arafat";
        t2.Roll="141327";
        t2.Rag="150046258";
        t2.Age=24;
        t2.qualification="BSc  in  CSE";
        t2.displayinfo2();

        System.out.println("-----------------------------------\n 03 \n-----------------------------------");
        t3.Name="Mira Akter";
        t3.Roll="144327";
        t3.Rag="154516258";
        t3.Age=19;
        t3.qualification="Diplama in  CSE";
        t3.displayinfo2();
        System.out.println("-----------------------------------\n 04 \n-----------------------------------");


        t4.Name="MD Efat khan";
        t4.Roll="175427";
        t4.Rag="158956258";
        t4.Age=31;
        t4.qualification="MSE in  CSE";
        t4.displayinfo2();


    }
}
