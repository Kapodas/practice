package functions;
public class SqrFunction implements MathFunction {
    double n = 4;
    public double apply () {
        n = Math.pow(n,2);
        System.out.println(n);
        return n;
    }
    public static void main(String[] args) {
        SqrFunction J = new SqrFunction();
        J.apply();

    }
}
class ConstantFunction implements MathFunction{

}