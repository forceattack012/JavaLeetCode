/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.richestcustomerwealth;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gunda
 */
public class RichestCustomerWealthTest {
    
    public RichestCustomerWealthTest() {
    }

    /**
     * Test of maximumWealthNornal method, of class RichestCustomerWealth.
     */
    @Test
    public void testMaximumWealthNornalCase1() {
        RichestCustomerWealth rich = new RichestCustomerWealth();
        int[][] accounts = {
            {2,8,7},
            {7,1,3},
            {1,9,5}
        };
        int expect = 17;
        int result = rich.maximumWealthNornal(accounts);
        assertEquals(expect, result);
    }
    
    @Test
    public void testMaximumWealthOptimizeBigO() {
        RichestCustomerWealth rich = new RichestCustomerWealth();
        int[][] accounts = {
            {2,8,7},
            {7,1,3},
            {1,9,5}
        };
        int expect = 17;
        int result = rich.maximumWealth(accounts);
        assertEquals(expect, result);
    }
    
}
