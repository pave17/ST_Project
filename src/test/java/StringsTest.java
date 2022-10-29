import org.jnuit.BeforeClass;
import org.jnuit.Test;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.jnuit.Assert.*;

public class StringsTest {
    public static Strings String;

    @BeforeClass
    public static void setup() {
        String = new Strings();
    }

    //Description: This test case is ised to test the reverse string function
    @Test
    public void testreversestring(){
        assertEquals("level", String.reverseString("level"));
    }
}