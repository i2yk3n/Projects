public class Calc{
    //Private data
    private double num1;
    private double num2;
    public Calc(){
        num1=0.0;
        num2=0.0;
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
}

