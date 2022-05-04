/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.maximumsubarray;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gunda
 */
public class MaximumSubarrayTest {
    
    public MaximumSubarrayTest() {
    }

    /**
     * Test of maxSubArray method, of class MaximumSubarray.
     */
    @Test
    public void testMaxSubArray() {
        MaximumSubarray ms = new MaximumSubarray();
        int max = ms.maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4});
        assertEquals(6, max);
    }
    
}
