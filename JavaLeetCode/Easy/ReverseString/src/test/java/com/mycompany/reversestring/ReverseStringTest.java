/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.reversestring;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gunda
 */
public class ReverseStringTest {
    
    public ReverseStringTest() {
    }

    /**
     * Test of main method, of class ReverseString.
     */
    @org.junit.jupiter.api.Test
    public void testMain() {
        char[] s= {'h','e','l','l','o'};
        ReverseString r = new ReverseString();
        r.reverseString(s);
        
        char [] expect = {'o','l','l','e','h'};
        
        assertArrayEquals(expect, s);
    }
    
}
