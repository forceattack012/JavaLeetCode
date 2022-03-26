/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.countthenumberofconsistentstrings;

/**
 *
 * @author gunda
 */
public class CounttheNumberofConsistentStrings {

    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        
        for(String word: words){
            if(isAllowed(allowed, word)) {
                count +=1;
            }
        }
        
        return count;
    }

    private boolean isAllowed(String allowed, String word) {
        for(char c: word.toCharArray()) {
            if(allowed.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }
     
}
