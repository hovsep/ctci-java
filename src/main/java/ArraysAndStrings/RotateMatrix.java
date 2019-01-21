package ArraysAndStrings;

/**
 * Question 1.7
 *
 * Rotate Matrix: Given an image represented by an NxN matrix, where each pixel in the image is 4
 * bytes, write a method to rotate the image by 90 degrees. Can you do this in place?
 */
public class RotateMatrix {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 2},
                {3, 4}};

        System.out.println("Before");
        RotateMatrix.printMatrix(matrix);

        System.out.println("After");
        RotateMatrix.printMatrix(RotateMatrix.rotate(matrix));
    }


    /**
     * Uses additional O(n) space
     *
     *
     * @param matrix
     * @return
     */
    public static int[][] rotate(int[][] matrix)
    {
        int n = matrix.length;
        int[][] rotated = new int[n][n];

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                rotated[r][c] = matrix[n-1-c][r];
            }
        }

        return rotated;
    }


    private static void printMatrix(int[][] matrix)
    {
        int n = matrix.length;


        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                System.out.print(" " + matrix[r][c]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
