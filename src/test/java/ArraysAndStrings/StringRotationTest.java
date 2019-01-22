package ArraysAndStrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringRotationTest {

    @Test
    void rotated() {
        assertTrue(StringRotation.rotated("", ""));
        assertTrue(StringRotation.rotated("hello", "hello"));
        assertTrue(StringRotation.rotated("hello", "llohe"));
        assertFalse(StringRotation.rotated("hello", "llo"));
        assertFalse(StringRotation.rotated("hello", "world"));
        assertFalse(StringRotation.rotated("hello", "oehll"));
    }
}