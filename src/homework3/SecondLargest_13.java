package homework3;

public class SecondLargest_13 {
    //13. Write a Java program to find the second-largest number among n numbers using if elseif statement.
    public static void main(String[] args) {

        int num1 = 456;
        int num2 = 789;
        int num3 = 109;

        if (num1 > num2 && num1 < num3 || num1  > num3 && num1 < num2) {
                System.out.println(num1);
        } else if (num2 > num1 && num2 < num3 || num2  > num3 && num2 < num1){
                System.out.println(num2);
        }else{
                System.out.println(num3);
            }
        }
    }
