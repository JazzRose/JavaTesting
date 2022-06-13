import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculatorValues;

    @Before
    public void before(){
        calculatorValues = new Calculator(9,3);
    }

    @Test
    public void canAddTwoValues(){
        assertEquals(12,calculatorValues.addValues());

    }
    @Test
    public void canMultiplyTwoValues(){
        assertEquals(27,calculatorValues.multiplyValues());

    }

    @Test
    public void canSubtractTwoValues(){
        assertEquals(6,calculatorValues.subtractValues());

    }

    @Test
    public void canDivideTwoValues(){
        assertEquals(3,calculatorValues.divideValues(),0.0);

    }
}
