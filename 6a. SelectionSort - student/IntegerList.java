
public class IntegerList
{
    int[] list; //values in the list

    //-------------------------------------------------------
    //create a list of the given size
    //-------------------------------------------------------
    public IntegerList(int size)
    {
        list = new int[size];
    }

    //-------------------------------------------------------
    //fill array with integers between 1 and 10, inclusive
    //-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<list.length; i++)
            list[i] = (int)(Math.random() * 10) + 1;
    }

    //-------------------------------------------------------
    //print array elements with indices
    //-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<list.length; i++)
            System.out.println(i + ":\t" + list[i]);
    }
    
    //-------------------------------------------------------
    //selection sorts array elements
    //-------------------------------------------------------
    public void selectionSort(){
        int temp, min;                                          // create two vars for storing values

        for (int i = 0; i < list.length-1; i++){                // first for loop to go through the list
            min = i;                                            // base line for the next smallest number

            for(int test = i+1; test < list.length; test++){    // for loop to find next smallest in the list
                if (list[test] < list[min]){                    // compares two numbers and find the smallest of the two
                    min = test;                                 // set min to the smallest number
                }
            }
            temp = list[min];                                   // these next 3 lines swap the two numbers
            list[min] = list[i];                                // ^
            list[i] = temp;                                     // ^^
        }
    }  
    

    
}
