package homework4;

import java.util.Arrays;

public class CompareArrays_19 {
    //    19. Write a program to find the common elements in two arrays using nested for loops and nested if else statements.
    public static void main(String[] args) {

        int a[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int b[] = {2, 5, 6, 18, 32, 7, 19};

        for (int i = 0; i<a.length; i++) {
            for (int j = 0; j<b.length; j++){
                if (a[i] == b[j]){
                    System.out.println(a[i]);
                }
            }
        }
        System.out.println(" ");
    }

}
