package PatternsUsingLoops;

public class interestingpattern {
    public static void main(String[] args) {
        //*
        //* *
        //* * *
        //* * * *
        //* * *
        //* *
        //*
        pattern5(5);
    }
    static void pattern5(int n){
        //identify the no of rows
        for (int row = 0; row <= 2 * n ; row++) {
            //identify the no of col
            //means figure out relationship with row & col
            int totalnoofcol = row > n ? 2 * n -row :row;
            for (int col = 0; col < totalnoofcol; col++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
