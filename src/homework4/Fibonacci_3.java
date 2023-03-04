package homework4;

public class Fibonacci_3 {
       //3. Write a program in Java to generate the Fibonacci series using a nested for loop.

    public static void main(String[] args) {
//0,1,1,2,3,5,8,13,21,34,55,89
        Fibonacci(10);
    }
    public static void Fibonacci(int n){
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}

