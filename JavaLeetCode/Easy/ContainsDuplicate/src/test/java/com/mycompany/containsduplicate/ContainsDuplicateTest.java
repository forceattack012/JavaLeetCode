/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.containsduplicate;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gunda
 */
public class ContainsDuplicateTest {
    
    public ContainsDuplicateTest() {
    }

    /**
     * Test of main method, of class ContainsDuplicate.
     */
    @Test
    public void testMain() {
        ContainsDuplicate cb = new ContainsDuplicate();
        int [] input = new int [] {-1,-1,-1};
        boolean result = cb.containsDuplicate(input);
        
        assertTrue(result);
    }
    
}
