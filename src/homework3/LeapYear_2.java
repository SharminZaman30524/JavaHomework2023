package homework3;

public class LeapYear_2 {
    public static void main(String[] args) {
        //2. Write a Java program to check if a year is a leap year or not using if elseif statement.
        int year = 2023;
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("This is a leap year.");
        } else if (year % 400 == 0) {
            System.out.println("This leap year will be skipped.");
        } else {
            System.out.println("This is not a leap year.");
        }
    }
}
