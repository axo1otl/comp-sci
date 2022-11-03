public class Testing{
    public static void main(String[] args){
        for (int i = 1; i <= 6; i++){
            for (int k = 1; k <= i - 1; k++){
                System.out.print("-");
            }
            System.out.print(2 * i);
            for (int k = i + 1; k <= 6; k++){
                System.out.print("-");
            }
            System.out.println();
        }
    }
}

/*

  ／|、
（ﾟ､ ｡７
 |、ﾞ~ヽ
 じしf_, )ノ

*/