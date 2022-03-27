/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.jewelsandstones;

/**
 *
 * @author gunda
 */
public class JewelsandStones {

    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        
        for(int i=0; i < stones.length(); i++) {
            if(jewels.indexOf(stones.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }
}
