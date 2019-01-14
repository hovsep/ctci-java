package ArraysAndStrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermutationTest {

    @Test
    void isPermutation() {
        assertTrue(Permutation.isPermutation("abcdefgg", "gbadcgfe"));
        assertTrue(Permutation.isPermutation("basic", "abcis"));
        assertFalse(Permutation.isPermutation("dog", "wolf"));
        assertFalse(Permutation.isPermutation("", "cat"));
        assertFalse(Permutation.isPermutation("abc", "cabb"));
    }
}