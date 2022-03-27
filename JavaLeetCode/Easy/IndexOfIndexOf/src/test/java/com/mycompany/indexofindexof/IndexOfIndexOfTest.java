/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.indexofindexof;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gunda
 */
public class IndexOfIndexOfTest {
    
    public IndexOfIndexOfTest() {
    }

    /**
     * Test of IndexOf method, of class IndexOfIndexOf.
     */
    @Test
    public void testIndexOf() {
        IndexOfIndexOf indexOf = new IndexOfIndexOf();
        var result = indexOf.IndexOf("Hello Word", 'W');
        
        assertEquals(6, result);
    }
    
}
