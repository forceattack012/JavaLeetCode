/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.reversestring;

/**
 *
 * @author gunda
 */
public class ReverseString {

    public void reverseString(char[] s) {
        int low = 0;
        int height = s.length - 1;
        
        while(low <= height) {
            char temp = s[low];
            s[low] = s[height];
            s[height] = temp;
            low++;
            height--;
        }
        
    }
}
