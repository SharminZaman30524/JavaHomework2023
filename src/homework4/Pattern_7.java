package homework4;

public class Pattern_7 {
    /*7. Write a program to print the following pattern using nested for loops:
            1
            22
            333
            4444
            55555*/

    public static void main(String[] args) {
        Pattern_7 r = new Pattern_7();
        r.reverseTriangle2(5);
    }


    public int reverseTriangle2(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println(" ");

        }
        return number;
    }
}
