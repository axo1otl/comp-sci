// Matheus Sekiguchi
// September 23, 2022
// Objective: String Mutation

public class StringLab{
    public static void main(String[] args){
        String firstName = "Matt";
        String middleName = "Nora";
        String lastName = "Sekiguchi";
        
        String fullName = firstName + " " + middleName + " " + lastName;
        
        String up = fullName.toUpperCase();
        System.out.println(up);
        
        String low = fullName.toLowerCase();
        System.out.println(low);
        
        String rep = fullName.replace('i','o');
        System.out.println(rep);
        
        char letter = fullName.charAt(10);
        System.out.println(letter);
        
        String upper = fullName.toUpperCase();
        System.out.println(upper);
        
        int ind = fullName.indexOf('z');
        System.out.println(up);
    }
}