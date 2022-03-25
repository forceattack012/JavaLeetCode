/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pairsarray;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author gunda
 */
public class PairsArray {

    public int PairArray(int [] nums) {
        Map<Integer,Integer> maps = new HashMap<>();
        
        if(nums.length == 0) {
            return 0;
        }
        
        for(int num : nums) {
            int count = maps.getOrDefault(num ,0);
            count+=1;
            maps.put(num, count);
        }
        
        for(int num: nums){
            int count = maps.get(num);
            if(count != 2){
                return 0;
            }
        }
        return 1;
    }    
}
