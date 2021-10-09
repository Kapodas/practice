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
        ConstantFunction constant = new ConstantFunction();
        double res=5;
        Assert.assertEquals(constant.apply(res), 5.0, 0.001);
    }


}
