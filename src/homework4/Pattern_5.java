package homework4;

public class Pattern_5 {
   /* 5. Write a program to print the following pattern using nested for loops:
            54321
            4321
            321
            21
            1*/

    public static void main(String[] args) {
        Pattern_5 r = new Pattern_5();
        r.reverseTriangle(5);
    }

    public int reverseTriangle(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = number; j >= i ; j--) {
                System.out.print(j);

            }
            System.out.println(" ");

        }
        return number;

    }
}


