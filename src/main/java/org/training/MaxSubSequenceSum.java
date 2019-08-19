package org.training;

/**
 * Maximum Subsequence Sum is one of the classic problems found in the Data Structures & Algoritms books.
 * Given a one dimensional array of integers the task is to find a contiguous subarray with the largest sum.
 * -1 -3 5 -2 -1 3 1 -1
 *
 * For the above array the MaxSubsequenceSum is 6 which is obtained by starting from the 3rd element which is 5
 * and upto the last but one element which is 1.
 *
 *5 + (-2) + (-1) + 3 + 1 = 6
 */
public class MaxSubSequenceSum {

    /**
     * Optimised approach of calculating the max subsequence Sum for a given integer array.
     * @param anInput integer array whose subsequenceSum has to be computed
     * @return the maximum subsequencesum
     */

    public int findMaxSubsequenceSum(int[] anInput){

        int maxSum = anInput[0];
        int currMax = anInput[0];

        for (int i = 1; i < anInput.length; i++) {

            currMax = Math.max(anInput[i], currMax+anInput[i]);
            maxSum = Math.max(maxSum, currMax);
        }
        return maxSum;
    }


    /**
     * Brute Force method of computing the max subsequence Sum
     * @param anInput integer array whose subsequenceSum has to be computed
     * @return the maximum subsequencesum
     */
    public int findMaxSubsequenceSumUsingBruteForce(int[] anInput){

        int maxSum = 0;
        int curSum = 0;

        for(int i =0; i < anInput.length; i++) {
            for(int j = i; j < anInput.length; j++) {
                curSum += anInput[j];
                if(maxSum < curSum){
                    maxSum = curSum;
                }
            }
            curSum = 0;

        }
        return maxSum;
    }
    
}
