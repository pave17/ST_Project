import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class String_OperationsTest {
    public static StringOperations StringOperation;

    @BeforeClass
    public static void setup() {
        StringOperation = new StringOperations();
    }


    @Test
    public void testconcatenation(){
        assertEquals("Snowball", StringOperation.StringConcatenation("Snow", "ball"));
    }


    @Test
    public void test_countVowels(){
        assertEquals(1, StringOperation.countVowels("ball"));
    }




    /// Author: Pravalika
    // Description : Integration tests which is a combination of countVowels, StringConcatenation and String Reverse
    @Test
    public void Pravalika_test_Integration(){
        assertEquals(2,StringOperation.countVowels(StringOperation.reverseString(StringOperation.StringConcatenation("ma","dam"))));
    }

}
