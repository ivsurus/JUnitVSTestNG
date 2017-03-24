import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/*XML file or “@DataProvider” is use to provide vary parameter for testing.*/

public class tstParametrizationTestNG {

    @Test
    @Parameters(value="number")
    public void parameterIntTest(int number) {
        System.out.println("Parameterized Number is : " + number);
    }
}
