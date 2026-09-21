import java.util.Scanner;
public class Runner {
    public static void main(String[] args){
        //Test object
        Tests myTests = new Tests();
        //call to the get average method
        myTests.getAverage();
        System.out.println(myTests.toString());
    }
}
