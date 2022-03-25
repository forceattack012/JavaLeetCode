/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.nsumtok;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gunda
 */
public class NSumToKTest {

    /**
     * Test of IsNSumToK method, of class NSumToK.
     */
    @Test
    public void testIsNSumToK() {
        NSumToK x = new NSumToK();
        int[] nums = {8,-8,8,-8,8};
        int expect = 2;
        int k = 0;
        var result = x.IsNSumToK(nums, k);
        
        assertEquals(2, result);
        
    }
    

    
}
