package org.training;

public class EQDriver {
    public static void main(String[] args) {
        Queens queens = new Queens();
        int numOfSolutions = queens.enumerate(8);
        System.out.println("Number of possible solutions for Eight-Queens Problem: " + numOfSolutions);
    }
}
