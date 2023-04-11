package algorithm;

public class n {
    public static void main(String[] args) {

        int[] array = {10, 2, 1, 4, 5, 3, 7, 8, 9};
        int n = 10; // range of numbers from 1 to n

        int missingNumber = findMissingNumber(array, n);

        System.out.println("The missing number is: " + missingNumber);
    }

    public static int findMissingNumber(int[] array, int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int i = 0; i < array.length; i++) {
            actualSum += array[i];
        }
        int missingNumber = expectedSum - actualSum; //55-5
        return missingNumber;
    }
}
