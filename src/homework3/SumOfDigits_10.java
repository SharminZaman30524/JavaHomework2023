package homework3;

public class SumOfDigits_10 {
    public static void main(String[] args) {
        //10. Write a Java program to calculate the sum of digits of a number using while loop.
        int numb = 345;
        int sum =0;
        while (numb > 0) {
            sum = sum + (numb%10);
            numb = numb/ 10;
        }
        System.out.println(" ");
        System.out.println("Sum of 3+4+5 should be 12: " + sum);
    }
}
