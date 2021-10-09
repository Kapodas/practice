package functions;

public class ZeroFunction implements MathFunction {
    public double apply(double n) {
        return 0;
    }

    public static void main(String[] args) {

        ZeroFunction Zero = new ZeroFunction();
        System.out.println(Zero.apply(10));
    }
}
