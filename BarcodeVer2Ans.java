package exercise;

public class BarcodeVer2Ans {
    static final char[][] barcodeDictionary = {
            {'/', '/', '/', '|', '|', '|'},
            {'/', '/', '|', '/', '|', '|'},
            {'/', '/', '|', '|', '/', '|'},
            {'/', '/', '|', '|', '|', '/'},
            {'/', '|', '/', '/', '|', '|'},
            {'/', '|', '|', '/', '|', '|'},
            {'/', '|', '|', '|', '/', '/'},
            {'/', '|', '/', '|', '/', '|'},
            {'/', '|', '/', '|', '|', '/'},
            {'/', '|', '|', '/', '|', '/'},

    };

    //convert a number to barcode
    static String getBarcode(int number) {
        //todo add your code here
        String barcode = "";
        for (; number > 0; number/=10) {
            int digit = number%10;
            String temp = "";
            for (char c : barcodeDictionary[digit]) {
                temp += c;
            }
            barcode = temp + barcode;
        }
        return barcode;
    }

    static boolean match(char[] bar, String oneDigitBarcode) {
        if (bar.length != oneDigitBarcode.length()) {
            return false;
        }

        for (int i = 0; i < bar.length; i++) {
            if (bar[i] != oneDigitBarcode.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    /**
     * convert barcode to number
     * if the barcode length is invalid , print(invalid barcode length and return -2
     * if the barcode length is valid but the barcode is invalid, print(invalid barcode) and return -1
     * if the barcode length and the barcode is valid return that number
     * @param barcode barcode
     * @return the number that barcode represent, -1 or -2
     */
    static int readBarcode(String barcode) {
        //todo add your code here
        if (barcode.length() % 6 != 0) {
            System.out.println("invalid barcode length");
            return -2;
        }
        int result = 0;
        for (int i = 6; i < barcode.length() + 1; i += 6) {
            String oneDigitBarcode = barcode.substring(i - 6, i);
            for (int j = 0; j < 10; j++) {
                if (match(barcodeDictionary[j], oneDigitBarcode)) {
                    result *= 10;
                    result += j;
                    break;
                }
                if (j == 9) {
                    System.out.println("invalid barcode");
                    return -1;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String barcode1 = getBarcode(12345);
        System.out.println(barcode1);

        String barcode2 = getBarcode(19971007);
        System.out.println(barcode2);

        String barcode3 = "//|/||//||/|//|||//|//||/||/||";
        System.out.println(readBarcode(barcode3));

        String barcode4 = "//|/||/||/|//||/|//|/|/|//|/||///|||///|||/|/|/|";
        System.out.println(readBarcode(barcode4));

        System.out.println(readBarcode("//|/||/||//|"));
        System.out.println(readBarcode("//|/|"));

    }
}

/*
output:

//|/||//||/|//|||//|//||/||/||
//|/||/||/|//||/|//|/|/|//|/||///|||///|||/|/|/|
12345
19971007
invalid barcode
-1
invalid barcode length
-2
 */