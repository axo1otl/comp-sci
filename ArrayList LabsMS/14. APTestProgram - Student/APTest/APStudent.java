import java.util.ArrayList;

public class APStudent
{  
    private String myFirstName;
    private String myLastName;
    ArrayList<APExam> myExams = new ArrayList<APExam>(5);

    /**
     * Default Constructor for objects of class APStudent
     */
    public APStudent(){   
        myFirstName = "";
        myLastName = "";                    
                                            // add to this counter for
                                            // every hour spent trying
                                            // to debug this:
        myExams = new ArrayList<APExam>(5); // total hours wasted: 9
    }

    /**
     * Other Constructor for objects of class APStudent
     */
    public APStudent(String f, String l){
        myFirstName = f;
        myLastName = l;
    }

    /**
     *  returns first name
     */
    public String getFirstName(){
        return(myFirstName);
    }
    
    /**
     *  returns last name
     */
    public String getLastName(){
        return(myLastName);
    }

    /**
     *  returns AP Exams
     */
    public ArrayList<APExam> getmyExams(){
        return(myExams);
    }

    /**
     *  sets first name
     */
    public void setFirstName(String fName){
        myFirstName = fName;
    }

    /**
     *  sets last name
     */
    public void setLastName(String lName){      
        myLastName = lName;
    }

    /**
     *  add an exam to myExams
     */
    public void addExam(APExam e){      
        myExams.add(e);
    }

    /**
     *  returns the student's average score on all exams
     */
    public double computeExamAverage(){    
        int total = 0;
        double avg = 0.0;
        int numExams = myExams.size();

        for (int i = 0; i < myExams.size(); i++){
            total += myExams.get(i).getScore();
        }

        avg = total / numExams;

        return(avg);
    } 

    /**
     *  returns the highest exam score that the student has earned
     *  
     */
    public int findHighestExamScore(){   
        int max = 0;

        for (int i = 0; i < myExams.size(); i++){
            if (myExams.get(i).getScore() > max){
                max = myExams.get(i).getScore();
            }
        }

        return(max);
    } 

    /**
     *  returns the number of scores that were a 5
     *  
     */
    public int numberOfFives(){     
        int num5s = 0;

        for (int i = 0; i < myExams.size(); i++){
            if (myExams.get(i).getScore() == 5){
                num5s++;
            }
        }

        return(num5s);
    } 

    public String toString(){
        return (myFirstName + " " + myLastName + " " + myExams);
    } 
}
