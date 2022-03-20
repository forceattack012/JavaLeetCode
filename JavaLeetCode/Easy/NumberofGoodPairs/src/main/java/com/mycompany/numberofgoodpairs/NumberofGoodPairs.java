/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.numberofgoodpairs;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author gunda
 */
public class NumberofGoodPairs {

    public int numIdenticalPairs(int[] nums) {
        int ans = 0;
        
        for(int i=0; i < nums.length; i++){
            for(int j=i+1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    ans++;
                }
            }
        }
        return ans;
    }
    
    public int numIdenticalPairsOptimize(int[] nums) {
        Map<Integer,Integer> paris = new HashMap<Integer,Integer>();
        int countPair = 0;
        
        for(int num: nums){
            int count = paris.getOrDefault(num, 0);
            countPair+= count;
            paris.put(num, count+1);
        }
        return countPair;
    }
}
