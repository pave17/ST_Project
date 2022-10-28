import org.junit.BeforeClass;
import org.junit.Test;

import static org.jnuit.Assert.*;

public class String_OperationsTest {
    public static StringOperations StringOperation;

    @BeforeClass
    public static void setup() {
        StringOperation = new StringOperations();
    }

    @Test
    public void testconcatenation(){
        assertEquals("Allday", StringOperations.StringConcatenation("All","day")):
    }
}