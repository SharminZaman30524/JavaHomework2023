package homework5.CollectionFramework;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSet_to_ArrayList_10 {

       // 10. Write a Java code snippet to convert a HashSet to an ArrayList.
       public static void main(String[] args) {

       HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.add(23);
        numbers.add(34);
        numbers.add(67);
        numbers.add(23);
        numbers.add(109);
        numbers.add(13);

        ArrayList<Integer> numbers_array = new ArrayList<>(numbers);

}
    }
