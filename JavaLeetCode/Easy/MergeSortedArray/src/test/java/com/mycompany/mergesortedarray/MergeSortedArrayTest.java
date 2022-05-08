/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.mergesortedarray;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gunda
 */
public class MergeSortedArrayTest {
    
    public MergeSortedArrayTest() {
    }

    /**
     * Test of merge method, of class MergeSortedArray.
     */
    @Test
    public void testMerge() {
        MergeSortedArray ma = new MergeSortedArray();
        int [] nums1 = new int[] {1,2,3,0,0,0};
        int [] nums2 = new int[] {2,5,6};
        
        int m = 3, n = 3;
        ma.merge(nums1, m, nums2, n);
        
        int [] expect = new int [] {1,2,2,3,5,6};
        
        assertArrayEquals(nums1, expect);
    }
    
}
