package PatternsUsingLoops;

public class maze {
    public static void main(String[] args) {
        //4 4 4 4 4 4 4
        //4 3 3 3 3 3 4
        //4 3 2 2 2 3 4
        //4 3 2 1 2 3 4
        //4 3 2 2 2 3 4
        //4 3 3 3 2 3 4
        //4 4 4 4 4 4 4
        pattern31(4);

    }
    static void pattern31(int n){
        int original = n;
        n = 2 * n;
        for (int row = 0; row <=n ; row++) {
            for (int col = 0; col <= n ; col++) {
                int ateveryindex = original -Math.min(Math.min(row,col),Math.min(n -row , n -col)  );
                System.out.print(ateveryindex + " ");
            }
            System.out.println();

        }
    }
}
