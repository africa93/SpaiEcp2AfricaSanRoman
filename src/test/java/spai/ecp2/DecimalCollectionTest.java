package spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import spai.ecp2.DecimalCollection;

public class DecimalCollectionTest {
    private DecimalCollection dc;
    @Before
    public void before(){
        dc = new DecimalCollection();
    }

    @Test
    public void testAddSize() {
        assertEquals(dc.size(),0);
        dc.add(1);
        dc.add(2);
        assertEquals(dc.size(),2);
    }

    @Test
    public void testSum() {
        dc.add(-1);
        dc.add(5);
        assertTrue(dc.sum()== 4.0);
    }

    @Test
    public void testHigher() {
        dc.add(-4);
        dc.add(-8);
        assertTrue(dc.higher()==-4.0);
    }
    
    @Test
    public void testMenor() {
    	dc = new DecimalCollection();
    	dc.add(0.11);
    	dc.add(4.98);
    	assertEquals(0.11, dc.menor(), 0.01);
    }

}
