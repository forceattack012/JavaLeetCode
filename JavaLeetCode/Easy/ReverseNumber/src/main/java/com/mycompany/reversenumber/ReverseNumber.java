/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.reversenumber;

/**
 *
 * @author gunda
 */
public class ReverseNumber {

    public int reverseNumber(int input) {
        int mod = 10;
        int revserse = 0;
        int z = input;
        int g = 1000;
        
        while(z != 0) {
            int temp = z % mod;
            z = z - temp; 
            revserse += temp * g; 
            z/=10;  
            g/=10;
        }
        
        return input - revserse;
    }
}
