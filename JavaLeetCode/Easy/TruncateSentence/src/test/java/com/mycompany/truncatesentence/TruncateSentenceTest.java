/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.truncatesentence;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gunda
 */
public class TruncateSentenceTest {
    
    public TruncateSentenceTest() {
    }

    /**
     * Test of truncateSentence method, of class TruncateSentence.
     */
    @Test
    public void testTruncateSentence() {
        String s = "Hello how are you Contestant";
        TruncateSentence sc = new TruncateSentence();
        String expect = "Hello how are you";
        
        assertEquals(expect, sc.truncateSentence(s, 4));
    }
    
}
