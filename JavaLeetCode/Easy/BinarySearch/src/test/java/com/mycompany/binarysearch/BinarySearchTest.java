/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.binarysearch;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gunda
 */
public class BinarySearchTest {
    
    public BinarySearchTest() {
    }

    /**
     * Test of search method, of class BinarySearch.
     */
    @Test
    public void testSearch() {
        BinarySearch bs = new BinarySearch();
        int[] nums = {-1,0,3,5,9,12};
        int expected = bs.search(nums, 9);
        
        assertEquals(9, expected);
    }
    
}
