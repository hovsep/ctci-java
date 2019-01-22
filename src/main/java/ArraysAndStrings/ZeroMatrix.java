package ArraysAndStrings;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Question 1.8
 *
 * Zero Matrix: Write an algorithm such that if an element in an MxN matrix is 0, its entire row and
 * column are set to 0
 */
public class ZeroMatrix {

    public static int[][] zero(int[][] matrix)
    {
        HashSet<Integer> rowsToMakeZero = new HashSet<Integer>();
        HashSet<Integer> colsToMakeZero = new HashSet<Integer>();

        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    rowsToMakeZero.add(i);
                    colsToMakeZero.add(j);
                }
            }
        }

        Iterator rowsIterator = rowsToMakeZero.iterator();

        while(rowsIterator.hasNext()) {
            int row = (Integer) rowsIterator.next();
            for (int col = 0; col < n; col++) {
                matrix[row][col] = 0;
            }
        }

        Iterator colsIterator = colsToMakeZero.iterator();

        while (colsIterator.hasNext()) {
            int col = (Integer) colsIterator.next();
            for (int row = 0; row < m; row++) {
                matrix[row][col] = 0;
            }
        }
        return matrix;
    }
}
