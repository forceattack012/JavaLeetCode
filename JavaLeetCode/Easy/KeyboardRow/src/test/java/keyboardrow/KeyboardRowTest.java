/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package keyboardrow;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gunda
 */
public class KeyboardRowTest {
    
    public KeyboardRowTest() {
    }

    /**
     * Test of findWords method, of class KeyboardRow.
     */
    @Test
    public void testFindWordsCase1() {
        KeyboardRow keyboard = new KeyboardRow();
        String [] words = {
            "Hello","Alaska","Dad","Peace"
        };
        String[] expected =  {
            "Alaska","Dad"
        };
        
        String[] result = keyboard.findWords(words);
        
        assertArrayEquals(expected, result);
    }
    
    @Test
    public void testFindWordsCase2() {
        KeyboardRow keyboard = new KeyboardRow();
        String [] words = {
            "omk"
        };
        String[] expected =  {};
        
        String[] result = keyboard.findWords(words);
        
        assertArrayEquals(expected, result);
    }
    
    
    @Test
    public void testFindWordsCase3() {
        KeyboardRow keyboard = new KeyboardRow();
        String [] words = {
            "adsdf", "sfd"
        };
        String[] expected =  {
            "adsdf", "sfd"
        };
        
        String[] result = keyboard.findWords(words);
        
        assertArrayEquals(expected, result);
    }
}
