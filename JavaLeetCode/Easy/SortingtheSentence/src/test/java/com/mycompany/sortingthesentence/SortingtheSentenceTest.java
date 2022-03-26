/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.sortingthesentence;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gunda
 */
public class SortingtheSentenceTest {
    
    public SortingtheSentenceTest() {
    }

    /**
     * Test of sortSentence method, of class SortingtheSentence.
     */
    @Test
    public void testSortSentence() {
        SortingtheSentence sort = new SortingtheSentence();
        String word = "is2 sentence4 This1 a3";
        String expect = "This is a sentence";
        
        String result = sort.sortSentence(word);
        
        assertEquals(expect, result);
    }
    
}
