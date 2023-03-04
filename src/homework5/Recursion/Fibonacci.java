package homework5.Recursion;

public class Fibonacci {

    public static void main(String[] args) {
        //Fibonacci(6);
        System.out.println(fibRecursion(9));

    }
    //public static int Fibonacci(int n) {


        public static int fibRecursion(int count) {
            if (count == 0) {
                return 0;
            } // Oth fibonacci is 0

            if (count == 1 || count == 2) {
                return 1;
            } // 1st and 2nd Fibonacci are 1 and 1 only

            // calling function recursively for nth Fibonacci
            return fibRecursion(count - 1) + fibRecursion(count - 2);
        }


        /*if (n<=1)
            return n;
            return Fibonacci(n-1) + Fibonacci(n-2);
            //1,1,2,3,5,8,13,21,34
        }

    public static void main(String[] args) {
        //int n =9;
        System.out.println(Fibonacci(6));
    }*/
    }



