public class AlphaArray {
    public static void main(String[] args){
        int[] alpha = new int[26];

        for (int i = 0; i < alpha.length; i++){
            alpha[i] = 97 + i;
        }

        for (int i = 0; i < alpha.length; i++){
            System.out.print(((char) alpha[i]) + " ");
        }
    }
}