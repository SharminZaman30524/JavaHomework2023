package homework3;

public class Average_15 {
    public static void main(String[] args) {
        //15. Write a Java program to calculate the average of n numbers using for loop and break statement.
        int i =1;
        int countN = 5;
        int numA = 1;
        int numB = 2;
        int numC = 3;
        int numD = 4;
        int numE = 5;
        int total;

        for (i=1; i<=countN; i++){
            total = numA + numB + numC + numD + numE;
            System.out.println(total/countN);
            break;}
    }
}
