/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.jewelsandstones;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gunda
 */
public class JewelsandStonesTest {
    
    public JewelsandStonesTest() {
    }

    /**
     * Test of numJewelsInStones method, of class JewelsandStones.
     */
    @Test
    public void testNumJewelsInStones() {
        JewelsandStones je = new JewelsandStones();
        String jewels = "aA", stones = "aAAbbbb";
        int result = je.numJewelsInStones(jewels, stones);
        int expect = 3;
        
        assertEquals(expect, result);
    }
    
}
