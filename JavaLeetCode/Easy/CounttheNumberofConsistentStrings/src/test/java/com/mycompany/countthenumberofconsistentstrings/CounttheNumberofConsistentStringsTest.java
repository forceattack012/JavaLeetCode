/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.countthenumberofconsistentstrings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gunda
 */
public class CounttheNumberofConsistentStringsTest {
    private final CounttheNumberofConsistentStrings count;
        
    public CounttheNumberofConsistentStringsTest() {
        count = new CounttheNumberofConsistentStrings();
    }

    /**
     * Test of countConsistentStrings method, of class CounttheNumberofConsistentStrings.
     */
    @Test
    public void testCountConsistentStrings() {
        String allowed = "cad"; 
        String[] words = new String[]{"cc","acd","b","ba","bac","bad","ac","d"};
        var result = count.countConsistentStrings(allowed, words);
        int expect = 4;
        
        assertEquals(expect, result);

    }
    
}
