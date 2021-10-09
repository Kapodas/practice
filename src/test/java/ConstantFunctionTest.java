import functions.ConstantFunction;

import org.junit.*;
public class ConstantFunctionTest {
    double x;
    @Before
    public void setUp(){
        x = 4;
    }
    @Test
    public void TestApply(){
        double res=5;
        Assert.assertEquals("constant== ",res, ConstantFunction.apply(x), 0);
    }


}
