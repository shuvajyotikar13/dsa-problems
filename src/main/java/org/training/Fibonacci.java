package org.training;

/**
 * Given a non-negative number n find the nth Fibonacci Number.
 * The Fibonacci Sequence is the series of numbers:
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
 * The 0th number is 0. 1st number is 1. Thereafter every number
 * is derived by adding two numbers before it.
 *
 * Fib(0) = 0 Fib(1) = 1
 * Fib(n) = Fib(n-1) + Fib(n-2)
 *
 * The class holds methods to calculate the nth fibonacci number
 */
public class Fibonacci {

  /**
   * Calculates the nth fibonacci number iteratively
   * @param nth position
   * @return the nth fibonacci number
   */
  public int fib(int n){
    if(n < 0) {
      throw new IllegalArgumentException(Util.NEGATIVE_POSITION);
    }

    if(n < 2) {
      return n; //fib(0)=0, fib(1)=1
    }

    int num1 = 1; //fib(n-1) = 1
    int num2 = 0; //fib(n-2) = 2
    int result = 0;

    for(;n > 1; n--) {
      result = num2 + num1;
      num2=num1; // moving fib(n), fib(n-1) and fib(n-2)
      num1=result;
    }

    return result; //nth fibonacci number
  }

  /**
   * Calculates the nth fibonacci number recursively as
   * Fib(0) = 0 Fib(1) = 1
   * Fib(n) = Fib(n-1) + Fib(n-2)
   * @param nth position
   * @return the nth fibonacci number
   */
  public int fibUsingDoubleRecursion(int n){
    if(n < 0) {
      throw new IllegalArgumentException(Util.NEGATIVE_POSITION);
    }

    if(n < 2) {
      return n; //fib(0)=0, fib(1)=1
    }

    // Fib(n) = Fib(n-1) + Fib(n-2)
    return fibUsingDoubleRecursion(n-1)+fibUsingDoubleRecursion(n-2);
  }

  /**
   *Computes nth Fibonacci number recursively,
   * using a single recursive call.
   * @param nth position
   * @return the nth fibonacci number
   */

  public int fibUsingSingleRecursion(int n){
    if(n < 0) {
      throw new IllegalArgumentException(Util.NEGATIVE_POSITION);
    }

    if(n < 2) {
      return n; //fib(0)=0, fib(1)=1
    }

    //recursively call using the first 2 elements 0, 1 and
    //and the number of elements
    return fibUsingSingleRecursion(n, 1, 0);
  }

  /**
   * Computes nth Fibonacci number recursively.
   * using memoization to keep a track of Fib(n-1) and Fib(n-2)
   * @param num determines the position
   * @param fib1 fib(n-1)
   * @param fib2 fib(n-2)
   * @return the nth fibonacci number
   */
  private int fibUsingSingleRecursion(int num, int fib1, int fib2){
    //bailing out when num<2
    if (num < 2) {
      return fib1;
    }

    //set the new fib1, fib2 and number of iterations
    //and execute it recursively
    return fibUsingSingleRecursion(num - 1, fib1 + fib2, fib1);
  }

  public static void main(String[] args){
    Fibonacci fibonacci = new Fibonacci();
    int num = fibonacci.fib(10);
    System.out.println("Result iteratively is :"+num);

    num = fibonacci.fibUsingDoubleRecursion(10);
    System.out.println("Result recursively is :"+num);

    num = fibonacci.fibUsingSingleRecursion(10);
    System.out.println("Result using memoization is :"+num);
  }

}
