public class ArrayDemo{
    public static void main(String[] args){
        int[] anArray;
        anArray = new int[5];

        /* populate anArray index by index (not efficient)
        anArray[0] = 100;
        anArray[1] = 200;
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        */

        // populate anArray using for loop (very efficient)
        for (int i = 0; i < anArray.length; i++){
            anArray[i] = (i + 1) * 100;
        }

        // goes through the array and prints out the value for each index
        // this is only for us to know if we did the right thing
        for (int i = 0; i < anArray.length; i++){
            System.out.print(anArray[i] + " ");
        }

        System.out.println();
        
        /*
        String[] arrayStr;
        arrayStr = new String[10];

        int[] arrayClocks = new int[230];
        */

        for (int i = 0; i < anArray.length; i++){
            anArray[i] = (i + 1) * 100;
        }
    }
}