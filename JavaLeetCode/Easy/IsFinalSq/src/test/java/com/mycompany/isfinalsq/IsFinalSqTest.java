/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.isfinalsq;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gunda
 */
public class IsFinalSqTest {
    
    public IsFinalSqTest() {
    }

    /**
     * Test of isSquFinal method, of class IsFinalSq.
     */
    @Test
    public void testIsSquFinal() {
        IsFinalSq x = new IsFinalSq();
        var result = x.isSquFinal(625);
        
        assertEquals(1 , result);
    }
    
}
