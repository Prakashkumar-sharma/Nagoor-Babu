package Nestedloop;

public class Nestedex9 {
    public static void main(String[] args) {
        for(int rows = 0 ; rows < 10 ; rows++){
            for (int spaces = 0 ; spaces < 9-rows; spaces++){
                System.out.print(" ");
            }
            for (int stars = 0 ; stars <= rows ; stars++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        for(int rows = 0 ; rows < 10 ; rows++){
            for (int spaces = 0 ; spaces <=rows; spaces++){
                System.out.print(" ");
            }
            for (int stars = 0 ; stars <9-rows ; stars++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
