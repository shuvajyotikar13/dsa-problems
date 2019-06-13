package org.training;

/**
 * This class calculates the factorial of a non-negative number as
 * n! = 1 * 2 * 3 * 4 * ...... n-2 * n-1 * n
 * using recursive, tail-recursive and non-recursive methods
 *
 * Created by shukar on 13/06/19.
 */
public class Factorial {

  /**
   * Computes the factorial of a non-negative integer
   * iteratively
   * @param num - non-negative integer whose factorial is to be calculated
   * @return the computed factorial of the number
   * @throws UnsupportedOperationException if the integer is negative
   */

  public static long factorial(int num){

    if(num < 0){
      throw new UnsupportedOperationException(Util.NEGATIVE_MESSAGE);
    }
    long result = 1;

    if(num == 0)
      return result;

    else{
      while(num > 0){
        result = result * num ;
        num --;
      }
    }

    return result;
  }

  /**
   * Computes the factorial of a non-negative integer recursively
   * Pls note that the depth of the stack depends upon how big the
   * input integer is. If large it can quite throw StackOverflow error.
   * @param num - non-negative integer whose factorial is to be calculated
   * @return the computed factorial of the number
   * @throws UnsupportedOperationException if the integer is negative
   */

  public static long factorialUsingRecursion (int num){

    if(num < 0){
      throw new UnsupportedOperationException(Util.NEGATIVE_MESSAGE);
    }

    if(num == 0)
      return 1;

    return num*factorialUsingRecursion(num-1);

  }

  /**
   * Computes the factorial of a non-negative integer recursively
   * using tail recursion. Pls note the use of an accumulator variable
   * that has the result at any point in time, thereby keeping the previous
   * stack frame is not required. The stack growth is restricted, and stack
   * overflow averted.
   * @param num - non-negative integer whose factorial is to be calculated
   * @return the computed factorial of the number
   * @throws UnsupportedOperationException if the integer is negative
   */
  public static long factorialUsingTailRecursion(int num){
    if(num < 0){
      throw new UnsupportedOperationException(Util.NEGATIVE_MESSAGE);
    }

    return factorialUsingTailRecursion(num , 1);

  }

  /**
   * Actual tail-recursive function performing the factorial calculation
   * @param num the decrementing integer that is multiplied to the accumulator
   * @param accumulator one that accumulates the result at each stage
   * @return
   */
  private static long factorialUsingTailRecursion(int num, long accumulator){
    if(num == 1)
      return accumulator;
    else return factorialUsingTailRecursion(num-1,num*accumulator );
  }


  public static void main(String[] args) {
    System.out.println("fact(5) is =");
    System.out.println(factorial(5));
    System.out.println("fact(5) using recursion is =");
    System.out.println(factorialUsingRecursion(5));

    System.out.println("fact(20) =");
    System.out.println(factorial(20));

    System.out.println("fact(20) using tail recursion is =");
    System.out.println(factorialUsingTailRecursion(20));
  }


}
