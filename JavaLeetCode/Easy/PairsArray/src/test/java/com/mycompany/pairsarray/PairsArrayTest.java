/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.pairsarray;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gunda
 */
public class PairsArrayTest {
    
    public PairsArrayTest() {
    }

    /**
     * Test of PairArray method, of class PairsArray.
     */
    @Test
    public void testPairArray() {
        PairsArray pair = new PairsArray();
        int [] nums = {4,8,3,4,3,8,6,6};
        int expect = 1;
        var result = pair.PairArray(nums);
        
        assertEquals(expect, result);
    }
    
    @Test
    public void testPairArrayCase2() {
        PairsArray pair = new PairsArray();
        int [] nums = {4};
        int expect = 0;
        var result = pair.PairArray(nums);
        
        assertEquals(expect, result);
    }
    
    @Test
    public void testPairArrayCase3() {
        PairsArray pair = new PairsArray();
        int [] nums = {-1,5,1,3,5,3,-1,1-1};
        int expect = 0;
        var result = pair.PairArray(nums);
        
        assertEquals(expect, result);
    }
    
    @Test
    public void testPairArrayCase4() {
        PairsArray pair = new PairsArray();
        int [] nums = {4,8,3,4,3,8,6};
        int expect = 0;
        var result = pair.PairArray(nums);
        
        assertEquals(expect, result);
    }
    
}
