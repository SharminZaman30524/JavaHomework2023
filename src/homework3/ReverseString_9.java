package homework3;

public class ReverseString_9 {
    public static void main(String[] args) {
        //9. Write a Java program to reverse a string using for loop.
        String randomWord = "Nibir";
        int randomWordLength = randomWord.length();
        int index = randomWordLength-1;
        for (int i = index; i>=0; i--) {
            System.out.print(randomWord.charAt(i));
        }
    }
}
