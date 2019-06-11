package org.training;

/**
 *  Solve the 8 queens problem using recursion and backtracing.
 *  Prints out the number of solutions.
 */

public class Queens {

  private int numSolutions=0;

  /**
   * Return true if queen placement q[n] does not conflict with
   * other queens q[0] through q[n-1]
   *
   */
  public boolean isConsistent(int[] q, int n) {
    for (int i = 0; i < n; i++) {
      if (q[i] == q[n])
        return false;   // same column
      if ((q[i] - q[n]) == (n - i))
        return false;   // same major diagonal
      if ((q[n] - q[i]) == (n - i))
        return false;   // same minor diagonal
    }
    return true;
  }

  /**
   * Method invoked from the driver, with the num of queens/ chess size
   * @param numOfQueens
   * @return
   */
  public int solve(int numOfQueens){
    int[] rowArray = new int[numOfQueens];
     enumerate(rowArray, 0);
     return numSolutions;
  }

  /**
   * prints the column numbers of the queen positions for
   * each of the solutions
   * @param q
   */
  public static void printQueens(int[] q) {
    int n = q.length;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (q[i] == j) System.out.print(j);
      }
    }
    System.out.println("\n");
  }

  // Attempts to place a queen in the passed row and then
  //  recursively calls itself to place queen in the higher rows
  private void enumerate(int[] rowArray, int numOfRows){
    int num = rowArray.length;
    if (numOfRows == num){
      numSolutions++ ;
      printQueens(rowArray);
      return;
    }
    else {
      for (int i = 0; i < num; i++) {
        rowArray[numOfRows] = i;
        if (isConsistent(rowArray, numOfRows)) enumerate(rowArray, numOfRows+1);
      }
    }
  }

}



