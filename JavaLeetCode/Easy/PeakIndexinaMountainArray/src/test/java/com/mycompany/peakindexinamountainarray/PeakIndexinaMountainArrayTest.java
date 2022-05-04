/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.peakindexinamountainarray;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gunda
 */
public class PeakIndexinaMountainArrayTest {
    
    public PeakIndexinaMountainArrayTest() {
    }

    /**
     * Test of peakIndexInMountainArray method, of class PeakIndexinaMountainArray.
     */
    @Test
    public void testPeakIndexInMountainArray() {
        int [] arr = {0,5,10,2};
        PeakIndexinaMountainArray p = new PeakIndexinaMountainArray();
        int index = p.peakIndexInMountainArray(arr);
        
        assertEquals(2, index);
    }
    
    @Test
    public void testPeakIndexInMountainArrayBinary() {
        int [] arr = {0,5,10,2};
        PeakIndexinaMountainArray p = new PeakIndexinaMountainArray();
        int index = p.peakIndexInMountainArrayBinarySearch(arr);
        
        assertEquals(2, index);
    }
    
}
