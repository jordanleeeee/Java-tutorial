package exercise;

//you are not allow to import any other class
import java.util.Random;
import java.util.Scanner;


/*
Step 1: The user specifies the length of the array N, and number of iterations I.
Step 2: Generate an array that has N numbers in the [0, N] range. Thus one randomly selected number should be missing.
Step 3: Randomly shuffle the current sequence. You may explore different methods for this. A simple approach is to pick a number from a random position in the [1,N-1] range and swap it with the number in position 0. Then pick a random position in [2, N-1], and swap with the number in position 1, and so on until you reach the end of the array. You can refer to "Modern Algorithm" under Fisher-Yates_shuffle for a more detailed explanation.
Step 4: Print the final sequence.
Step 5: Find the number that does not appear in the array, denoted as X and print it.
Step 6: Repeat steps 2-5 a total of I times, but in each time, change the length of the array to N = X+N', where N' is the length of the array in the preceding iteration.
Step 7: List all the missing numbers of all iterations.
 */
public class FindMissNumAns {

    static void print_array(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


    // Find missing number function
    // You should return the missing number
    static int missing_number(int[] array, int size){
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return (size)*(size+1)/2 - sum;
    }

    // Generate the shuffled array missing one number
    static int[] generate_array(int size){
        Random random = new Random();
        int[] arr = new int[size];
        int rand = random.nextInt(size + 1);
        for (int i = 0, j = 0; i < size + 1; i++, j++) {
            if (i == rand) {
                j--;
                continue;
            }
            arr[j] = i;
        }

        for (int i = 0; i < arr.length; i++) {
            int randPos = random.nextInt(i + 1);
            int temp = arr[randPos];
            arr[randPos] = arr[i];
            arr[i] = temp;
        }
        System.out.println("The array:");
        print_array(arr);
        return arr;
    }

    // You should first generate array and then find the missing number
    // You should return the missing number (which is used to determine the length of the array in the next iteration)
    static int solve(int size, int iter){
        System.out.println("This is iteration: " + iter + "\n" +
                "-----------------");
        int[] arr = generate_array(size);
        int miss = missing_number(arr, size);
        System.out.println("The missing number is: " + miss);
        System.out.println("-----------------");
        return miss;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the length of the array (between 2 and 100): ");
        int size = scanner.nextInt();
        System.out.println("Please input the total number of iterations (between 1 and 5): ");
        int iter = scanner.nextInt();

        //TODO: Perform all the iterations, first generating the array, and then finding the missing number.
        //      You may use the two function skeletons provided above or do it in your own way.
        int[] missingNums = new int[iter];
        for (int i = 0; i < iter; i++) {
            missingNums[i] = solve(size, i);
            size += missingNums[i];
        }
        System.out.println("All missing numbers:");
        print_array(missingNums);
    }


}

/*
the following output is for your reference only :

Please input the length of the array (between 2 and 100):
8
Please input the total number of iterations (between 1 and 5):
5

This is iteration: 0
-----------------
The array:
6 8 2 0 3 4 1 7
The missing number is: 5
-----------------
This is iteration: 1
-----------------
The array:
5 7 2 13 3 9 1 8 12 4 6 10 0
The missing number: 11
-----------------
This is iteration: 2
-----------------
The array:
21 8 17 20 4 10 1 9 12 24 7 11 15 14 19 18 2 5 0 13 22 6 23 16
The missing number is: 3
-----------------
This is iteration: 3
-----------------
The array:
27 26 17 20 3 9 1 8 12 24 6 10 15 14 19 18 2 4 25 13 22 5 23 16 0 7 21
The missing number: 11
-----------------
This is iteration: 4
-----------------
The array:
27 28 36 19 3 32 1 8 11 23 6 10 14 13 18 34 33 4 24 38 30 37 22 15 0 31 29 25 20 35 7 9 2 17 21 16 5 12
The missing number: 26
-----------------
All missing numbers:
5 11 3 11 26
 */
