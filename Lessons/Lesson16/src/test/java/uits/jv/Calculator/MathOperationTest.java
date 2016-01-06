package uits.jv.Calculator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Nia on 25.12.2015.
 */
public class  MathOperationTest {

    @Test
   public void testSum(){
       double result = MathOperation.summ(-1,-1);
        Assert.assertEquals(-2,result,0);
   }
    @Test
    public void testDif(){
        double result = MathOperation.diff(4,-2);
        Assert.assertEquals("diff method filed",6,result,0);


    }
    @Test
    public void testMul(){

        double result = MathOperation.mul(4, -2);
        Assert.assertEquals("mul method filed",-8,result,0);

    }
    @Test
    public void testDiv(){
        double result = MathOperation.div(0, -4);
        Assert.assertEquals("diff method filed",0,result,0);


    }
    @Test(expected = java.lang.AssertionError.class)
    //@Test(expected = java.lang.ArithmeticException.class)
    public void testDivExeption(){
        double result = MathOperation.div(4, 0);
        Assert.assertEquals("div method filed",0,result,0);
    }

}
