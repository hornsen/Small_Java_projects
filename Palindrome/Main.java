public class Main {

    public static void main(String[] args) {
        // Program to check if a number is an palindrome number

        int number = 10081;

        System.out.println(palindrome(number));
    }

    private static boolean palindrome(int number) {
        int reverse=0;
        int tempNumber = number;

        while(tempNumber!=0) {
            reverse *= 10;
            reverse += tempNumber % 10;
            tempNumber /= 10;

        }

        return (reverse == number);
    }
}
