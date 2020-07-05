package exercise;

public class BarcodeVer1 {
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

    //convert a number to barcode
    static String getBarcode(String number) {
        //todo add your code here
        return null;
    }

    //convert barcode to number
    static String readBarcode(String barcode) {
        //todo add your code here
        return null;
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

/*
output:

//|/||//||/|//|||//|//||/||/||
//|/||/||/|//||/|//|/|/|//|/||///|||///|||/|/|/|
12345
19971007
 */