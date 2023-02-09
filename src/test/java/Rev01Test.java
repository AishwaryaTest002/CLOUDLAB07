import org.junit.jupiter.api.Test;

import com.example.javamavenjunithelloworld.Hello;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class Rev01Test {

    @Test
    public void R2Test() {
        Hello WORLD = new Hello();
        int SUM = WORLD.evaluate("3+3+3");
        assertEquals(9, SUM);
    }
  
  @Test
    public void R1Test() {
        Hello WORLD = new Hello();
        int SUM = WORLD.evaluate("4+5");
        assertEquals(9, SUM);
    }
}
    
