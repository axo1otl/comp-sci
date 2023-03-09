public class IntegerList{
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
        for (int i=0; i<list.length; i++){
            list[i] = (int)(Math.random() * 10) + 1;
        }
    }
    //-------------------------------------------------------
    //print array elements with indices
    //-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<list.length; i++){
            System.out.println(i + ":\t" + list[i]);
        }
    }
    
    //-------------------------------------------------------
    //sorts array elements
    //-------------------------------------------------------
    public void sort(){
        int min, temp;
        for (int i=0; i<list.length; i++){ // goes through the list
            min=i;                         //sets min to current outer loop index
            for(int test=i+1;test<list.length;test++){
                if(list[test]<list[min]){
                    min=test;
                    //swap the values
                    temp = list[min];
                    list[min] = list[i];
                    list[i] = temp;
                }
            }
        }    
    }
    
    //-------------------------------------------------------
    //return the index of the first occurrence of target in the list.
    //return -1 if target does not appear in the list
    //-------------------------------------------------------
    public int binarySearch(int target){
        int low = 0;                                    // create int low and set to 0
        int high = list.length - 1;                     // create int high set to the last index of list
        int middle = (low + high) / 2;                  // create int middle set to the halfway index of list

        while(list[middle] != target && low <= high){   // while the value at the middle index is not the target...
                                                        // ...and the lowest is still lower than the highest

            if(target > list[middle]){          // if the target is larget than the value at the current range middle
                low = middle + 1;               // set low to the index above middle to focus the range to the upper...
                                                // ...half of the range
            }
            else{                               // else
                high = middle - 1;              // set high to the index below middle for the same reason as before...
                                                // ...the only difference is the range is focused to the lower half
            }

            middle = (low + high) / 2;          // set the middle to the halfway point of the new range
        }

        if(list[middle] == target){             // if the middle value is equal to the target value
            return(middle);                     // return the middle index
                                                // NOTE: the middle index will end up being the only index in the range
        }
        else{                                   // else
            return(-1);                         // return -1
        }
    }
}