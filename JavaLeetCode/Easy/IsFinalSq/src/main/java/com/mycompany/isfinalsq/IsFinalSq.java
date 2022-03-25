/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.isfinalsq;

/**
 *
 * @author gunda
 */
public class IsFinalSq {
    public int isSquFinal(long num){
        long pows = (long) Math.pow(num, 2);
        int mod = 10;
        
        while(true) {
            if((int) (pows % mod) == num) {
                return 1;
            }
            mod*=10;
        }
       
    }
}
