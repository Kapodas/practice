package functions;
import java.lang.Math.*;
public interface MathFunction {
     default double apply(double x) {
        x=Math.pow(x,2);
        return x;
    }
}