package PatternsUsingLoops;



public class Dimond {
    public static void main(String[] args) {
        //   *
        //  * *
        // * *  *
        //* * * * *
        // * * * *
        //  * * *
        //   * *
        //    *
        pattern5(5);
    }
    static void pattern5(int n ){
        for (int row = 0; row <= 2 * n; row++) {
            int totalnocol = row > n ? 2 * n -row : row;

            int noofspaces = n-totalnocol;
            for (int spaces = 0; spaces < noofspaces; spaces++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalnocol; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}

