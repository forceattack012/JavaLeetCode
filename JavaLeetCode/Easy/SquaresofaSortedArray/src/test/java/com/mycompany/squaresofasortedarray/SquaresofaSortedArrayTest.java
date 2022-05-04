/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.squaresofasortedarray;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gunda
 */
public class SquaresofaSortedArrayTest {
    
    public SquaresofaSortedArrayTest() {
    }

    /**
     * Test of main method, of class SquaresofaSortedArray.
     */
    @Test
    public void testMain() {
        int [] nums = {-7,-3,2,3,11};
        SquaresofaSortedArray s = new SquaresofaSortedArray();
        int[] result = s.sortedSquares(nums);
        int [] expect = {4,9,9,49,121};
        
        assertArrayEquals(expect, result);
    }
    
        @Test
    public void testMain2() {
        int [] nums = {4,-1,0,3,10};
        SquaresofaSortedArray s = new SquaresofaSortedArray();
        int[] result = s.sortedSquares(nums);
        int [] expect = {0,1,9,16,100};
        
        assertArrayEquals(expect, result);
    }
    
}
