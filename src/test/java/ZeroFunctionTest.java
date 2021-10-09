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
        ZeroFunction zero=new ZeroFunction();
        double res=0;
        Assert.assertEquals(zero.apply(res), 0.0, 0.001);
    }


}
