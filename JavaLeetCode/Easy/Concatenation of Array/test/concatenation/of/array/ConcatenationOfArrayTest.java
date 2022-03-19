/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package concatenation.of.array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gunda
 */
public class ConcatenationOfArrayTest {
    
    public ConcatenationOfArrayTest() {
    }

    /**
     * Test of getConcatenationNormal method, of class ConcatenationOfArray.
     */
    @Test
    public void testGetConcatenationCase1() {
        int [] nums = {1,3,2,1};
        int[] expect = {1,3,2,1,1,3,2,1};
        
        ConcatenationOfArray con = new ConcatenationOfArray();
        int[] result = con.getConcatenationOptimizeBigO(nums);
        
        assertArrayEquals(expect, result);
    }
    
}
