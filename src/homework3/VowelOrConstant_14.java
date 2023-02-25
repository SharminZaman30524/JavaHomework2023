package homework3;

public class VowelOrConstant_14 {
    public static void main(String[] args) {
        //14. Write a Java program to check if a letter is a vowel or consonant using switch statement.

        String letter = new String();
        letter = "a";
        char l = letter.toUpperCase().charAt(0);
        switch (l) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println( letter + " is a vowel.");
                break;
            default:
                System.out.println("This letter is a consonant");
        }
    }
}
