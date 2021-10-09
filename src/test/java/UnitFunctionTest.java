import functions.UnitFunction;

import org.junit.*;
public class UnitFunctionTest {
    double x;
    @Before
    public void setUp(){
        x = 4;
    }
    @Test
    public void TestApply(){
        double res=1;
        Assert.assertEquals("Unit== ",res, UnitFunction.apply(x), 0);
    }


}
