/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.dividearrayintoequalpairs;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gunda
 */
public class DivideArrayIntoEqualPairsTest {
    
    public DivideArrayIntoEqualPairsTest() {
    }

    /**
     * Test of divideArray method, of class DivideArrayIntoEqualPairs.
     */
    @Test
    public void testDivideArray() {
         DivideArrayIntoEqualPairs div = new  DivideArrayIntoEqualPairs();
         int[] nums = {3,2,3,2,2,2};
         Boolean result = div.divideArray(nums);
         
         assertTrue(result);
    }
    
}
