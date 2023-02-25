package homework3;

public class Prime_5 {
    public static void main(String[] args) {
        //5. Write a Java program to print the first 10 prime numbers using for loop.

        for (int pr=1; pr<=100; pr++){
            boolean isPrime = true;
            if(pr>1){
                for(int den=2; den<pr; den++){
                    if(pr%den==0){
                        isPrime =false;
                    }
                }System.out.println(pr);
            }
        }

    }
}
