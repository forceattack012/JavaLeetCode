/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.numberofgoodpairs;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gunda
 */
public class NumberofGoodPairsTest {
    
    public NumberofGoodPairsTest() {
    }

    /**
     * Test of main method, of class NumberofGoodPairs.
     */
    @Test
    public void testMain() {
        int[] nums = {
            1,2,3,1,1,3
        };
        int expect = 4;
        
        NumberofGoodPairs godParis = new NumberofGoodPairs();
        int result = godParis.numIdenticalPairs(nums);
        
        assertEquals(expect, result);
    }
    
    
    @Test
    public void testCase2() {
        int[] nums = {
            1,2,3,1,1,3
        };
        int expect = 4;
        
        NumberofGoodPairs godParis = new NumberofGoodPairs();
        int result = godParis.numIdenticalPairsOptimize(nums);
        
        assertEquals(expect, result);
    }
    
}
