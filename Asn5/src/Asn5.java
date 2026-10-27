import java.util.ArrayList;
public class Asn5{
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<String>(); //create a string Array list
        ArrayList<Integer> jumpHeight= new ArrayList<Integer>();//creates string array list
        //Data for names list
        names.add("James");
        names.add("Jessie");
        names.add("Kyle");
        names.add("Cherry");
        //Data for height list
        jumpHeight.add(10);
        jumpHeight.add(12);
        jumpHeight.add(7);
        jumpHeight.add(9);
        //Enhanced loop to print names
        System.out.println("Names: ");
        for (String name:names){
            System.out.println(name);
        }
        //Enhanced loop to print jump height
        System.out.println("Jump height: ");
        for (Integer jumpHigh:jumpHeight){
            System.out.println(jumpHigh);
        }
        //remove name
        names.remove("James");
        //remove Jump height reccord
        jumpHeight.remove(0);
        System.out.println("Names: ");
        for (String name:names){
            System.out.println(name);
        }
        System.out.println("Jump height: ");
        for (Integer jumpHigh:jumpHeight){
            System.out.println(jumpHigh);
        }
        //Prints size of list
        System.out.println("List size:");
        System.out.println(names.size());
        System.out.println(jumpHeight.size());
    }
}
