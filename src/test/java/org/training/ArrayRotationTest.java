package org.training;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Created by shukar on 04/09/19.
 */
public class ArrayRotationTest {
    @Test
    public void verify1() {
        int[] result;
        result = ArrayRotation.rotateArray(new int[]{1,2,3,4,5}, 2);
        assertEquals(result[0], 4);
        assertEquals(result[1], 5);
        assertEquals(result[2], 1);
        assertEquals(result[3], 2);
        assertEquals(result[4], 3);
    }

    @Test
    public void verify2() {
        int[] result;
        result = ArrayRotation.rotateArray(new int[]{1,2,3,4,5}, 7);
        assertEquals(result[0], 4);
        assertEquals(result[1], 5);
        assertEquals(result[2], 1);
        assertEquals(result[3], 2);
        assertEquals(result[4], 3);
    }

}
