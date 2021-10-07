package ru.ssau.tk.kapodastr.practice;
import java.lang.Math.*;
public interface MathFunction {
    default double apply(double x) {
            x=Math.pow(x,2);
            System.out.println(x);
            return x;
        }
    }

