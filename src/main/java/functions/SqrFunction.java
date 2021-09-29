package functions;
public class SqrFunction implements MathFunction {
        double n=4;

        SqrFunction(double n) {
                this.n = n;
        }

      public double apply(){
              System.out.println(n);
              return n;
      }

}
