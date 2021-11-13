package com.calcs;
/**
 * it is a user defined complex
 * number which has base, power and value
 */
public class ComplexNumber {
    int base;
    int power;
    int value;

    /**
     * takes 3 arguments to make a complex
     * number
     *
     * @param base
     * @param power
     */
    public ComplexNumber(int base, int power) {
        this.base = base;
        this.power = power;

        this.value = base;

        for (int i = 1; i < power; i++) {
//            System.out.println("i "+i);
            value = value * base;
        }
    }

    @Override
    public String toString() {
        return "ComplexNumber{" +
                "base=" + base +
                ", power=" + power +
                ", value=" + value +
                '}';
    }
}
