
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("How many numbers shall the array contain: ");
        int totalNumber = scanner.nextInt();
        scanner.nextLine();

        int[] myArray = readIntegers(totalNumber);
        System.out.println(findMin(myArray));
    }

    private static int[] readIntegers(int number) {
        int[] myArray = new int[number];

        for(int i=0; i<number; i++) {
            System.out.println("Please write a number to add to the array: ");
            int num = scanner.nextInt();
            scanner.nextLine();
            myArray[i] = num;
        }

        return myArray;
    }

    private static int findMin(int[] array) {

        int minValue = array[0];

        for(int i = 0; i < array.length; i++) {
            if( array[i] < minValue) {
                minValue = array[i];
            }
        }

        return minValue;
    }

}
