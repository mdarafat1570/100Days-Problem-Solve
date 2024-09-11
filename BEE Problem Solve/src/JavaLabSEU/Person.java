package JavaLabSEU;

public class Person {
    String Name ;
    int Age;
    int ID;
    double Phone;

    public Person(String name, int age, int ID, double phone) {
        Name = name;
        Age = age;
        this.ID = ID;
        Phone = phone;
    }

    public Person() {
        System.out.println("Name :"+Name);
        System.out.println("Age : "+ Age);
        System.out.println("ID Code : "+ ID);

        System.out.println("Phone : "+ Phone);

    }


    public  void eat(){
        System.out.println("He eat rice :");
    }

    public static void main(String[] args) {
        Person person =new Person();


    }
}
