package exercise;

// you cannot import any other class

public class CalculatorAns {

    // return a to the power of b
    private static int power(int a, int b) {
        int result = 1;
        //todo add your code here, you must not use Math.pow(), you can use a loop to do a*a for b times
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }

    // return n factorial, where n factorial = n*(n-1)*(n-2) *... *1 and 0 factorial = 1
    private static int factorial(int n) {
        int result = 1;
        //todo add your code here
        while (n > 0) {
             result *= n--;
        }
        return result;
    }

    // if a char is a vowel return true, else return false
    private static boolean isVowel(char a) {
        boolean is_a_vowel;
        switch (a) {
            //todo add your code here
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u': is_a_vowel = true; break;
            default: is_a_vowel = false;
        }
        return is_a_vowel;
    }

    private static int numOfDigit(int i) {
        int result = 0;
        while (i > 0) {
            i /= 10;
            result++;
        }
        return result;
    }

    // clockwise rotate a number for n times mean that place the last digit of
    // that number to the first digit and repeat this step for n times
    private static int magicClockwiseRotation(int num, int times) {
        // todo add you code here
        // hints: you can use num%10 to extract the last digit of num, and use num/10 to remove the last digit from num

        int digit = numOfDigit(num);
        for (int i = 0; i < times; i++) {
            int temp = num % 10;
            num /= 10;
            num += power(10, digit-1) * temp;
        }
        return num;
    }

    // clockwise rotate a number for n times mean that place the first digit of
    // that number to the last digit and repeat this step for n times
    private static int magicAntiClockwiseRotation(int num, int times) {
        // todo add you code here
        // hints: you can use num/(10 to the power of (#_of_digit_of_num - 1)) to extract the first digit
        // and use num - (10 to the power of (#_of_digit_of_num - 1))*(value of first digit) to remove the first digit from num

        int digit = numOfDigit(num);
        for (int i = 0; i < times; i++) {
            int temp = num/(power(10, (digit-1)));
            num -= power(10, digit-1) * temp;
            num *= 10;
            num += temp;
        }
        return num;
    }

    public static void main(String[] args) {
        //task one
        System.out.println("3 to the power of 4 = " + power(3, 4));
        System.out.println("8 to the power of 5 = " + power(8, 5));
        System.out.println("6 to the power of 9 = " + power(6, 9));

        //task two
        System.out.println("0 factorial = " + factorial(0));
        System.out.println("3 factorial = " + factorial(3));
        System.out.println("9 factorial = " + factorial(9));

        //task three
        System.out.println("is 'a' a vowel? " + isVowel('a'));
        System.out.println("is 'e' a vowel? " + isVowel('e'));
        System.out.println("is 'i' a vowel? " + isVowel('i'));
        System.out.println("is 'o' a vowel? " + isVowel('o'));
        System.out.println("is 'u' a vowel? " + isVowel('u'));
        System.out.println("is 'g' a vowel? " + isVowel('g'));
        System.out.println("is 'y' a vowel? " + isVowel('y'));
        System.out.println("is '#' a vowel? " + isVowel('#'));

        //task four
        System.out.println("rotate 1234 clockwise for 2 times = " + magicClockwiseRotation(1234, 2));
        // 3412 is expected
        System.out.println("rotate 246892 clockwise for 3 times = " + magicClockwiseRotation(246892, 3));
        // 892246 is expected
        System.out.println("rotate 13576 clockwise for 3 times = " + magicClockwiseRotation(13576, 4));
        // 357612 is expected

        //task five
        System.out.println("rotate 1234 anti-clockwise for 2 times = " + magicAntiClockwiseRotation(1234, 2));
        // 3412 is expected
        System.out.println("rotate 246892 anti-clockwise for 3 times = " + magicAntiClockwiseRotation(246892, 3));
        // 892246 is expected
        System.out.println("rotate 13576 anti-clockwise for 3 times = " + magicAntiClockwiseRotation(13576, 4));
        // 61357 is expected
    }
}
