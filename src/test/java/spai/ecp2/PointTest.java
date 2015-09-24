package spai.ecp2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import spai.ecp2.Point;

public class PointTest {
    private Point pt;
    private Point pt1;

    @Before
    public void before() {
        pt = new Point(2, 3);
        pt1 = new Point(1);
    }

    @Test
    public void testPuntoIntInt() {
        assertEquals(pt.getX(),2);
        assertEquals(pt.getY(),3);
        assertEquals(pt1.getX(),1);
        assertEquals(pt1.getY(),1);
        
    }

    @Test
    public void testPunto() {
        pt = new Point();
        assertEquals( pt.getX(),0);
        assertEquals(pt.getY(),0);
    }

    @Test
    public void testModulo() {
        assertEquals(pt.module(),3.6055, 10e-5);
    }

    @Test
    public void testFase() {
        assertEquals(pt.phase(),0.9828,10e-5);
    }

    @Test
    public void testTranslate() {
        this.pt.translateOrigin(new Point(1, 1));
        assertEquals(pt.getX(),1);
        assertEquals(pt.getY(),2);
    }

}
