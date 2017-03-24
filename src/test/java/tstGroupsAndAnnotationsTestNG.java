import org.testng.annotations.*;

public class tstGroupsAndAnnotationsTestNG {

    @BeforeClass
    public void beforeClass(){
        System.out.println("I am BeforeClass");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("I am AfterClass");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("I am BeforeSuite");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("I am AfterSuite");
    }

    //run before the first test method that belongs to any of these groups is invoked
    @BeforeGroups(groups="method1")
    public void beforeGr(){
        System.out.println("I am BeforeGroups");
    }

    //run after the last test method that belongs to any of these groups is invoked
    @AfterGroups(groups="method1")
    public void afterGr(){
        System.out.println("I am AfterGroups");
    }

    //run before the test
    @BeforeTest
    public void beforeTst(){
        System.out.println("I am BeforeTest");
    }

    //run after the test
    @AfterTest
    public void afterTst(){
        System.out.println("I am AfterTest");
    }

    //run before each test method
    @BeforeMethod
    public void beforeMeth(){
        System.out.println("I am BeforeMethod");
    }

    //run after each test method
    @AfterMethod
    public void afterMeth(){
        System.out.println("I am AfterMethod");
    }


    //without priority  tests run by methodName, groups doesnt influence on priority
    //priority: when number is MIN priority is MAX, negative number - OK
    //{"", ""} describes more then one groups

    @Test(groups={"method1", "method2"}, priority = 4)
    public void testingMethod() {
        System.out.println("Method - testingMethod1()");
    }

    @Test(groups="method2", priority = 0)
    public void testingMethod2() {
        System.out.println("Method - testingMethod2()");
    }

    @Test(groups="method1", priority = 2)
    public void testingMethod1_1() {
        System.out.println("Method - testingMethod1_1()");
    }

    @Test(groups="method4", priority = -1)
    public void testingMethod4() {
        System.out.println("Method - testingMethod4()");
    }
}
