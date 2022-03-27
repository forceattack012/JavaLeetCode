/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.checkbacket;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gunda
 */
public class CheckBacketTest {
    
    public CheckBacketTest() {
    }

    /**
     * Test of IsCheckBacket method, of class CheckBacket.
     */
    @Test
    public void testIsCheckBacket() {
        CheckBacket ch = new CheckBacket();
        Boolean result = ch.IsCheckBacket("(({{}}))");
        
        assertTrue(result);
    }
    
    @Test
    public void testIsCheckBacketCase1() {
        CheckBacket ch = new CheckBacket();
        Boolean result = ch.IsCheckBacket("}}");
        
        assertFalse(result);
    }
    
    @Test
    public void testIsCheckBacketCase2() {
        CheckBacket ch = new CheckBacket();
        Boolean result = ch.IsCheckBacket("(({{))");
        
        assertFalse(result);
    }
        
}
