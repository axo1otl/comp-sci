
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
    //fill array with integers between 1 and 100, inclusive
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
    //insertion sorts array elements
    //-------------------------------------------------------

    public void insertionSort(){
        for (int i = 1; i < list.length; i++){          // loops through the whole list
            int temp = list[i];                         // value at index
            int index = i;                              // index

            while(index > 0 && temp < list[index-1]){   // while the current held value is less than the previous index
                list[index] = list[index-1];            // set the value at index to the value in the previous index
                                                        // moving the whole list up an index
                index--;                                // decriment the index
            }
            list[index] = temp;                         // set the held value
        }
    }

    public void bogoSort(){
        boolean unsorted = true;
        int countUnsorted = 0;
        int countSorted = 0;

        while(unsorted){
            for (int i = 0; i < list.length-1; i++){
                if (list[i] < list[i+1]){
                    countSorted++;
                }
                else{
                    countUnsorted++;
                }
            }
            if(countUnsorted == 0){
                unsorted = false;
            }
            else{
                randomize();
                countUnsorted = 0;
                countSorted = 0;
    
                print();
                System.out.println();
            }
        }
    }





}
