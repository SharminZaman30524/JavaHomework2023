package homework4;

import org.w3c.dom.ls.LSOutput;

public class Pattern_8 {
/*8.Write a program to print the following pattern using nested for loops: (pyramid)
            1
            121
            12321
            1234321
            123454321*/

    public static void main(String[] args) {


        for(int i=1;i<=5;i++) {
            for(int j=i;j<=4;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print(j);
            }
            for(int j=i-1;j>=1;j--) {
                System.out.print(j);
            }
            System.out.println();
        }

        /*int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
int i;
int j;
        for ( i = 0; i <=a.length-1 ; i++) {
            for ( j = 0; j <=i; j++) {
            }System.out.print(a[i][j]);
        }
        System.out.println("");*/
        // int b [][] = new int[3][4];


    }
}
