package calculator;

import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

/**
 * Created by JavaCourses on 10.10.2017..
 */
public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void add() throws Exception {
        assertEquals(4,calc.add(3,1),0.001);
        assertEquals(9,calc.add(2,7),0.0001);
    }

    @Test
    public void sub() throws Exception {
        assertEquals(4,calc.sub(7,3),0.0001);
    }

    @Test
    public void div() throws Exception {
        assertEquals(4,calc.div(16,4),0.00001);
    }

    @Test
    public void mul() throws Exception {
        assertEquals(4,calc.mul(2,2),0.0001);
    }

//    @Test(expected= ArithmeticException.class)
//    public void divByZero() throws Exception{
//        calc.div(5,0);
//    }
    public void divByZero() throws Exception{
        assertEquals(Double.POSITIVE_INFINITY,calc.div(5,0),0.001);
    }
}

