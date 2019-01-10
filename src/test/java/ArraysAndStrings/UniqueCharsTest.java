package ArraysAndStrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueCharsTest {

    @Test
    void isUniqueChars() {
        assertTrue(UniqueChars.isUniqueChars(""));
        assertTrue(UniqueChars.isUniqueChars("abc"));
        assertFalse(UniqueChars.isUniqueChars("aabc"));
        //assertFalse(UniqueChars.isUniqueChars("аабвг"));
    }


    @Test
    void isUniqueChars2() {
        assertTrue(UniqueChars.isUniqueChars2(""));
        assertTrue(UniqueChars.isUniqueChars2("abc"));
        assertTrue(UniqueChars.isUniqueChars2("абв"));
        assertFalse(UniqueChars.isUniqueChars2("aabc"));
        assertFalse(UniqueChars.isUniqueChars2("аабвг"));
    }

    @Test
    void isUniqueChars3() {
        assertTrue(UniqueChars.isUniqueChars3(""));
        assertTrue(UniqueChars.isUniqueChars3("abc"));
        assertTrue(UniqueChars.isUniqueChars3("абв"));
        assertFalse(UniqueChars.isUniqueChars3("aabc"));
        assertFalse(UniqueChars.isUniqueChars3("аабвг"));
    }

    @Test
    void isUniqueChars4() {
        assertTrue(UniqueChars.isUniqueChars4(""));
        assertTrue(UniqueChars.isUniqueChars4("abc"));
        assertTrue(UniqueChars.isUniqueChars4("абв"));
        assertFalse(UniqueChars.isUniqueChars4("aabc"));
        assertFalse(UniqueChars.isUniqueChars4("аабвг"));
    }
}