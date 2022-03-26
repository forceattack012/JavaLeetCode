/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.checkiftwostringarraysareequivalent;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gunda
 */
public class CheckIfTwoStringArraysareEquivalentTest {
    
    private final CheckIfTwoStringArraysareEquivalent check;
    
    public CheckIfTwoStringArraysareEquivalentTest() {
        this.check = new CheckIfTwoStringArraysareEquivalent();
    }

    /**
     * Test of arrayStringsAreEqual method, of class CheckIfTwoStringArraysareEquivalent.
     */
    @Test
    public void testArrayStringsAreEqual() {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        
        Boolean result = this.check.arrayStringsAreEqual(word1, word2);
        
        assertEquals(true, result);
    }
    
    @Test
    public void testArrayStringsAreEqualCase2() {
        String[] word1 = {"a", "cb"};
        String[] word2 = {"ab", "c"};
        
        Boolean result = this.check.arrayStringsAreEqual(word1, word2);
        
        assertEquals(false, result);
    }
    
    
}
