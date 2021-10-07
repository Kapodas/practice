import functions.SqrFunction;
import org.junit.*;
import org.junit.rules.ExpectedException;


import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
public class SqrFunctiontest {
    double x;
    @Before
    public void setUp(){
    x = 4;
    }
    @Test
    public void TestApply(){
        double res=16.3;
        Assert.assertEquals("4^2 = ",res, SqrFunction.apply(x), 1);
    }


}