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

  public int enumerate(int n){
    int[] a = new int[n];
     enumerate(a, 0);
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

  private void enumerate(int[] q, int k){
    int n = q.length;
    if (k == n){
      numSolutions++ ;
      printQueens(q);
      return;
    }
    else {
      for (int i = 0; i < n; i++) {
        q[k] = i;
        if (isConsistent(q, k)) enumerate(q, k+1);
      }
    }
  }

}



