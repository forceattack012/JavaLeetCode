/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.runningsumof1darray;

/**
 *
 * @author gunda
 */
public class RunningSumof1dArray {

    public int[] runningSum(int[] nums) {
        int[] runnings = new int[nums.length];
        
        for(int i=0; i<nums.length; i++){
            int sum = 0;
            for(int j=0; j<=i; j++){
                sum+=nums[j];
            }
            runnings[i] = sum;
        }
        
        return runnings;
    }
    
    public int[] runningSumOptimizeBigOn(int[] nums) {
        for(int i =1; i<nums.length; i++){                     
            nums[i]+=nums[i-1];                             //example index 3  nums = [2,4,5,3], nums[3] = sum of index before that is [2+4+5]
        }
        
        return nums;
    }
}
