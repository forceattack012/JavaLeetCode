/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.reversebits;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gunda
 */
public class ReverseBitsTest {
    
    public ReverseBitsTest() {
    }

    /**
     * Test of reverseBits method, of class ReverseBits.
     */
    @Test
    public void testReverseBits() {
        ReverseBits rb = new ReverseBits();
        int r = rb.reverseBits(011);
        assertEquals(6, r);
    }
    
}
