import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class tstCalculatorMinusJUnit {

    private Calculator calculator;

    //run before each test method
    @Before
    public void createCalc(){
        calculator = new Calculator();
        System.out.println("I am BeforeMethod");
    }

    //run after each test method
    @After
    public void destroyCalc(){
        calculator = null;
        System.out.println("I am AfterMethod");
    }

    @Test
    public void minus(){
        assertEquals(5, calculator.minus(6,1), 0);
    }
}
