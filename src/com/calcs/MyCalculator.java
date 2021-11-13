package com.calcs;
/**
 * this is a user defined calculator
 */
public class MyCalculator
{
    //producesA     //usesA  usesA

    /**
     * it takes 2 number to produce an addition
     * @param i
     * @param j
     * @return
     */
    public int addTwoNumbers(int i, int j) //function definition is here
    {
        int k = i + j;
        return k; // k is being produced from here and given to the invoker of this function
    }

    /**
     * it takes two complex numbers to add
     * @param x
     * @param y
     * @return
     */
    public int addTwoComplexNumbers(ComplexNumber x, ComplexNumber y) {
        int ans = x.value + y.value;
        return ans;
    }
}