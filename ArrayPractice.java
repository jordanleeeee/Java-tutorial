package exercise;

import java.util.Random;

public class ArrayPractice {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");;
            }
        }
        System.out.println();
    }

    /**
     *  swap the value of arr[a] and arr[b]
     */
    static void swapElement(int[] arr, int a, int b) {
        // todo add your code here
    }

    /**
     *  find the first i such that arr[i] = val
     *  return i
     *  if no such i, return -1
     */
    static int findFirstIndexOf(int[] arr, int val) {
        // todo add your code here
        return -1;
    }

    /**
     *  find the Last i such that arr[i] = val
     *  return i
     *  if no such i, return -1
     */
    static int findLastIndexOf(int[] arr, int val) {
        // todo add your code here
        return -1;
    }

    /**
     *  count number of item in the array with value = val
     */
    static int countOccurOf(int[] arr, int val) {
        int count = 0;
        // todo add your code here
        return count;
    }

    /**
     *  find the largest element in the array
     */
    static int findMaxValue(int[] arr) {
        int max = arr[0];
        // todo add your code here
        return max;
    }

    /**
     *  find the smallest element in the array
     */
    static int findMinValue(int[] arr) {
        // todo add your code here
        return  0;
    }

    /**
     *  get average value of all number in the array
     */
    static double getAverage(int[] arr) {
        // todo add your code here
        return 0;
    }

    /**
     * get the standard deviation of all number in the array
     */
    static double getSD(int[] arr) {
        // todo add your code here
        return 0;

    }

    /**
     *  sort the array by value in ascending order
     */
    static void sorting(int[] arr) {
        // todo add your code here
    }

    static void shuffing(int[] arr) {
        // todo add your code here
    }

    /**
     *  find whether there are two int a, b (a not equal b) in the array such that a + b = value;
     */
    static boolean haveSum(int[] arr, int value) {
        // todo add your code here
        return false;
    }

    /**
     *  clockwise rotate an array 1 times mean arr[i] = arr[i-1] for 0 < i < length_of_array
     *  and arr[0] = arr[length_of_array - 1]
     *
     *  rotate n times mean repeat the above step for n times
     */
    static void clockWiseRotateArray(int[] arr, int times) {
        // todo add your code here
    }

    /**
     *  anti-clockwise rotate an array 1 times mean arr[i] = arr[i+1] for 0 <= i < length_of_array - 1
     *  and arr[length_of_array - 1] = arr[0]
     *
     *  rotate n times mean repeat the above step for n times
     */
    static void antiClockWiseRotateArray(int[] arr, int times) {
        // todo add your code here
    }



    public static void main(String[] args) {
        int[] intArr = {1, 3, 5, 7, 50, 9, 11, 13, 11, 5, 11, 11};
        printArray(intArr);

        swapElement(intArr, 0, 3);
        printArray(intArr);
        swapElement(intArr, 2, 5);
        printArray(intArr);

        System.out.println("the first index of 5 = " + findFirstIndexOf(intArr, 5));
        System.out.println("the first index of 20 = " + findFirstIndexOf(intArr, 20));
        System.out.println("the last index of 5 = " + findLastIndexOf(intArr, 5));
        System.out.println("the first index of 80 = " + findFirstIndexOf(intArr, 80));

        System.out.println("11 occur in the array for " + countOccurOf(intArr, 11) + " times.");

        System.out.println("the max value in the array is " +findMaxValue(intArr));
        System.out.println("the min value in the array is " +findMinValue(intArr));

        System.out.println("the average of this set of number is " +getAverage(intArr));
        System.out.println("the standard deviation of this set of numbers is " +getSD(intArr));


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

        clockWiseRotateArray(intArr, 3);
        printArray(intArr);

        antiClockWiseRotateArray(intArr, 4);
        printArray(intArr);
    }
}

/*
    sample output
    1, 3, 5, 7, 50, 9, 11, 13, 11, 5, 11, 11
    7, 3, 5, 1, 50, 9, 11, 13, 11, 5, 11, 11
    7, 3, 9, 1, 50, 5, 11, 13, 11, 5, 11, 11
    the first index of 5 = 5
    the first index of 20 = -1
    the last index of 5 = 9
    the first index of 80 = -1
    11 occur in the array for 4 times.
    the max value in the array is 50
    the min value in the array is 1
    the average of this set of number is 11.416666666666666
    the standard deviation of this set of numbers is 12.175510484392658
    1, 3, 5, 5, 7, 9, 11, 11, 11, 11, 13, 50
    11, 50, 3, 13, 5, 11, 5, 7, 11, 11, 9, 1
    is there two different element in the array such that their sum is = 16? true
    is there two different element in the array such that their sum is = 2? false
    is there two different element in the array such that their sum is = 53? true
    is there two different element in the array such that their sum is = 48? false
    1, 3, 5, 5, 7, 9, 11, 11, 11, 11, 13, 50
    11, 13, 50, 1, 3, 5, 5, 7, 9, 11, 11, 11
    3, 5, 5, 7, 9, 11, 11, 11, 11, 13, 50, 1
 */

