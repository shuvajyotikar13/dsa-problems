package org.training;

/**
 * Calculate the value of a particular element at a row and column for the following pattern:
 *
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1
 * 1 5 10 10 5 1
 * 1 6 15 20 15 6 1
 * 1 7 21 35 35 21 7 1
 *
 *
 * The pattern has following properties:
 *
 * - Assuming that the row and the column numbers start from 1, the number of columns in a row is
 *   equal to the row number.
 * - In a row the value of the first and last columns are always 1.
 * - In any row the value of a cell is the sum of its adjacent cells in the previous row.
 *   CellVall(RowNum, ColNum) = CellVall(RowNum - 1, ColNum - 1) + CellVall(RowNum - 1, ColNum)
 */
public class NumberPattern {

    /**
     * @param nRowNum Row number, assuming indexing starts from 1 and nRowNum >0
     * @param nColNum Column number, assuming indexing starts from 1 and nColNum <= nRowNum
     * @return value at a particular row and column.
     */
    public int getCellVall(int nRowNum, int nColNum) {
        int[] values = new int[nRowNum+1]; //creating an array for a particular row

        values[0] = 1;
        values[1] = 1;

        if (nRowNum < 3) {
            return values[nRowNum-1];
        }

        for (int rowIter = 2; rowIter < nRowNum; rowIter++) {
            for (int colIter = rowIter - 1; colIter > 0; colIter--) {
                values[colIter] = values[colIter - 1] + values[colIter];
            }
            values[rowIter] = 1;
        }

        return values[nColNum - 1];
    }

}
