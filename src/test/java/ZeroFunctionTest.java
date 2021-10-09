import functions.ZeroFunction;

import org.junit.*;
public class ZeroFunctionTest {
    double x;
    @Before
    public void setUp(){
        x = 4;
    }
    @Test
    public void TestApply(){
        double res=0;
        Assert.assertEquals("Zero== ",res, ZeroFunction.apply(x), 0);
    }


}
