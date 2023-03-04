package homework5.Recursion;

public class SumOfDigits {
    //3+2+1=6

    public static int sumOfDigits(int n){
        if (n==0)
            return 0;
        return (n%10 + sumOfDigits((n/10)));
        //return sumOfDigits(n%10) ;

        }

    public static void main(String[] args) {
        int num = 321;
        int result = sumOfDigits(num);
        System.out.println(result);
    }
}
