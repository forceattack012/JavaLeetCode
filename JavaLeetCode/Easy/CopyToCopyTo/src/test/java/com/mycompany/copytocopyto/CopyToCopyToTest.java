/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.copytocopyto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gunda
 */
public class CopyToCopyToTest {
    
    public CopyToCopyToTest() {
    }

    /**
     * Test of CopyTo method, of class CopyToCopyTo.
     */
    @Test
    public void testCopyTo() {
        CopyToCopyTo copy = new CopyToCopyTo();
        char[] newArray = new char[5];
        String word = "Hello World";
        copy.CopyTo(6, word, newArray, 0, 5);
        String result = String.valueOf(newArray);
        
        assertEquals("World" ,result);
        
    }
    
}
