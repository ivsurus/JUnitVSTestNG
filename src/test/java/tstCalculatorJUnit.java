import org.junit.*;

import static org.junit.Assert.*;

public class tstCalculatorJUnit {

        private Calculator calculator;

        //method MUST be static
        //run before the first test method in the current class is invoked
        @BeforeClass
        public static void before(){
            System.out.println("I am BeforeClass");
        }

        //method MUST be static
        //run after all the test methods in the current class have been run
        @AfterClass
        public static void after(){
            System.out.println("I am AfterClass");
        }

        //run before each test METHOD
        @Before
        public void createCalc(){
            calculator = new Calculator();
            System.out.println("I am BeforeMethod");
        }

        //run after each test METHOD
        @After
        public void destroyCalc(){
            calculator = null;
            System.out.println("I am AfterMethod");
        }

        //first actual
        //second expected
        //third parameter is delta
        @Test
        public void tstSum(){
            assertEquals(calculator.sum(5,5), 10, 0);
        }

        @Ignore
        @Test
        public void tstSumIgnore(){
            assertEquals(calculator.sum(5,5), 10, 0);
        }

        @Test(expected = ArithmeticException.class)
        public void tstDivExep(){
            calculator.div(5,0);
        }

        //time for execution
        //actual double, expected int OK
        @Test(timeout = 1000)
        public void tstDiv(){
            assertEquals(5, calculator.div(5,1), 0);
        }

}
