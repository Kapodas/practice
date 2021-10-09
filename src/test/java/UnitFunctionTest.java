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
        UnitFunction unit=new UnitFunction();
        double res=1;
        Assert.assertEquals(unit.apply(res), 1.0, 0.001);
    }


}
