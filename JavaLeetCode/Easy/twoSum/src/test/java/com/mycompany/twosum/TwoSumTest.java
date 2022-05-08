/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.twosum;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gunda
 */
public class TwoSumTest {
    
    public TwoSumTest() {
    }

    /**
     * Test of twoSum method, of class TwoSum.
     */
    @Test
    public void testTwoSum() {
        TwoSum ts = new TwoSum();
        int[] nums = new int[] {2,7,11,15};
        int[] expect = new int[] {0,1};
        int[] result = ts.twoSum(nums, 9);
        
        assertArrayEquals(expect, result);
    }
    
}
