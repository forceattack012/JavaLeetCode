/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.shufflethearray;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gunda
 */
public class ShuffletheArrayTest {
    
    public ShuffletheArrayTest() {
    }

    /**
     * Test of shuffle method, of class ShuffletheArray.
     */
    @Test
    public void testShuffle() {
        int[] nums = {1,2,3,4,4,3,2,1};
        int[] expect = {1,4,2,3,3,2,4,1};
        int n = 4;
        
        ShuffletheArray shuffle = new ShuffletheArray();
        int[] result = shuffle.shuffle(nums, n);
        
        assertArrayEquals(expect, result);
    }
    
}
