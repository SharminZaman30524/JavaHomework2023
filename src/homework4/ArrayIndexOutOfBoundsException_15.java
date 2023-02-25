package homework4;

public class ArrayIndexOutOfBoundsException_15 {
//    15. Write a program to demonstrate the use of try-catch for handling ArrayIndexOutOfBoundsException.
    public static void main(String[] args) {
        Array();
    }

    public static void Array() {

        try {
            int a[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            for (int i = 0; i <= a.length; i++) {
                System.out.print(a[i] + " ");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

    }
}
