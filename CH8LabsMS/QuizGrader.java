import java.util.Scanner;

public class QuizGrader{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        boolean loop = true;
        int numOfQuestions = 0;
        String keyIn;
        
        // get number of questions on quiz
        System.out.print("Enter number of questions: ");
        numOfQuestions = scan.nextInt();
        
        String[] key = new String[numOfQuestions];

        // ask for key in a string
        System.out.println("Enter answer key on one line");
        System.out.print("use lowercase letters (a,b,c,d): ");
        keyIn = scan.next();
        
        // make string key an array
        for (int i = 0; i < key.length; i++){
            key[i] = keyIn.substring(i,i+1);
        }

        while(loop){
            String answerIn;
            int correct = 0;
            String answers = "";

            // start grading a test
            // each answer can be graded as it's inputed
            // can be inputted as one line
            System.out.println("Enter quiz answers on one line");
            System.out.print("use lowercase letters (a,b,c,d): ");
            answerIn = scan.next();

            for (int i = 0; i < key.length; i++){
                if (answerIn.substring(i,i+1).equals(key[i])){
                    correct++;
                    answers = answers + "o ";
                }
                else{
                    answers = answers + "x ";
                }
            }

            // print the number of correct answers and percent correct
            System.out.println();
            System.out.println("Number of correct answers: " + correct);
            System.out.println("Percent correct: " + (((double)correct / (double)numOfQuestions) * 100) + "%");
            System.out.println("Per answer correctness: " + answers);
            
            // ask if the user wants to grade another test
            System.out.println();
            System.out.println("Grade another test?");
            System.out.print("y/n: ");
            if (scan.next().equals("n")){
                loop = false;
            }
            System.out.println();
        }
    }
}