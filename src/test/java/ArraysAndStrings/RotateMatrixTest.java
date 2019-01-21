package ArraysAndStrings;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RotateMatrixTest {

    @Test
    void rotate() {
        assertTrue(Arrays.deepEquals(new int[][]{{1}}, RotateMatrix.rotate(new int[][]{{1}})));

        assertTrue(Arrays.deepEquals(new int[][]{
                        {3, 1},
                        {4, 2}},
                RotateMatrix.rotate(new int[][]{
                        {1, 2},
                        {3, 4}})));

        assertTrue(Arrays.deepEquals(new int[][]{
                        {7, 4, 1},
                        {8, 5, 2},
                        {9, 6, 3}
                },
                RotateMatrix.rotate(new int[][]{
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}})));
    }
}