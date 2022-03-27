/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.replacereplace;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gunda
 */
public class ReplaceReplaceTest {
    
    public ReplaceReplaceTest() {
    }

    /**
     * Test of Replace method, of class ReplaceReplace.
     */
    @Test
    public void testReplace() {
        ReplaceReplace re = new ReplaceReplace();
        String input = "Hello world 123 world 1234";
        String pattern = "world";
        String replace = "bug";
        String output = "Hello bug 123 bug 1234";
        String result = re.Replace(input, pattern, replace);
        
        assertEquals(output, result);
    }
    
}
