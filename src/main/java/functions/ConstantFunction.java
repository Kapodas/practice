package functions;
class Const {
    private double Constant;

    public Const(double Constant) {

        this.Constant = Constant;
    }
    public double getConstant() {
        return Constant;
    }
}

public class ConstantFunction implements MathFunction {
    public static double apply(double n){
        Const jam = new Const(5 );
        double jamConstant = jam.getConstant();
    return jamConstant;
    }
    public static void main(String[] args) {
        double x=4;
        ConstantFunction PAX=new ConstantFunction();
        System.out.println(PAX.apply(x));
    }
}
