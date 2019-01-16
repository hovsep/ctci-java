package ArraysAndStrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromePermutationTest {

    @Test
    void isPalindromePermutation() {
        assertTrue(PalindromePermutation.isPalindromePermutation(""));
        assertTrue(PalindromePermutation.isPalindromePermutation("a"));
        assertTrue(PalindromePermutation.isPalindromePermutation("acto tac"));
        assertTrue(PalindromePermutation.isPalindromePermutation("act atac"));
        assertTrue(PalindromePermutation.isPalindromePermutation("act cat"));
        assertTrue(PalindromePermutation.isPalindromePermutation("bbb"));
        assertTrue(PalindromePermutation.isPalindromePermutation("cc"));
        assertFalse(PalindromePermutation.isPalindromePermutation("ccbncc"));
        assertTrue(PalindromePermutation.isPalindromePermutation("abba-civic@daad paap+izzi"));
    }
}