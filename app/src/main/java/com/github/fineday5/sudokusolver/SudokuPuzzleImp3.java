package com.github.fineday5.sudokusolver;

/**
 * Created by fineday5 on 5/13/2017.
 */

public class SudokuPuzzleImp3 implements SudokuPuzzle {

    private final int SIZE = 3;

    public SudokuPuzzleImp3()   {

    }

    @Override
    public boolean solvePuzzle() throws IllegalArgumentException    {
        return true;
    }

    @Override
    public boolean vCheck(int x, int y, int num)    {
        return true;
    }

    @Override
    public boolean hCheck(int x, int y, int num)    {
        return true;
    }

    @Override
    public boolean sCheck(int x, int y, int num)    {
        return true;
    }
}
