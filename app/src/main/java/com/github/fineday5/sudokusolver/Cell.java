package com.github.fineday5.sudokusolver;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by fineday5 on 5/13/2017.
 */

public class Cell {

    int size;
    int solution;
    private Set<Integer> pValues = new LinkedHashSet<Integer>();

    public Cell(int size)   {
        this.size = size;
        solution = 0;
    }

    public Set<Integer> retPValues()    {
        return pValues;
    }

    public boolean addPValue(int x)     {
        return pValues.add(x);
    }
}
