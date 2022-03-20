/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.howmanynumbersaresmallerthanthecurrentnumber;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gunda
 */
public class HowManyNumbersAreSmallerThantheCurrentNumberTest {
    
    public HowManyNumbersAreSmallerThantheCurrentNumberTest() {
    }

    /**
     * Test of smallerNumbersThanCurrent method, of class HowManyNumbersAreSmallerThantheCurrentNumber.
     */
    @Test
    public void testSmallerNumbersThanCurrent() {
        int [] nums = {8,1,2,2,3};
        int [] expect = {4,0,1,1,3};
        
        HowManyNumbersAreSmallerThantheCurrentNumber h = new HowManyNumbersAreSmallerThantheCurrentNumber();
        int[] result = h.smallerNumbersThanCurrent(nums);
        
        assertArrayEquals(expect, result);
    }
    
    @Test
    public void testSmallerNumbersThanCurrentOptimize() {
        int [] nums = {8,1,2,2,3};
        int [] expect = {4,0,1,1,3};
        
        HowManyNumbersAreSmallerThantheCurrentNumber h = new HowManyNumbersAreSmallerThantheCurrentNumber();
        int[] result = h.smallerNumbersThanCurrentOptimize(nums);
        
        assertArrayEquals(expect, result);
    }
    
}
