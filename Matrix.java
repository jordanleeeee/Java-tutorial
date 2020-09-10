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
        // I don't care what is this
        return null;
    }

    public static int[][] minus(int[][] matrix1, int[][] matrix2) {
        return null;
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        // wtf is this
        return null;
    }

    public static int[][] transpose(int[][] matrix) {
        int[][] result = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        int[][] matrix2 = {{1, 3, 5}, {2, 4, 6}};
        int[][] anotherMatrix = {{1, 1, 1}, {2, 2, 2}, {0, 0, 0}};
        int[][] thirdMatrix = {{7, 8}, {9, 10}, {11, 12}};

//        print(matrix);

//        print(add(matrix, matrix2));
//        print(minus(matrix, matrix2));
        print(transpose(thirdMatrix));
//        print(multiply(matrix, thirdMatrix));

    }
}
