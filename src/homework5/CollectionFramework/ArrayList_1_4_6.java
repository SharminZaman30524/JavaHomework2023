package homework5.CollectionFramework;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList_1_4_6 {
    public static void main(String[] args) {
    /*}
    //1. Write a Java code snippet to create an ArrayList of Strings and add some elements to it.

    public void nameArrayList() {*/
        ArrayList<String> nameList = new ArrayList<String>();

        nameList.add("Sharmin");
        nameList.add("Mehnaz");
        nameList.add("Malek");


        //4. Write a Java code snippet to iterate over an ArrayList using a for-each loop.

        for (String a :nameList){
            System.out.print(a);
        }


       // 6. Write a Java code snippet to sort an ArrayList of Integers in ascending order.

        ArrayList<Integer> arrayInt = new ArrayList<Integer>();
        arrayInt.add(56);
        arrayInt.add(89);
        arrayInt.add(23);
        arrayInt.add(75);
        arrayInt.add(19);
        arrayInt.add(145);
        Collections.sort(arrayInt);
        System.out.println(arrayInt);

    }
}

