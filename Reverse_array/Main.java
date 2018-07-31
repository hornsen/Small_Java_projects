import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] myArray = {23, 24, 10, 9, 7};

        int[] reverseArray = reverse(myArray);

        System.out.println("Original array: " + Arrays.toString(myArray));
        System.out.println("Reverse array: " + Arrays.toString(reverseArray));
    }

    public static int[] reverse(int[] array) {
        int[] reverseArray = new int[array.length];

        for(int i=0; i<array.length; i++) {
            reverseArray[i] = array[array.length-i-1];
        }

        return reverseArray;
    }
}
