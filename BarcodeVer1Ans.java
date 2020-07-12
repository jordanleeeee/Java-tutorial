package exercise;

public class BarcodeVer1Ans {
    static final String zero = "///|||";
    static final String one = "//|/||";
    static final String two = "//||/|";
    static final String three = "//|||/";
    static final String four = "/|//||";
    static final String five = "/||/||";
    static final String six = "/|||//";
    static final String seven = "/|/|/|";
    static final String eight = "/|/||/";
    static final String nine = "/||/|/";

    static String getBarcode(String number) {
        String result = "";
        for (char c : number.toCharArray()) {
            switch (c) {
                case '0': result += BarcodeVer1Ans.zero; break;
                case '1': result += BarcodeVer1Ans.one; break;
                case '2': result += BarcodeVer1Ans.two; break;
                case '3': result += BarcodeVer1Ans.three; break;
                case '4': result += BarcodeVer1Ans.four; break;
                case '5': result += BarcodeVer1Ans.five; break;
                case '6': result += BarcodeVer1Ans.six; break;
                case '7': result += BarcodeVer1Ans.seven; break;
                case '8': result += BarcodeVer1Ans.eight; break;
                case '9': result += BarcodeVer1Ans.nine; break;
                default: throw new IllegalStateException();
            }
            //result += ' ';
        }
        return result;
    }

    static String readBarcode(String barcode) {
        String result = "";
        for (int i = 5; i < barcode.length(); i+=6) {
            String temp = barcode.substring(i-5, i+1);
            switch (temp) {
                case BarcodeVer1Ans.zero: result += 0; break;
                case BarcodeVer1Ans.one: result += 1; break;
                case BarcodeVer1Ans.two: result += 2; break;
                case BarcodeVer1Ans.three: result += 3; break;
                case BarcodeVer1Ans.four: result += 4; break;
                case BarcodeVer1Ans.five: result += 5; break;
                case BarcodeVer1Ans.six: result += 6; break;
                case BarcodeVer1Ans.seven: result += 7; break;
                case BarcodeVer1Ans.eight: result += 8; break;
                case BarcodeVer1Ans.nine: result += 9; break;
                default: throw new IllegalStateException();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String barcode1 = getBarcode("12345");
        System.out.println(barcode1);

        String barcode2 = getBarcode("19971007");
        System.out.println(barcode2);

        String barcode3 = "//|/||//||/|//|||//|//||/||/||";
        System.out.println(readBarcode(barcode3));

        String barcode4 = "//|/||/||/|//||/|//|/|/|//|/||///|||///|||/|/|/|";
        System.out.println(readBarcode(barcode4));

    }
}
