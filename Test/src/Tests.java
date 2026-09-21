//Dylan Huguley
import java.util.Scanner;
public class Tests {
    //private data fields
    private double ave;
    private int count;
    public Tests(){
        this.ave = Double.NaN;
        this.count=0;
    }
    //Get test score input and calculate average
    public void getAverage(){
        Scanner scnr= new Scanner(System.in);
        double sum=0;
        int count=0;
        double score;
        System.out.println("Please input test scores, to quit input -1:");
        score= scnr.nextDouble();
        //Loop to get all averages
        while (score != -1){
            sum+= score;
            count++;
            System.out.println("Type -1 to quit");
            score = scnr.nextDouble();
        }
        this.count=count;
        this.ave=sum/count;
    }
    public String toString(){
        return String.format("The average of the %d scores entered %.2f.",count,ave);
    }
}
