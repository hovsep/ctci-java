package ArraysAndStrings;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ZeroMatrixTest {

    @Test
    void zero() {
        assertTrue(Arrays.deepEquals(new int[][]{{}}, ZeroMatrix.zero(new int[][]{{}})));
        assertTrue(Arrays.deepEquals(new int[][]{{1}}, ZeroMatrix.zero(new int[][]{{1}})));
        assertTrue(Arrays.deepEquals(new int[][]{{0}}, ZeroMatrix.zero(new int[][]{{0}})));
        assertTrue(Arrays.deepEquals(new int[][]{{0, 0}}, ZeroMatrix.zero(new int[][]{{0, 0}})));
        assertTrue(Arrays.deepEquals(new int[][]{
                {0, 0},
                {0, 1}},
                ZeroMatrix.zero(new int[][]{
                        {0, 1},
                        {1, 1}
                })));
        assertTrue(Arrays.deepEquals(new int[][]{
                        {1, 0, 3},
                        {0, 0, 0},
                        {7, 0, 9}
                        },
                ZeroMatrix.zero(
                        new int[][]{
                                {1, 2, 3},
                                {4, 0, 6},
                                {7, 8, 9}
                        })));
    }
}