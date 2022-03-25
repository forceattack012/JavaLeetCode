/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.nsumtok;

import java.util.ArrayList;
import java.util.Collections;



/**
 *
 * @author gunda
 */
public class NSumToK {
    int[] nums = {8,-8,8,-8,8};
        public int IsNSumToK(int [] nums, int k){
            ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
            ArrayList<Integer> sets = new ArrayList<>();
            int lastIndex = nums.length - 1;
            
            for(int i = lastIndex; i>=0; i--){ 
                ArrayList<Integer> arr = new ArrayList<>();
                
                for(int j = lastIndex; j>=i; j--){
                    arr.add(nums[j]);
                }
                
                lists.add(arr);
            }

            for(ArrayList<Integer> list: lists){
                if(sumOfArray(list) == k){
                    sets.add(list.size()); 
                }
            }

            if(sets.isEmpty()){
                return 0;
            }
            
            int min = Collections.min(sets);
            return min;
    }

    private int sumOfArray(ArrayList<Integer> list) {
        int sum = 0;
        for(int x : list){
            sum +=x;
        }
        
        return sum;
    }
}
