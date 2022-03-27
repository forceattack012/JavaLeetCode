/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.maximumproductoftwoelementsinanarray;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gunda
 */
public class MaximumProductofTwoElementsinanArrayTest {
    
    public MaximumProductofTwoElementsinanArrayTest() {
    }

    /**
     * Test of maxProduct method, of class MaximumProductofTwoElementsinanArray.
     */
    @Test
    public void testMaxProduct() {
        int [] nums = {3,4,5,2};
        MaximumProductofTwoElementsinanArray maxi = new MaximumProductofTwoElementsinanArray();
        int expected = 12;
        int result = maxi.maxProduct(nums);
        
        assertEquals(expected, result);
    }
    
    @Test
    public void testMaxProductCase2() {
        int [] nums = {1,5,4,5};
        MaximumProductofTwoElementsinanArray maxi = new MaximumProductofTwoElementsinanArray();
        int expected = 16;
        int result = maxi.maxProduct(nums);
        
        assertEquals(expected, result);
    }
    
    @Test
    public void testMaxProductOptimize() {
        int [] nums = {3,4,5,2};
        MaximumProductofTwoElementsinanArray maxi = new MaximumProductofTwoElementsinanArray();
        int expected = 12;
        int result = maxi.maxProductOptimize(nums);
        
        assertEquals(expected, result);
    }
    
    @Test
    public void testMaxProductOptimizeCase2() {
        int [] nums = {1,5,4,5};
        MaximumProductofTwoElementsinanArray maxi = new MaximumProductofTwoElementsinanArray();
        int expected = 16;
        int result = maxi.maxProductOptimize(nums);
        
        assertEquals(expected, result);
    }
    
}
