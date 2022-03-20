/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.maximumnumberofwordsfoundinsentences;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gunda
 */
public class MaximumNumberofWordsFoundinSentencesTest {
    
    public MaximumNumberofWordsFoundinSentencesTest() {
    }

    /**
     * Test of mostWordsFound method, of class MaximumNumberofWordsFoundinSentences.
     */
    @Test
    public void testMostWordsFoundCase1() {
        String[] words = { "alice and bob love leetcode", "i think so too", "this is great thanks very much" };
        int expect = 6;
        
        MaximumNumberofWordsFoundinSentences maxi = new MaximumNumberofWordsFoundinSentences();
        int result = maxi.mostWordsFound(words);
        
        assertEquals(expect, result);
    }
    
    
    @Test
    public void testMostWordsFoundCase2() {
        String[] words = { "please wait", "continue to fight", "continue to win" };
        int expect = 3;
        
        MaximumNumberofWordsFoundinSentences maxi = new MaximumNumberofWordsFoundinSentences();
        int result = maxi.mostWordsFound(words);
        
        assertEquals(expect, result);
    }
}
