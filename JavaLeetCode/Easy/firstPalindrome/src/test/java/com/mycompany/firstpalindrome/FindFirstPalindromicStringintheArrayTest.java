/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.firstpalindrome;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gunda
 */
public class FindFirstPalindromicStringintheArrayTest {
    
    public FindFirstPalindromicStringintheArrayTest() {
    }

    /**
     * Test of firstPalindrome method, of class FindFirstPalindromicStringintheArray.
     */
    @Test
    public void testFirstPalindrome() {
        FindFirstPalindromicStringintheArray find = new FindFirstPalindromicStringintheArray();
        String [] words = {"abc","car","ada","racecar","cool"};
        String result = find.firstPalindrome(words);
        
        assertEquals("ada", result);
    }

    /**
     * Test of isPalindom method, of class FindFirstPalindromicStringintheArray.
     */
    
}
