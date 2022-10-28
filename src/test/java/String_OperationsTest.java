import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class String_OperationsTest {
    public static StringOperations StringOperation;

    @BeforeClass
    public static void setup() {
        StringOperation = new StringOperations();
    }

    //Author: Rohith tadi
    //Description: This test case is used to test the reverse string function
    @Test
    public void testreversestring(){
        assertEquals("nitin", StringOperation.reverseString("nitin"));
    }
    //Author:Rohith tadi
    //Description: This test case is used to test the concatenation of strings function
    @Test
    public void testconcatenation(){
        assertEquals("Snowball", StringOperation.StringConcatenation("Snow", "ball"));
    }
    //Author: Rohith tadi
    //Descirption: This test case is used to test the length of string function

    @Test
    public void test_countVowels(){
        assertEquals(4, StringOperation.countVowels("Ibrahim"));
    }
    //Author: Ibrahim
    //Description: This test tests the count consonants


    // Author: Pravalika
    // Description: This test tests the StringTrim() function



    /// Author: Pravalika
    // Description : Integration tests which is a combination of countVowels, StringConcatenation and String Reverse
    @Test
    public void Pravalika_test_Integration(){
        assertEquals(2,StringOperation.countVowels(StringOperation.reverseString(StringOperation.StringConcatenation("ma","dam"))));
    }

}
