package homework4;

public class MultipleExceptions_16 {
//    16. Write a program in Java to demonstrate the use of multiple catch blocks.
    public static void main(String[] args) {
        MultipleExceptions_16 obj = new MultipleExceptions_16();
        obj.multipleEx("Mehnaz");
    }

    public void multipleEx (String str) {
        int b = 0;
        int st;
        try {
            st = Integer.parseInt(str);
            System.out.println(st / b);
        } catch (NumberFormatException nE) {
            try {
                st = 300;
            System.out.println(st/b);

            }catch (ArithmeticException aE){
                System.out.println(nE.getMessage() + aE.getMessage());
           }
        }

    }
}
