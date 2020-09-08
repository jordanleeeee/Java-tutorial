package exercise;

import java.util.Random;
import java.util.Scanner;

public class NumberGameAns {
    public static void main(String[] args) {
        int ans = new Random().nextInt(100) + 1;
        System.out.println("the number is "+ans);
        int guess = -1;
        int round = 0;
        Scanner scanner = new Scanner(System.in);

        while (ans != guess) {
            System.out.println("please guess a number between 1 and 100 (inclusive)");
            round++;
            guess = scanner.nextInt();
            if (guess < 1 || guess > 100) {
                System.out.println("invalid guess");
            } else if (guess > ans) {
                System.out.println("too large");
            } else if (guess < ans) {
                System.out.println("too small");
            } else {
                System.out.println("you got it, the number is " + ans);
            }
        }
        System.out.println("you win, you made " + round + " guess");
    }
}
