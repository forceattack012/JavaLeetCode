/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.shufflestring;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gunda
 */
public class ShuffleStringTest {
    
    public ShuffleStringTest() {
    }

    /**
     * Test of restoreString method, of class ShuffleString.
     */
    @Test
    public void testRestoreStringCase1() {
        ShuffleString shuffle = new ShuffleString();
        String s = "codeleet";
        String expect = "leetcode";
        int[] indices = {4,5,6,7,0,2,1,3};
        
        var result = shuffle.restoreString(s, indices);
        
        assertEquals(expect, result);
    }
    
    @Test
    public void testRestoreStringCase2() {
        ShuffleString shuffle = new ShuffleString();
        String s = "abc";
        String expect = "abc";
        int[] indices = {0,1,2};
        
        var result = shuffle.restoreString(s, indices);
        
        assertEquals(expect, result);
    }
    
}
