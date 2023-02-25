package homework4;

import java.util.Arrays;

public class MergeArrays_20 {

    //20. Write a program to merge two arrays into a third array using nested for loops.
    public static void main(String[] args) {


        int a[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int b[] = {2, 5, 6, 18, 32, 7, 19};
        int a1= a.length;
        int b1= b.length;
        int c1 = a1 + b1;
        int c[] = new int[c1];
        System.arraycopy(a,0,c,0,a1);
        System.arraycopy(b,0,c, a1, b1);

        System.out.println(Arrays.toString(c));
    }

        /*for(int i = 0; i<a.length; i++) {
        for (int j = 0; j<b.length; j++){
            if (a[i] == b[j]){
                System.out.println(a[i]);
            } souta[i];
        }
    }
        System.out.println(" ");*/
}

