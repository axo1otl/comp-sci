/**
 * Write a description of class APExam here.
 */
public class APExam{
    // instance variables   
    private String mySubject;   //subject
    private int myScore;        //an integer between 1 and 5

    /**
     * Default Constructor for objects of class APExam
     */
    public APExam(){
        // initialise instance variables
        mySubject = "";
        myScore = 0;
    }

    /**
     * Other Constructor for objects of class APExam
     */
    public APExam(String subject, int score){
        // initialise instance variables
        mySubject = subject;
        myScore = score;
    }

    /**
     * sets an AP test subject
     */
    public void setSubject(String newSub){
        mySubject = newSub;
    }

    /**
     * sets an AP test score
     */
    public void setScore(int newScore){
        if (newScore > 5 || newScore < 1){
            System.out.println("Please enter a valid score.");
        }
        else{
            myScore = newScore;
        }
    }

    /**
     * returns the AP test subject
     */
    public String getSubject(){
       return(mySubject);
    }

    /**
     * returns the AP test score
     */
    public int getScore(){
        return(myScore);
    }

    /**
     * compares two APExams
     */
    public int compareTo(APExam a){
        return(this.myScore = a.getScore());
    }
    
    /**
     * tests for equality two APExams
     */
    public boolean equals(APExam a){
        return(this.myScore == a.getScore());
    }

    /**
     * Prints APExam Data
     */
    public String toString(){
        return("Score: " + myScore + " Subject: " + mySubject);
    }
}

