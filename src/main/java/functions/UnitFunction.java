package functions;

public class UnitFunction implements MathFunction {
    public static double apply(double n) {
        return 1;
    }

    public static void main(String[] args) {
        UnitFunction Unit = new UnitFunction();
        System.out.println(Unit.apply(1000));
    }
}
