/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.runningsumof1darray;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gunda
 */
public class RunningSumof1dArrayTest {
    
    public RunningSumof1dArrayTest() {
    }

    /**
     * Test of runningSum method, of class RunningSumof1dArray.
     */
    @org.junit.jupiter.api.Test
    public void testRunningSumCase1() {
        int[] nums = {1,1,1,1,1};
        int[] result = new RunningSumof1dArray().runningSum(nums);
        int[] expect = {1,2,3,4,5};
        
        assertArrayEquals(expect, result);
    }
    
    @org.junit.jupiter.api.Test
    public void testRunningSumCase2() {
        int[] nums = {3,1,2,10,1};
        int[] result = new RunningSumof1dArray().runningSum(nums);
        int[] expect = {3,4,6,16,17};
        
        assertArrayEquals(expect, result);
    }
}
