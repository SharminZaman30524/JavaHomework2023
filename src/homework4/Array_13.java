package homework4;

import java.util.Arrays;

public class Array_13 {
//    13. Write a program in Java to print out all the element of an one dimensional array.
    public static void main(String[] args) {
       Array_13 findArray = new Array_13();
        findArray.Array();
        //System.out.println();
    }
    public void Array(){
        int a[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
