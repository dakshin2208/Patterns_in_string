package PatternsUsingLoops;

public class pattern2 {
    public static void main(String[] args) {
        pattern22(5);
        //* * * * *
        //* * * * *
        //* * * * *
    }
    static void pattern22(int n){
        //idenify no of rows
        for (int row = 1; row <= n ; row++) {
            //identify no of  cols
            for (int i = 1; i <= n; i++) {
                //know what we are printing
                System.out.print("* ");

            }
            System.out.println();

        }
    }

}
