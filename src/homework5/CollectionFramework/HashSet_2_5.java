package homework5.CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_2_5 {
    public static void main(String[] args) {
        //2. Write a Java code snippet to create a HashSet of Integers and add some elements to it.
        HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.add(23);
        numbers.add(34);
        numbers.add(67);
        numbers.add(23);
        numbers.add(109);
        numbers.add(13);


        //5. Write a Java code snippet to iterate over a HashSet using an Iterator.
        Iterator iter = numbers.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());

        }
    }
}
