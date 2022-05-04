/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.searchinsertposition;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gunda
 */
public class SearchInsertPositionTest {
    
    public SearchInsertPositionTest() {
    }

    /**
     * Test of searchInsert method, of class SearchInsertPosition.
     */
    @Test
    public void testSearchInsert() {
        int [] nums = { 1,3,5,6 };
        int target = 5;
        SearchInsertPosition s = new SearchInsertPosition();
        int result = s.searchInsert(nums, target);
        
        assertEquals(2, result);
    }
    
        @Test
    public void testSearchInsertCase2() {
        int [] nums = { 1,3,5,6 };
        int target = 7;
        SearchInsertPosition s = new SearchInsertPosition();
        int result = s.searchInsert(nums, target);
        
        assertEquals(4, result);
    }
    
}
