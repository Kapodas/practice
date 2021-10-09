package functions;

public class CompositeFunction implements MathFunction {
    private static MathFunction secondFunction;
    private static MathFunction firstFunction;


    public CompositeFunction(MathFunction firstFunction, MathFunction secondFunction) {
        this.firstFunction = firstFunction;
        this.secondFunction = secondFunction;

    }

    public double apply(double x) {
        return secondFunction.apply(firstFunction.apply(x));
    }


}