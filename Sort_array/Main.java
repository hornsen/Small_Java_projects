public class Main {

    public static void main(String[] args) {
        int[] myArray = {106, 26, 81, 26, 18, 40, 5, 15};

        int[] newArray = sortArray(myArray);
        printArray(newArray);
    }

    private static void printArray(int[] array) {
        for(int i=0; i<array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static int[] sortArray(int[] oldArray) {
        int[] sortedArray = new int[oldArray.length];

        for(int i=0; i<oldArray.length; i++) {
            sortedArray[i] = oldArray[i];
        }

        int temp;
        boolean flag = true;

        while(flag) {
            flag = false;
            for(int i=0; i<sortedArray.length-1; i++) {
                if(sortedArray[i] > sortedArray[i+1]) {
                    flag = true;
                    temp = sortedArray[i];

                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                }
            }
        }

        return sortedArray;
    }
}
