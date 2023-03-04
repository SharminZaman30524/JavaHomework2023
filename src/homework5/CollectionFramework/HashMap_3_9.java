package homework5.CollectionFramework;

import java.util.HashMap;

public class HashMap_3_9 {
    //3. Write a Java code snippet to create a HashMap of String keys and Integer values and add some key-value pairs to it.
    public static void main(String[] args) {
        HashMap<String, Integer> random = new HashMap<>();
        random.put("Fajr", 1);
        random.put("Dhuhr", 2 );
        random.put("Asr", 3);
        random.put("Magrib", 4);
        random.put("Esha", 5);


        //9. Write a Java code snippet to get the size of a HashMap.
        System.out.println(random.size());


    }
}
