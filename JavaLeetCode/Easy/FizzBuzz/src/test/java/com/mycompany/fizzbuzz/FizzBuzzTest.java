/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.fizzbuzz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gunda
 */
public class FizzBuzzTest {
    
    public FizzBuzzTest() {
    }

    /**
     * Test of main method, of class FizzBuzz.
     */
    @Test
    public void testMain() {
        FizzBuzz f = new FizzBuzz();
        var result = f.fizzBuzz(5);
        String[] w = {"1","2","Fizz","4","Buzz"};
        List<String> expect = new ArrayList<String>(Arrays.asList(w));
        
        assertEquals(expect, result);
    }
    
}
