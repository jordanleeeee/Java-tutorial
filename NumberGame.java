package exercise;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    /**
     * first generate a random number between 1 and 100 (inclusive)
     * let the player guess that number, until the guess is correct
     * @param args NA
     */
    public static void main(String[] args) {
        //todo declare variable: ans, user input, number of round passed, scanner, random...
        int ans = new Random().nextInt(100) + 1;

        //todo looping until the player make correct guess
            // ask the player make a guess
            // if guess is invalid: print invalid range
            // if guess is larger than ans: print too big
            // if guess is smaller than ans: print too small
            // if guess is correct: print you got it

        //todo tell the user how many guess was made until the correct guess was made
    }
}
