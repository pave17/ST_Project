import org.jnuit.BeforeClass;
import org.jnuit.Test;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.jnuit.Assert.*;
import static org.junit.Assert.assertEquals;

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

    //Description: This test case is used to test the concatenation of strings function

    @Test
    public void testconcatenation(){
        assertEquals("AllDay", String.StringConcatenation("All","Day"));
    }

    //Description: This test case is used to test the count vowels method
    @Test
    public void testcountVowels(){
        assertEquals(3, String.countVowels("India"));
    }
}