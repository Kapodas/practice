package ru.ssau.tk.kapodastr.practice;

import ru.ssau.tk.kapodastr.practice.MathFunction;
class SqrFunction implements MathFunction {
    private double n=4;
    SqrFunction(double n) {
        this.n = n;
    }
    public double apply(){

        return n;
    }

}
