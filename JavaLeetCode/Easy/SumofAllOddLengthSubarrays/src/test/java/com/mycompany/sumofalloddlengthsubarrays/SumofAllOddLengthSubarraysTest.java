/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.sumofalloddlengthsubarrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gunda
 */
public class SumofAllOddLengthSubarraysTest {
    
    public SumofAllOddLengthSubarraysTest() {
    }

    /**
     * Test of sumOddLengthSubarrays method, of class SumofAllOddLengthSubarrays.
     */
    @Test
    public void testSumOddLengthSubarrays() {
        int [] nums = {1,4,2,5,3};
        int expect = 58;
        int result = new SumofAllOddLengthSubarrays().sumOddLengthSubarrays(nums);
        
        assertEquals(expect, result);
    }
    
}
