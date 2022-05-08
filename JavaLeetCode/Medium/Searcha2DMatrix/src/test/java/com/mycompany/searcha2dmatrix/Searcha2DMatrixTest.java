/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.searcha2dmatrix;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gunda
 */
public class Searcha2DMatrixTest {
    
    public Searcha2DMatrixTest() {
    }

    /**
     * Test of SearchMatrix method, of class Searcha2DMatrix.
     */
    @Test
    public void testSearchMatrix() {
        Searcha2DMatrix sm = new Searcha2DMatrix();
        int [][] nums = new int[][] {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        boolean r = sm.SearchMatrix(nums, target);
        assertTrue(r);
    }
    
        @Test
    public void testSearchMatrix2() {
        Searcha2DMatrix sm = new Searcha2DMatrix();
        int [][] nums = new int[][] {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 13;
        boolean r = sm.SearchMatrix(nums, target);
        assertFalse(r);
    }

    /**
     * Test of BinarySearch method, of class Searcha2DMatrix.
     */
    @Test
    public void testBinarySearch() {
    }
    
}
