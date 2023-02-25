package homework4;

public class ExceptionDividebyZero_14 {
    //    14. Write a program to demonstrate the use of try-catch for handling divide by zero exception.
    public static void main(String[] args) {
        ExceptionDividebyZero_14 div = new ExceptionDividebyZero_14();
        div.divideByZero(6);
    }

    public void divideByZero(int a) {
        try {
            int b = 0;
        int divide;

            System.out.println(divide = a / b);
            //return divide;

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        //return divide;
    }
}
