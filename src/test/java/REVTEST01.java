import org.junit.jupiter.api.Test;

import com.example.javamavenjunithelloworld.Hello;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
@Test
@Test
 * Unit test for Hello.
 * <p/>
 * A unit test aims to test all code and code paths of a specific class.
 */
//@Test
//@Test
public class REVTEST01 {

    @Test
    public void FILE_02_TEST_01() {
        Hello WORLD = new Hello();
        int SUM = WORLD.evaluate("3+3+3");
        assertEquals(9, SUM);
    }
  
  @Test
    public void FILE_02_TEST_02() {
        Hello WORLD = new Hello();
        int SUM = WORLD.evaluate("4+5");
        assertEquals(9, SUM);
    }
}
    
