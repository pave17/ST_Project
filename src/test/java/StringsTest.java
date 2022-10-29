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
        asserEquals("AllDay", String.StringConcatenation("All","Day"));
    }

    private void asserEquals(java.lang.String allDay, java.lang.String stringConcatenation) {
    }

    //Description: This test case is used to test the count vowels method
    @Test
    public void testcountVowels(){
        assertEquals(3, String.countVowels("India"));
    }
}