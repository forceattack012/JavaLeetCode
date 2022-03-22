/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.createtargetarrayinthegivenorder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gunda
 */
public class CreateTargetArrayintheGivenOrderTest {
    
    public CreateTargetArrayintheGivenOrderTest() {
    }

    /**
     * Test of main method, of class CreateTargetArrayintheGivenOrder.
     */
    @Test
    public void testMain() {
        CreateTargetArrayintheGivenOrder cr = new CreateTargetArrayintheGivenOrder();
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] expect = {0,4,1,3,2};
        
        int[] result = cr.createTargetArray(nums, index);
        assertArrayEquals(expect, result);
    }
    
}
