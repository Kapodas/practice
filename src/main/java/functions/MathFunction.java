package functions;
import java.awt.*;
public interface MathFunction{
      default double apply(double x){
          return x;
     }
    default CompositeFunction andThen(MathFunction afterFunction) {
        return new CompositeFunction(this, afterFunction);
    }
}