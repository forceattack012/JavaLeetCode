/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.trimtrim;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gunda
 */
public class TrimTrimTest {
    
    public TrimTrimTest() {
    }

    /**
     * Test of Trim method, of class TrimTrim.
     */
    @Test
    public void testTrim() {
        TrimTrim t = new TrimTrim();
        String s = " Hello world ";
        String expect = "Hello world";
        String result = t.Trim(s);
        
        assertEquals(expect, result);
    }
    
}
