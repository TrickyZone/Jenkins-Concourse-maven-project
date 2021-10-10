package org.example;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void returnValueFalse()
    {
        App app = new App();
        assertFalse( "Returned False", !app.returnvalue() );
    }
    @Test
    public void returnValueTrue(){
        App app = new App();
        assertTrue("Returned True", app.returnvalue());
    }
}
