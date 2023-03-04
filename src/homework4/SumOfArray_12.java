package homework4;

public class SumOfArray_12 {
    public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6};
    int sum = 0;
        for(int i=0; i<=arr.length; i++) {
        try {
            sum += arr[i];
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds");
        }
    }
        System.out.println("The sum of the elements of the array is: " + sum);
}
}


