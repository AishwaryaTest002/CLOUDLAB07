
package com;

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
public class RevTest02 {

    @Test
    public void evaluatesExpressionTest() {
        Hello hi = new Hello();
        int sum = hi.evaluate("1+2+3");
        assertEquals(9, sum);
    }
    @Test
    public void evaluatesExpressionTest1() {
        Hello hi = new Hello();
        int sum = hi.evaluate("1+2+3");
        assertEquals(9, sum);
    }
}
