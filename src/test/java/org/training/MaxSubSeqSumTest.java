package org.training;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by shukar on 19/08/19.
 */
public class MaxSubSeqSumTest {

    @Test
    public void verify() {
        MaxSubSequenceSum sum = new MaxSubSequenceSum();

        assertEquals(6, sum.findMaxSubsequenceSum(new int[]{-1, -3, 5, -2 ,-1, 3 ,1, -2}));
        assertEquals(6, sum.findMaxSubsequenceSumUsingBruteForce(new int[]{-1, -3, 5, -2 ,-1, 3 ,1, -2}));
    }

}
