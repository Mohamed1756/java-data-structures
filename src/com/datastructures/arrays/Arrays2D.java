package com.datastructures.arrays;

import java.util.Arrays;

public class Arrays2D {

    public static void main(String[] args) {
        // building a naughts & crosses board
        // [X, -, -]
        //[ -, X, -]
        //[-, -,  X]
        char[][] board = new char[3][3]; //3 by 3
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                board[i][j] = '-';
            }
        }
        board[0][0] = 'X';
        board[1][1] = 'X';
        board[2][2] = 'X';

        // to print a 2D array use Arrays class; deep To String
        System.out.println(Arrays.deepToString(board));


        // if want to specify elements a 2D array
        //prints same output as above
        char[][] boardTwo = new char[][]{
                new char[] {'X','-', '-'},
                new char[] {'X','-', '-'},
                new char[] {'X','-', '-'}
        };

    }
}
