package homework4;

public class Reverse_9 {
   // 9. Write a program to reverse a string using a nested for loop.

    public static void main(String[] args) {
        String randomWord = "funnybone";
        int randomWordLength = randomWord.length();
        int index = randomWordLength-1;
        for (int i = index; i>=0; i--) {
            System.out.print(randomWord.charAt(i));
        }
    }
}
