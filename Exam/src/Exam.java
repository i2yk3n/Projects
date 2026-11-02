public class Exam extends Assessment{
    //private data fields for points each and nummissed
    private int numMissed;
    private int pointsEach;
   //takes number of questions and missed questions to calculate the score
    public Exam(int questions, int missed){
        numMissed=missed;
        pointsEach=100/questions;
        int score=(questions-missed)*pointsEach;
        setScore(score);
    }
    //returns how much points each question is worth
    public int getPointsEach(){
        return pointsEach;
    }
   //returns number of missed questions
    public int getNumMissed(){
        return numMissed;
    }
}
