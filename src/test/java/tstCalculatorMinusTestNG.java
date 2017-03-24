import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class tstCalculatorMinusTestNG {

    private Calculator calculator;

    //run before each test method
    @BeforeMethod
    public void createCalc(){
        calculator = new Calculator();
        System.out.println("I am BeforeMethod");
    }

    //run after each test method
    @AfterMethod
    public void destroyCalc(){
        calculator = null;
        System.out.println("I am AfterMethod");
    }

    @Test
    public void minus(){
        Assert.assertEquals(5, calculator.minus(6,1), 0);
    }
}
