package homework4;

public class MultiplicationTable_1 {
    //1. Write a program in Java to print the multiplication table using nested for loops.
    public static void main(String[] args) {
        multiplication();
    }


    public static void multiplication() {
        int product = 0;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                product = i *j;
                System.out.print(product + " ");
            }System.out.println(" ");
        }

    }
}
