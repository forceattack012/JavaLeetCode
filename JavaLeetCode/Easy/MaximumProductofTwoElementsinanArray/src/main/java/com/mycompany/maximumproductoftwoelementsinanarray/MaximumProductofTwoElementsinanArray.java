/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.maximumproductoftwoelementsinanarray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author gunda
 */
public class MaximumProductofTwoElementsinanArray {

    public int maxProduct(int[] nums) {
        int max = 0;
        
        for(int i = 0; i<nums.length ;i++){
            for(int j = i+1; j < nums.length; j++){
                int temp = (nums[i]-1) * (nums[j]-1);
                
                if(temp > max) {
                    max = temp;
                }
            }
        }    
        return max;
    }
    
    
    public int maxProductOptimize(int[] nums) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        
        for(int num: nums){
            if(num >= first){
                second = first;
                first = num;
            }
            else if(num >= second){
                second = num;
            }
        }
        return (first-1) * (second-1);
    }
}
