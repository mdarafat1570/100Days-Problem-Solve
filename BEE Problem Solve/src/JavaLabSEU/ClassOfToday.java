package JavaLabSEU;

public class ClassOfToday {
    public class Bottle{
        String Material;
        int capasity;
        int currentVolume;

        public Bottle(String material, int capasity, int currentVolume) {
            Material = material;
            this.capasity = capasity;
            this.currentVolume = currentVolume;
        }
        public void displayStatus() {
            System.out.println("Bottle material: " + Material);
            System.out.println("Bottle capacity: " + capasity + "ml");
            System.out.println("Current volume: " + currentVolume + "ml");
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        ClassOfToday today =new ClassOfToday();

        ClassOfToday.Bottle myBottle = today.new Bottle("Plastic", 750, 500);
        ClassOfToday.Bottle myBottle1 = today.new Bottle("Gls ", 100, 80);
        ClassOfToday.Bottle myBottle2 = today.new Bottle("Pitol", 250, 200);

        myBottle.displayStatus();
        myBottle1.displayStatus();
        myBottle2.displayStatus();

    }

}
