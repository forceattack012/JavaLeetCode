/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.dividearrayintoequalpairs;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author gunda
 */
public class DivideArrayIntoEqualPairs {

    public boolean divideArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int num: nums){
            int count = map.getOrDefault(num, 0)+1;
            map.put(num, count);
        }
        
        for(Map.Entry<Integer, Integer> m : map.entrySet()){
            int value = m.getValue();
            if(value%2 !=0){
                return false;
            }
        }
        return true;
    }
}
