/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.checkiftwostringarraysareequivalent;

import java.util.Arrays;

/**
 *
 * @author gunda
 */
public class CheckIfTwoStringArraysareEquivalent {

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String text1 = "";
        String text2 = "";
        
        for(var w: word1){
            text1 = text1.concat(w);
        }
        
        for(var w: word2){
            text2 = text2.concat(w);
        }
        
        return text1.equals(text2);
    }
    
}
