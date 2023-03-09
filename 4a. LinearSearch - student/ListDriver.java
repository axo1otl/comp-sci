
/**
 * Write a description of class ListDriver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ListDriver{
    public static void main (String args[]){
        IntegerList temp = new IntegerList(5); // create a new list of 5 ints
        
        temp.randomize(); // randomize the list
        temp.print(); // print the list
        System.out.println("Search for the value 8");
        if(temp.linearSearch(8) == -1) // check for the int 8, return -1 if not found
            System.out.println(clr.RED + "You didn't find the value 8");
        else
            System.out.println(clr.GREEN + "Congrats, 8 is found");
        
        System.out.print(clr.RESET);
    }
}

