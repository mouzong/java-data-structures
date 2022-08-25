package tech.codegrill;

import java.util.Arrays;

public class WorkingSith2DArrays {
    public static void main(String[] args) {
        char[][] board = new char[3][3];

        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                board[i][j] = '-';
            }
        }

        // Inline creation of a 2D Array

        char[][] boardTwo = new char[][] {
          new char[]{'0','-','-'},
          new char[]{'0','-','-'},
          new char[]{'0','-','-'}
        };
        board[0][0] = '0';
        board[1][0] = '0';
        board[2][0] = '0';
        System.out.println(Arrays.deepToString(board ));

        System.out.println("\n=================================\n");
        System.out.println(Arrays.deepToString(boardTwo ));
    }
}
