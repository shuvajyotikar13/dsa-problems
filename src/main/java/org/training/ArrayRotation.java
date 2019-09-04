package org.training;

/**
 * Created by shukar on 04/09/19.
 */

/**
 * Rotate Array
 * Given an array of integers, rotate the array by the specified number of times.
 * If the rotation count is 1, then all the elements are shifted right once and the last element of the array occupies the first position.
 *
 * For example, consider the following array.
 *
 * 1 2 3 4 5
 *
 * If the above array is rotated by 2 times then the result is as shown below.
 *
 * 4 5 1 2 3
 */
public class ArrayRotation {

    //function to rotate the array right n counts
    public static int[] rotateArray(int[] array, int nRotationCount) {

        int length = array.length;
        int numRot = nRotationCount % length;// since the array becomes the same after n rotations.
        int last;

        for (int i=0; i<numRot; i++){
            last = array[length-1];
            for (int j = length-2; j>=0; j--){
                array[j+1]= array[j];
            }
            array[0]=last;
        }
        return array;

    }

}
