package PatternsUsingLoops;

public class Pattern1 {
    public static void main(String[] args) {
        pattern1(5);

    }
    static void pattern1(int n){
        for (int row = 1; row <= n; row++) {
            //for every row ,run col
            for (int col = 1; col <= row; col++) {
                //what do you need to print
                System.out.print("* ");
            }
            //when one row is printed ,we need to add new line
            System.out.println();
        }
    }

}
