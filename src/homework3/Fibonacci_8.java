package homework3;

public class Fibonacci_8 {
    public static void main(String[] args) {
        //8. Write a Java program to generate the Fibonacci sequence up to n terms using do while loop.
        int i =1;
        int n1 = 0;
        int n2 = 1;
        int n3;
        int number = 10;

        do {
            System.out.print(n1 + ",");
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            ++i;
        } while (i <= number);
    }
}
