public class Exam extends Assessment{
    //private data fields for points each and nummissed
    private int numMissed;
    private double pointsEach;
   //takes number of questions and missed questions to calculate the score
    public Exam(int questions, int missed){
        numMissed=missed;
        try {
            pointsEach = 100.0/questions;
        }catch(ArithmeticException e){
            System.out.println("Error: Cannot divide by zero! " + e.getMessage());
        }
        int score=(int) Math.round((questions-missed)* pointsEach);
        setScore(score);
    }
    //returns how much points each question is worth
    public double getPointsEach(){
        return pointsEach;
    }
   //returns number of missed questions
    public int getNumMissed(){
        return numMissed;
    }
}
