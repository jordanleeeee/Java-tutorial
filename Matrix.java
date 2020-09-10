package exercise;

public class Matrix {
    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
                if (j < arr[i].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    public static int[][] add(int[][] matrix1, int[][] matrix2) {
        return null;
    }

    public static int[][] minus(int[][] matrix1, int[][] matrix2) {
        return null;
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int m = matrix1.length;
        int p = matrix1[0].length;  // also = matrix2.length
        int n = matrix2[0].length;
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int dotProduct = 0;
                for (int k = 0; k < p; k++) {
                    dotProduct += matrix1[i][k] * matrix2[k][j];
                }
                result[i][j] = dotProduct;
            }
        }
        return result;
    }

    public static int[][] transpose(int[][] matrix) {
        return null;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        int[][] matrix2 = {{1, 3, 5}, {2, 4, 6}};
        int[][] thirdMatrix = {{7, 8}, {9, 10}, {11, 12}};
        int[][] matrix3 = {{3, 4, 2}};
        int[][] matrix4 = {{13, 9, 7, 15}, {8, 7, 4, 6}, {6, 4, 0, 3}};

//        print(matrix);
//
//        print(add(matrix, matrix2));
//        print(minus(matrix, matrix2));
//        print(transpose(thirdMatrix));
        print(multiply(matrix, thirdMatrix));
        System.out.println();
        print(multiply(matrix3, matrix4));
    }
}
