package homework3;

public class Grades_3 {
    public static void main(String[] args) {
        //3. Write a Java program to determine the grade of a student based on their marks using switch statement.
        String studentGrade = "A";
        switch (studentGrade) {
            case "A":
                System.out.println("GRADEBOOK RESULT: 89-100");
                break;
            case "B":
                System.out.println("GRADEBOOK RESULT: 79-90");
                break;
            case "C":
                System.out.println("GRADEBOOK RESULT: 69-80");
                break;
            case "D":
                System.out.println("GRADEBOOK RESULT: 59-70");
                break;
            case "F":
                System.out.println("GRADEBOOK RESULT: 59 or below");
                break;
            default:
                System.out.println("Invalid value");
        }

    }
}
