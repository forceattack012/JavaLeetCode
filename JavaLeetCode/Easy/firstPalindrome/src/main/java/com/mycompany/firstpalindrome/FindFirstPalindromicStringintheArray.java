/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.firstpalindrome;

/**
 *
 * @author gunda
 */
public class FindFirstPalindromicStringintheArray {

    public String firstPalindrome(String[] words) {
        for(String word: words) {
            if(isPalindom(word)) {
                return word;
            }
        }
        return "";
    }
    
    private Boolean isPalindom(String word) {
        StringBuilder sb = new StringBuilder(word);
        sb.reverse();
        return sb.toString().equals(word);
    }
}
