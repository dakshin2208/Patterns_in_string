package PatternsUsingLoops;

import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        //* * * * *
        //* * * *
        //* * *
        //* *
        //*
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        p3(num);
    }
    static void p3(int n){
        //identify rows
        for (int row = 1; row <= n ; row++) {
            //identify no of cols
            for (int col = 1; col <=n - row ; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }

    }
}
