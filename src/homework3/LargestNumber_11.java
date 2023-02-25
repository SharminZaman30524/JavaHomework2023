package homework3;

public class LargestNumber_11 {

    public static void main(String[] args) {
        //11. Write a Java program to find the largest number among three numbers using if else statement.
        int num1 = 456;
        int num2 = 789;
        int num3 = 109;

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2);
        }else{
            System.out.println(num3);
        }
    }
}
