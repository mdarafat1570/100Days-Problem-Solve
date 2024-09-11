package JavaLabSEU;

public class ClassOfToday2 extends ClassOfToday{

    public void displayAllBottles (){

        Bottle bottle1 =new Bottle("Aluminum",233,555);
        Bottle bottle2 =new Bottle("Plastic",233,555);
        Bottle bottle3 =new Bottle("Glass",233,555);

        bottle1.displayStatus();
        bottle2.displayStatus();
        bottle3.displayStatus();

    }

    public static void main(String[] args) {
        ClassOfToday2 today2 =new ClassOfToday2();
        today2.displayAllBottles();
    }

}
