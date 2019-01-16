package ArraysAndStrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class URLifyTest {

    @Test
    void urlify() {
        assertArrayEquals("hello".toCharArray(), URLify.urlify("hello".toCharArray(), 5));
        assertArrayEquals("hello%20world".toCharArray(), URLify.urlify("hello world  ".toCharArray(), 11));
        assertArrayEquals("hello%20world%20bob".toCharArray(), URLify.urlify("hello world bob    ".toCharArray(), 15));
    }
}