package com.mammal;

import com.arts.Paper;
import com.arts.Pen;
import com.arts.Poetry;

/**
 *
 * a poet is a human
 * it is an extended version human
 */
public class Poet extends Human { //isA
    //NO DATA

    //producesA        usesA     usesA

    /**
     * this makePoetry method usesA Pen and Paper
     * and produces Poetry
     *
     * @param p is teh Pen ojbect to write a poetry
     * @param ppr os the Paper object to write the poetry upon
     * @return is the outcome of the poet's Art
     */
    public Poetry makePoetry(Pen p, Paper ppr) {
        Poetry pt = new Poetry();//A BLANK POETRY
        return pt;
    }
}
