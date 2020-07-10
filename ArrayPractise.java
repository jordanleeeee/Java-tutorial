package exercise;

public class ArrayPractise {
    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    /**
     *  swap the value of arr[a] and arr[b]
     */
    static void swapElement(int[] arr, int a, int b) {

    }

    /**
     *  find the first i such that arr[i] = val
     *  return i
     */
    static int findFirstIndexOf(int[] arr, int val) {
        return 0;
    }

    /**
     *  find the Last i such that arr[i] = val
     *  return i
     */
    static int findLastIndexOf(int[] arr, int val) {
        return 0;
    }

    /**
     *  count number of item in the array with value = val
     */
    static int countOccurOf(int[] arr, int val) {
        return 0;
    }

    /**
     *  find the largest element in the array
     */
    static int findMaxValue(int[] arr) {
        return 0;
    }

    /**
     *  find the smallest element in the array
     */
    static int findMinValue(int[] arr) {
        return 0;
    }

    /**
     *  get average value of all number in the array
     */
    static double getAverage(int[] arr) {
        return 0;
    }

    /**
     *  sort the array by value in ascending order
     */
    static void sorting(int[] arr) {

    }

    static void shuffing(int[] arr) {

    }

    /**
     *  find whether there are two int a, b (a not equal b) in the array such that a + b = value;
     */
    static boolean haveSum(int[] arr, int value) {
        return false;
    }

    /**
     *  clockwise rotate an array 1 times mean arr[i] = arr[i-1] for 0 < i < length_of_array
     *  and arr[0] = arr[length_of_array - 1]
     *
     *  rotate n times mean repeat the above step for n times
     */
    static void clockWiseRotateArray(int[] arr, int times) {

    }

    /**
     *  anti-clockwise rotate an array 1 times mean arr[i] = arr[i+1] for 0 <= i < length_of_array - 1
     *  and arr[length_of_array - 1] = arr[0]
     *
     *  rotate n times mean repeat the above step for n times
     */
    static void antiClockWiseRotateArray(int[] arr, int times) {

    }



    public static void main(String[] args) {
        int[] intArr = {1, 3, 5, 7, 50, 9, 11, 13, 11, 5, 11, 11};
        printArray(intArr);

        swapElement(intArr, 0, 3);
        printArray(intArr);
        swapElement(intArr, 2, 5);
        printArray(intArr);

        System.out.println("the first index of 5 = " + findFirstIndexOf(intArr, 5));
        System.out.println("the last index of 5 = " + findLastIndexOf(intArr, 5));

        System.out.println("11 occur in the array for " + countOccurOf(intArr, 11) + " times.");

        System.out.println("the max value in the array is " +findMaxValue(intArr));
        System.out.println("the min value in the array is " +findMinValue(intArr));

        System.out.println("the average of this set of number is " +getAverage(intArr));


        sorting(intArr);
        printArray(intArr);

        shuffing(intArr);
        printArray(intArr);

        System.out.println("is there two different element in the array such that their sum is = 16? " + haveSum(intArr, 16));
        System.out.println("is there two different element in the array such that their sum is = 2? " + haveSum(intArr, 2));
        System.out.println("is there two different element in the array such that their sum is = 53? " + haveSum(intArr, 53));
        System.out.println("is there two different element in the array such that their sum is = 48? " + haveSum(intArr, 48));

        sorting(intArr);
        printArray(intArr);

        clockWiseRotateArray(intArr, 5);
        printArray(intArr);

        antiClockWiseRotateArray(intArr, 7);
        printArray(intArr);
    }
}
