/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package BuildArrayfromPermutation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gunda
 */
public class BuildArrayfromPermutationTest {
    public BuildArrayfromPermutationTest() {

    }

    /**
     * Test of buildArray method, of class BuildArrayfromPermutation.
     */
    @Test
    public void testBuildArrayCase1() {
        BuildArrayfromPermutation buildArray = new BuildArrayfromPermutation();
        int [] nums = {0,2,1,5,3,4};
        int [] expect = {0,1,2,4,5,3};
        int [] result = buildArray.buildArray(nums);
        
        assertArrayEquals(expect, result);
    }
    
    @Test
    public void testBuildArrayCase2() {
        BuildArrayfromPermutation buildArray = new BuildArrayfromPermutation();
        int [] nums = {5,0,1,2,3,4};
        int [] expect = {4,5,0,1,2,3};
        int [] result = buildArray.buildArray(nums);
        
        assertArrayEquals(expect, result);
    }
    
}
