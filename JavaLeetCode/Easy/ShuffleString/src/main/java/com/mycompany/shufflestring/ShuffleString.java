/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.shufflestring;

/**
 *
 * @author gunda
 */
public class ShuffleString {

    public String restoreString(String s, int[] indices) {
        char[] words = s.toCharArray();
        
        for(int i=0; i<indices.length; i++){
            words[indices[i]] = s.charAt(i);
        }
        
        return String.valueOf(words);
    }
}
