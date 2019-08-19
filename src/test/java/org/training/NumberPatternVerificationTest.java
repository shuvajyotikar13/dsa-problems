package org.training;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by shukar on 19/08/19.
 */




public class NumberPatternVerificationTest {

    @Test
    public void verify() {
        NumberPattern numberPattern = new NumberPattern();
        assertEquals(1, numberPattern.getCellVall(1, 1));
        assertEquals(1, numberPattern.getCellVall(2, 1));
        assertEquals(1, numberPattern.getCellVall(2, 2));
        assertEquals(1, numberPattern.getCellVall(3, 1));
        assertEquals(2, numberPattern.getCellVall(3, 2));
        assertEquals(1, numberPattern.getCellVall(3, 3));
        assertEquals(10, numberPattern.getCellVall(6,3));
        assertEquals(10, numberPattern.getCellVall(6,4));
        assertEquals(15, numberPattern.getCellVall(7,3));
        assertEquals(15, numberPattern.getCellVall(7,5));
        assertEquals(20, numberPattern.getCellVall(7, 4));
        assertEquals(35, numberPattern.getCellVall(8, 5));
    }
}
