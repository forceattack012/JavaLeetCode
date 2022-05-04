/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.reversebits;

/**
 *
 * @author gunda
 */
public class ReverseBits {

    public int reverseBits(int n) {
        int result = 0;
        
        for(int i = 0; i < 32; i++){
            result <<= 1;
            result = result | (n&1);
            n >>=1;
        }
        
        return result;
    }
}
