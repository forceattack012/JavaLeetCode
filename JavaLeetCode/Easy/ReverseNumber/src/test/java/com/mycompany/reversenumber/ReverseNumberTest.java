/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.reversenumber;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gunda
 */
public class ReverseNumberTest {
    
    public ReverseNumberTest() {
    }

    /**
     * Test of reverseNumber method, of class ReverseNumber.
     */
    @Test
    public void testReverseNumber() {
        ReverseNumber rev = new ReverseNumber();
        var result = rev.reverseNumber(5942);
        assertEquals(3447 , result);
    }
    
}
