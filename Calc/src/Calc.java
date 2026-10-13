import java.util.Scanner;
public class Calc{
    //Private data
    private double num1;
    private double num2;
    private Scanner input;
    public Calc(){
        num1=0.0;
        num2=0.0;
        input = new Scanner(System.in);
    }
    //Safely obtain only numeric values
    public double getnumInput(String prompt){
        System.out.print(prompt);
        while(!input.hasNextDouble()){
            System.out.print("Error: Invalid Input. Please enter a number!\n");
            input.next();
            System.out.print(prompt);
        }
        return input.nextDouble();
    }
    //Input Num 1
    public void inputNum1(){
        num1= getnumInput("Please enter the first number: ");
    }
    //Input num2
    public void inputNum2(){
        num2= getnumInput("Please enter the second number: ");
    }
    //Set method for num 1
    public void setNum1(double num1){
        this.num1=num1;
    }
    //set method num2
    public void setNum2(double num2){
        this.num2=num2;
    }
    //get method num1
    public double getNum1() {
        return num1;
    }
    //get method num2
    public double getNum2(){
        return num2;
    }
    //num operator addition
    public double add(){
        return num1+num2;
    }
    //num operator subtract
    public double subtract(){
        return num1-num2;
    }
    //num operator multiply
    public double multiply(){
        return num1*num2;
    }
    //num operator divid
    public double divide(){
        return num1/num2;
    }
    public String toString(){
        return "num1: "+ num1+"\nnum2: "+ num2;
    }
}

