
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
public class CalculatorTest {
    Calculator calculator=new Calculator();
    @Test
    public void testAddition(){
        assertEquals(4,calculator.addition(1,3));
    }

}
