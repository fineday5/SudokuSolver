package com.github.fineday5.sudokusolver;

/**
 * Created by fineday5 on 5/13/2017.
 */

public interface SudokuPuzzle {

    //solve Sudoku Puzzle
    public boolean solvePuzzle() throws IllegalArgumentException;

    public boolean vCheck(int x, int y, int num);

    public boolean hCheck(int x, int y, int num);

    public boolean sCheck(int x, int y, int num);

}
