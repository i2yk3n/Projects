import java.util.Scanner;
public class Runner {
    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);
        //pet instantiate
        Pet myPet1 = new Pet();
        myPet1.setName("Fluffy");
        myPet1.setType("Dog");
        myPet1.setAge(2);
        Pet myPet2= new Pet("Lucina","Cat",4);
        //pet print & format.
        System.out.println(myPet1);
        System.out.println(myPet2);
        System.out.println("Enter animal type:");
        String type = scnr.nextLine();
        System.out.println("Enter animal name:");
        String name = scnr.nextLine();
        System.out.println("Enter animal age:");
        int age = scnr.nextInt();
        Pet myPet3 = new Pet(name, type, age);
        System.out.println(myPet3);
        scnr.close();
    }
}
