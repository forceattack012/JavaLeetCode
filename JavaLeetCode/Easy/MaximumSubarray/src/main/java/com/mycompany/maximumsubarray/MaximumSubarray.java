/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.maximumsubarray;

/**
 *
 * @author gunda
 */
public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        
        for(int n : nums){
            sum+=n;
            max = Math.max(max, sum);
            
            if(max < 0){
                max = sum;
            }
            if(sum<=0) {
                sum=0;
            }
        }
        
        return max;
    }
}
