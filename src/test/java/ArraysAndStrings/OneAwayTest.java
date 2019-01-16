package ArraysAndStrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OneAwayTest {

    @Test
    void isOneEditAway() {
        assertTrue(OneAway.isOneEditAway("", ""));
        assertTrue(OneAway.isOneEditAway("", "b"));
        assertTrue(OneAway.isOneEditAway("a", "b"));
        assertTrue(OneAway.isOneEditAway("pae", "pale"));
        assertTrue(OneAway.isOneEditAway("pales", "paes"));
        assertTrue(OneAway.isOneEditAway("pawe", "pave"));
        assertFalse(OneAway.isOneEditAway("paxye", "pamne"));
    }
}