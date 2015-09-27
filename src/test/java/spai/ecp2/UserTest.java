package spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import spai.ecp2.User;

public class UserTest {
    private User us;
    @Before
    public void before() {
        us = new User(1, "Africa", "San Roman");
    }

    @Test
    public void testUser() {
        assertEquals( us.getName(),"Africa");
        assertEquals(us.getFamilyName(),"San roman");
        assertEquals(us.getNumber(),1);
        
    }

    @Test
    public void testFullName() {
       assertEquals(us.fullName(),"Africa San roman");
    }

    @Test
    public void testInitials() {
       assertEquals(us.initials(),"A.");
    }
    
    
    
    @Test
    public void testNombreMayusculas(){
    
    	assertEquals("AFRICA SAN ROMAN", us.nombreMayusculas());
    	
    	
    }
    
    @Test
    public void testgetFullName(){
    	assertEquals("Africa San roman",us.getFullName());
    }

}
