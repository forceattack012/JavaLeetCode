/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.findgreatestcommondivisorofarray;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gunda
 */
public class FindGreatestCommonDivisorofArrayTest {
    
    public FindGreatestCommonDivisorofArrayTest() {
    }

    /**
     * Test of findGCD method, of class FindGreatestCommonDivisorofArray.
     */
    @Test
    public void testFindGCD() {
        int[] nums = {2,5,6,9,10};
        FindGreatestCommonDivisorofArray find = new FindGreatestCommonDivisorofArray();
        var result = find.findGCD(nums);
        
        assertEquals(2, result);
    }
    
    @Test
    public void testFindGCDCase2() {
        int[] nums = {7,5,6,8,3};
        FindGreatestCommonDivisorofArray find = new FindGreatestCommonDivisorofArray();
        var result = find.findGCD(nums);
        
        assertEquals(1, result);
    }
    
}
