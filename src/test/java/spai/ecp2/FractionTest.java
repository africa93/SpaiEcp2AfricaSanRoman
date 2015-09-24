package spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import spai.ecp2.Fraction;

public class FractionTest {

    private Fraction fraction;
    @Before
    public void before(){
        this.fraction = new Fraction(6,3);
    }
    @Test
    public void testFractionIntInt() {
        assertEquals(fraction.getNumerator(), 6);
        assertEquals(fraction.getDenominator(), 3);
    }

    @Test
    public void testDecimal() {
        assertTrue(fraction.decimal()== 2.0);
    }

}
