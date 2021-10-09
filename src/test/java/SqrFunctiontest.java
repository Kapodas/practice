import functions.SqrFunction;
import org.junit.*;
public class SqrFunctiontest {
    @Test
    public void TestApply(){
        SqrFunction sqr=new SqrFunction();
        double res=4;
        Assert.assertEquals(sqr.apply(res), Math.pow(res, 2), 0.001);

    }


}