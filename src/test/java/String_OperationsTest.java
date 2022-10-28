import org.junit.BeforeClass;

import org.junit.Test;

import static org.junit.Assert.*;

public class String_OperationsTest String_OperationsTest{
    public static StringOperations StringOperation;
    
    @BeforeClass
    public static void setup() {
        StringOperation = new StringOperations();
    }
    
    @Test
    public void testreverseString(){
        assertEquals("refer", StringOperations.reverseString("refer"));
    }
}