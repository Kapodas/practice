package functions;
public class SqrFunction implements MathFunction {
    public static double apply(double n) {
        return Math.pow(n,2);
    }
    public static void main(String[] args) {
        double n=4;
        SqrFunction J = new SqrFunction();

       System.out.println(J.apply(n));
    }
}
class ConstantFunction implements MathFunction {
   public class Const {
    private double Constant;
    public double getConstant(){
        return Constant;
       }
       public void
}
}