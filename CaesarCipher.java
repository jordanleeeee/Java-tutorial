package exercise;

// Caesar Cipher is a very simple way of data encryption method use in long time age,
// this assignment you have to implement the encryption and decryption algorithm for caesar cipher
// for details of the algorithm, you can refer to https://en.wikipedia.org/wiki/Caesar_cipher

// some method in String library is useful https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
// you need to think of how to convert a to 0, b to 1 ..... z to 25 and vice versa to help to conversion between int and char
// google is a good helper for learning programming
// you can ignore space in the message (just keep the space as a space)
// you can assume the message are all in small letter
// think before you code, you can reuse method in order to type fewer code
// finally finish all the todo

import java.util.ArrayList;
// you must not import any other library

public class CaesarCipher {

    /**
     * a helper function for you to calculate a mod b
     */
    public static int mod(int a, int b) {
        return ((a % b) + b) % b;
    }

    public static void printCharArr(char[] arr) {
        for (char c : arr) {
            System.out.print(c);
        }
        System.out.println();
    }

    // you may want to add other helper method if you want

    /**
     * do caesar cipher encryption, can refer https://en.wikipedia.org/wiki/Caesar_cipher#Example
     * @param msg the message to be encrypt
     * @param key number of shift need to be perform
     * @param isShiftRight true mean shift right, false mean shift right
     * @return the encrypted text
     */
    public static String encryption(String msg, int key, boolean isShiftRight) {
        // todo add your code here
        return "";
    }

    // todo implement your decryption method here

    // this is similar algorithm as the above encryption method except the original message was store in a char array
    public static char[] encryptionForArray(char[] msg, int key, boolean isShiftRight) {
        // todo add your code here
        return null;
    }

    // todo implement your decryptionForArray method for array here

    // this is similar algorithm as the above encryption method
    // except the original message was store in a arrayList of String
    public static ArrayList<String> encryptionForArrayList(ArrayList<String> msg, int key, boolean isShiftRight) {
        // todo add your code here
        return null;
    }

    // todo implement your decryptionForArrayList method for arrayList here

    public static void main(String[] args) {
//        System.out.println("version 1");
//        String secret = "i will be late for my work fifteen minutes every day";
//        System.out.println("my secret is: " + secret);
//
//        System.out.println("encrypted version: ");
//        String encryptedText1 = encryption(secret, 10, true);
//        String encryptedText2 = encryption(secret, 18, false);
//        System.out.println(encryptedText1);
//        System.out.println(encryptedText2);
//
//        // given the encrypted text and encryption method, the decryption method will generate the original message
//        System.out.println("decrypted version: ");
//        String originalMsg1 = decryption(encryptedText1, 10, true);
//        System.out.println(originalMsg1);
//        String originalMsg2 = decryption(encryptedText2, 18, false);
//        System.out.println(originalMsg2);
//
//
//
//        System.out.println("\nversion 2");
//        char[] secret2 = {'i', ' ', 'g', 'o', ' ','t', 'o', ' ', 's', 'c', 'h', 'o', 'o', 'l',
//                ' ', 'b', 'y', ' ', 'b', 'u', 's'};
//        System.out.print("my secret is: ");
//        printCharArr(secret2);
//
//        System.out.println("encrypted version: ");
//        char[] encryptedArray1 = encryptionForArray(secret2, 8, true);
//        printCharArr(encryptedArray1);
//        char[] encryptedArray2 = encryptionForArray(secret2, 21, false);
//        printCharArr(encryptedArray2);
//
//        System.out.println("decrypted version: ");
//        char[] originalMsg3 = decryptionForArray(encryptedArray1, 8, true);
//        printCharArr(originalMsg3);
//        char[] originalMsg4 = decryptionForArray(encryptedArray2, 21, false);
//        printCharArr(originalMsg4);
//
//
//
//        // version 3
//        System.out.println("\nversion 3");
//        ArrayList<String> secret3 = new ArrayList<>();
//        secret3.add("sunday");
//        secret3.add("is");
//        secret3.add("my");
//        secret3.add("only");
//        secret3.add("holiday");
//        System.out.println("my secret is: " + secret3);
//
//        System.out.println("encrypted version: ");
//        ArrayList<String> encryptedArrayList1 = encryptionForArrayList(secret3, 5, true);
//        ArrayList<String> encryptedArrayList2 = encryptionForArrayList(secret3, 12, false);
//        System.out.println(encryptedArrayList1);
//        System.out.println(encryptedArrayList2);
//
//        System.out.println("decrypted version: ");
//        System.out.println(decryptionForArrayList(encryptedArrayList1, 5, true));
//        System.out.println(decryptionForArrayList(encryptedArrayList2, 12, false));
    }
}


/*
    the following is the correct output of the program

    version 1
    my secret is: i will be late for my work fifteen minutes every day
    encrypted version:
    s gsvv lo vkdo pyb wi gybu pspdoox wsxedoc ofobi nki
    q eqtt jm tibm nwz ug ewzs nqnbmmv uqvcbma mdmzg lig
    decrypted version:
    i will be late for my work fifteen minutes every day
    i will be late for my work fifteen minutes every day

    version 2
    my secret is: i go to school by bus
    encrypted version:
    q ow bw akpwwt jg jca
    n lt yt xhmttq gd gzx
    decrypted version:
    i go to school by bus
    i go to school by bus

    version 3
    my secret is: [sunday, is, my, only, holiday]
    encrypted version:
    [xzsifd, nx, rd, tsqd, mtqnifd]
    [gibrom, wg, am, cbzm, vczwrom]
    decrypted version:
    [sunday, is, my, only, holiday]
    [sunday, is, my, only, holiday]

 */
