package Nestedloop;

public class Alphabetex7 {
    public static void main(String[] args) {
        for(int row = 0 ; row < 10 ; row++){
            for (int column = 0 ; column < row ; column++){
                System.out.print((char) (65+row) + " ");
            }
            System.out.println();
        }
    }
}
