package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void detectCapitalUseTest() {
        Solution solution = new Solution();
        assertTrue(solution.detectCapitalUse("USA"));
        assertFalse(solution.detectCapitalUse("FlaG"));
    }
}