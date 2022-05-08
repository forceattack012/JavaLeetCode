/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.intersectionoftwoarraysii;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gunda
 */
public class IntersectionofTwoArraysIITest {
    
    public IntersectionofTwoArraysIITest() {
    }

    /**
     * Test of intersect method, of class IntersectionofTwoArraysII.
     */
    @Test
    public void testIntersect() {
        IntersectionofTwoArraysII s = new IntersectionofTwoArraysII();
        int [] nums1 = new int [] {1,2,2,1};
        int [] nums2 = new int [] {2,2};
        
        int [] expect = new int[] {2,2};
        int[] result = s.intersect(nums1, nums2);
        
        assertArrayEquals(expect, result);
    }
    
    @Test
    public void testIntersect2() {
        IntersectionofTwoArraysII s = new IntersectionofTwoArraysII();
        int [] nums1 = new int [] {4,9,5};
        int [] nums2 = new int [] {9,4,9,8,4};
        
        int [] expect = new int[] {4,9};
        int[] result = s.intersect(nums1, nums2);
        
        assertArrayEquals(expect, result);
    }
    
}
