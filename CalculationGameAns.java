package exercise;

import java.util.Random;
import java.util.Scanner;

public class CalculationGameAns {
    public static void main(String[] args){
        int question = 0;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean isAnsCorrect;

        do{
            int a = random.nextInt(100) + 1;
            int b = random.nextInt(100) + 1;
            boolean plus = random.nextBoolean();
            int ans = a + ((plus) ? b : -b);
            question++;

            System.out.printf("Q%d: what is the answer of %d%s%d? %d%n", question, a, ((plus) ? '+' : '-'), b, ans);
            int userInput = scanner.nextInt();

            isAnsCorrect = userInput == ans;
            if (isAnsCorrect) {
                System.out.println("correct, next question...\n");
            }

        } while (isAnsCorrect);

        System.out.println("game over");
        System.out.println("you have answer " + (question-1) + " question correctly");
    }
}
