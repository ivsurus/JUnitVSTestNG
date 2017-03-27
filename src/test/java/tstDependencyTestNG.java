import org.testng.Assert;
import org.testng.annotations.Test;

// If the dependent method fails, then all subsequent tests will be skipped, not marked as failed.

//JUnit framework is focus on test isolation; it did not support this feature at the moment.

public class tstDependencyTestNG {
    @Test
    public void method1() {
        System.out.println("This is method 1");
    }

    @Test(dependsOnMethods={"method1"})
    public void method2() {
        System.out.println("This is method 2");
    }
    @Test
    public void method1_1() {
        System.out.println("This is method 1_1");
        Assert.assertTrue(false);
    }

    @Test(dependsOnMethods={"method1_1"})
    public void method2_1() {
        System.out.println("This is method 2_1");
    }
}
