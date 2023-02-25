package homework3;

public class Factorial_6 {
    public static void main(String[] args) {
        //6. Write a Java program to find the factorial of a number using while loop.
        int i =  1;
        int fact = 1;
        int n = 5;

        for(i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
