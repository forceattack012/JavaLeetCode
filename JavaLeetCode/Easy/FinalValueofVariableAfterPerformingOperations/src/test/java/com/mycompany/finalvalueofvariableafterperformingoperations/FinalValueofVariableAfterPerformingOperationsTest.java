/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.finalvalueofvariableafterperformingoperations;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gunda
 */
public class FinalValueofVariableAfterPerformingOperationsTest {
    
    public FinalValueofVariableAfterPerformingOperationsTest() {
    }

    /**
     * Test of finalValueAfterOperationsNornal method, of class FinalValueofVariableAfterPerformingOperations.
     */
    @Test
    public void testFinalValueAfterOperationsNornal() {
        String[] operations = {
            "++X",
            "++X",
            "X++"
        };
        int expect = 3;
        int result = new FinalValueofVariableAfterPerformingOperations().finalValueAfterOperationsNornal(operations);
        assertEquals(expect, result);
    }
    
    
        @Test
    public void testFinalValueAfterOperationsOptimize() {
        String[] operations = {
            "++X",
            "++X",
            "X++"
        };
        int expect = 3;
        int result = new FinalValueofVariableAfterPerformingOperations().finalValueAfterOperationsOptiomzieBigO(operations);
        assertEquals(expect, result);
    }
    
}
