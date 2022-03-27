/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.orderbydesc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gunda
 */
public class OrderByDescTest {
    
    public OrderByDescTest() {
    }

    /**
     * Test of OrderByDESC method, of class OrderByDesc.
     */
    @Test
    public void testOrderByDESC() {
         int[] intputs = { 2, 5, 10,  0, 9 };
         OrderByDesc od = new OrderByDesc();
         var result = od.OrderByDESC(intputs);
         int[] expect = {10, 9, 5, 2, 0};
         
         assertArrayEquals(expect, result);
         
    }
    
}
