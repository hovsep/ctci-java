package ArraysAndStrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCompressionTest {

    @Test
    void compress() {
        assertEquals("a", StringCompression.compress("a"));
        assertEquals("aa", StringCompression.compress("aa"));
        assertEquals("a3", StringCompression.compress("aaa"));
        assertEquals("aaab", StringCompression.compress("aaab"));
        assertEquals("a3b2", StringCompression.compress("aaabb"));
        assertEquals("a3b2a2", StringCompression.compress("aaabbaa"));
    }
}