package Nestedloop;

public class Alphabetex8 {
    public static void main(String[] args) {
        for(int row = 0 ; row < 10 ; row++){
            for (int column = 0 ; column <= row ; column++){
                System.out.print((char) (74-row) + " ");
            }
            System.out.println();
        }
    }
}
