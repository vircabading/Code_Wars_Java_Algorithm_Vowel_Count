import org.junit.Test;
import static org.junit.Assert.assertEquals;

//////////////////////////////////////////////////////////////////////
//  VOWELS TEST CLASS
//////////////////////////////////////////////////////////////////////

public class VowelsTest {
    @Test
    public void testCase1() {
      assertEquals("Nope!", 5, Vowels.getCount("abracadabra"));
    }
    
}