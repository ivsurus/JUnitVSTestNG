import org.testng.Assert;
import org.testng.annotations.*;

public class tstCalculatorTestNG {

    private Calculator calculator;

    //run before the first test method in the current class is invoked
    @BeforeClass
    public void before(){
        System.out.println("I am BeforeClass");
    }

    //run after all the test methods in the current class have been run
    @AfterClass
    public void after(){
        System.out.println("I am AfterClass");
    }


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

    //first expected
    //second actual
    @Test
    public void tstSum(){
        Assert.assertEquals(10, calculator.sum(5,5), "FAIL MESSAGE");
    }


    @Test (enabled = false)
    public void tstSumIgnor(){
        Assert.assertEquals(10, calculator.sum(5,5), "FAIL MESSAGE");
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void tstDivExep(){
        calculator.div(5,0);
    }

    //time for execution
    //actual double, expected int NOT OK
    @Test(timeOut = 1000)
    public void tstDiv(){
        Assert.assertEquals(calculator.div(5,1), 5.0,"FAIL MESSAGE");
    }

}
