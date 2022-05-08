/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.twosum;

import java.util.HashMap;

/**
 *
 * @author gunda
 */
public class TwoSum {

    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int i=0; i< numbers.length; i++){
            int compement = target - numbers[i];
            
            if(hm.containsKey(compement)){
                return new int [] {
                    hm.getOrDefault(compement, 0),i
                };
            }
            
            hm.put(numbers[i], i);
        }
        
        return null;
    }
}
