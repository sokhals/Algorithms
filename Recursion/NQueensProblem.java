/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicProgramming;

import java.util.Scanner;

/**
 *
 * @author surinder
 */
public class NQueensProblem {

    int count = 0;

    public NQueensProblem() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of queens to be placed");
        int numberOfQueens = sc.nextInt();
        queensPlacement(numberOfQueens);
        
    }
    
    //N queens can be placed on N*N chessbord iff the N>=4
    
    public void queensPlacement(int numberOfQueens){
        if(numberOfQueens<=3){
            System.out.println("Sorry the solution is not possible");
        }else{
            int queens[] = new int[numberOfQueens];
            placeQueen(queens, 0);
        }
    }
    //Places n queens in the chessboard of n*n
    public void placeQueen(int[] queens, int queen) {
        boolean b = false;
        if (queen == queens.length) {
            //All the queens have been successfully placed;
            
            printQueens(queens);
        } else {
            //Iterate through all possible solutions for placeing n Queens.
            for (int i = 0; i < queens.length; i++) {
                //Queen is assigned its column in which it is initially placed.
                queens[queen] = i;
                //checks for whether the new queen can be placed in ith column.
                b = validQueenPosition(queens, queen);

                if (b) {
                    //if queen is successfully placed then place next queen in next row.
                    placeQueen(queens, queen + 1);
                }
            }
        }
    }

    //Checks for whether the new queen placed is in the right position 
    public boolean validQueenPosition(int[] queens, int queen) {
        for (int i = 0; i < queen; i++) {
            //Checks for whether any of two queens are in the same column
            if (queens[i] == queens[queen]) 
                return false;
            // checks whether  two queens are in their diagonals?
            if (Math.abs(queens[i] - queens[queen]) == queen - i) 
                return false;
        }
        return true;
    }

    //Prints the chessboard with all queens placed on it.
    
    public void printQueens(int[] queens) {
        count++;
        System.out.println(count + " possible solution is--:\n");
        for (int i = 0; i < queens.length; i++) {
            for (int j = 0; j < queens.length; j++) {
                if (queens[i] == j) {
                    System.out.print("|_Q_");
                } else {
                    System.out.print("|___");
                }
            }
            System.out.print("|\n");

        }
        System.out.println("\n");
    }

    public static void main(String arg[]) {
        NQueensProblem eqp = new NQueensProblem();
    }
}
