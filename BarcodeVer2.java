package exercise;

// you are not allow to import any other classes

public class BarcodeVer2 {
    /**
     * barcodeDictionary[i] represent the char array representation of digit i
     * where 0 <= i <= 9
     */
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

    //you may implement other method if you want

    //convert a number to barcode
    static String getBarcode(int number) {
        //todo add your code here
       return null;
    }

    //convert barcode to number
    static int readBarcode(String barcode) {
        //todo add your code here
       return 0;
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