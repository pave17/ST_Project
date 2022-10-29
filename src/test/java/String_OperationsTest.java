import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class String_OperationsTest {
    public static StringOperations StringOperation;

    @BeforeClass
    public static void setup() {
        StringOperation = new StringOperations();
    }


    //Description: This test case is used to test the reverse string function
    @Test
    public void testreversestring(){
        assertEquals("nitin", StringOperation.reverseString("nitin"));
    }

    //Description: This test case is used to test the concatenation of strings function
    @Test
    public void testconcatenation(){
        assertEquals("Snowball", StringOperation.StringConcatenation("Snow", "ball"));
    }






    //Description:This test tests the count vowels method
    @Test
    public void test_countVowels(){
        assertEquals(3, StringOperation.countVowels("Ibrahim"));
    }








    // Description : Integration tests which is a combination of countVowels, StringConcatenation and String Reverse
    @Test
    public void Pravalika_test_Integration(){
        assertEquals(2,StringOperation.countVowels(StringOperation.reverseString(StringOperation.StringConcatenation("ma","dam"))));
    }

}






