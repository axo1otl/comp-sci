/**
 * create an integer list class that randomly generates an array of numbers
 *  
 */
public class IntegerList{

    int[] list; //values in the list // create a list of ints
    //-------------------------------------------------------
    //create a list of the given size
    //-------------------------------------------------------
    public IntegerList(int size){
        list = new int[size]; // specify the size of the list
    }

    //-------------------------------------------------------
    //fill array with integers between 1 and 10, inclusive
    //-------------------------------------------------------
    public void randomize(){
        for (int i=0; i<list.length; i++){
            list[i] = (int)(Math.random() * 10) + 1;
        }
    }

    //-------------------------------------------------------
    //print array elements with indices
    //-------------------------------------------------------
    public void print(){
        for (int i=0; i<list.length; i++){
            System.out.println(i + ":\t" + list[i]);
        }
    }


    public int linearSearch(int target){
        for (int i = 0; i < list.length; i++){
            if(list[i] == target){
                return(i);
            }
        }
        return(-1);
    }
}


