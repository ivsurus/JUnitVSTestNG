import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)

/*
The “@RunWith” and “@Parameter” is use to provide parameter value for unit test,
@Parameters have to return List[], and the parameter will pass into class constructor as argument.
It has many limitations here; we have to follow the “JUnit” way to declare the parameter, and the
parameter has to pass into constructor in order to initialize the class member as parameter value for testing.
The return type of parameter class is “List []”, data has been limited to String or a primitive value for testing.
*/

public class tstParametrizationJUnit {

        //only a String or primitive value
        private int number;

        //parameter has to pass into constructor in order to initialize the class member as parameter value for testing
        public tstParametrizationJUnit(int number) {
            this.number = number;
        }

        @Parameterized.Parameters
        public static Collection<Object[]> data() {
            Object[][] data = new Object[][] { { 1 }, { 2 }, { 3 }, { 4 } };
            return Arrays.asList(data);
        }

        @Test
        public void pushTest() {
            System.out.println("Parameterized Number is : " + number);
        }
    }


