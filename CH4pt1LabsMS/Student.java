import java.util.Scanner;
public class Student{
    //declare instance data
    String name;
    double test1, test2;
    
    //constructor
    public Student(String studentName){
        //add body of constructor
        //remember all instance data needs to be instantiated
        name = studentName;
        test1 = 0;
        test2 = 0;
    }
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter Joe's score for test1".
    public void inputGrades(){
        //add body of inputGrades
        //Instantiation of Scanner object goes inside this method
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter " + name + "'s score for test 1: ");
        test1 = scan.nextDouble();
        while (test1 > 100 || test1 < 0){
            System.out.println("Please enter a valid grade: ");
            test1 = scan.nextDouble();
        }
        System.out.print("Enter " + name + "'s score for test 2: ");
        test2 = scan.nextDouble();
        while (test2 > 100 || test2 < 0){
            System.out.println("Please enter a valid grade: ");
            test2 = scan.nextDouble();
        }
    }
    //getAverage: compute and return the student's test average
    //add header for getAverage
    public double getAverage(){
        //add body of getAverage
        double avg = (test1 + test2) / 2;
        return(avg);
    }
    //getName: return the student's name
    //add header for getName
    public String getName(){
        //add body of getName
        return(name);
    }
    //toString: return the student's name, test1 and test2
    //add a header for toString
    public String toString(){
        //add body of toString
        return("Name: " + name + "\tTest 1: " + test1 + "\tTest 2: " + test2);
    }
}