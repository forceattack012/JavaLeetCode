/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.howmanynumbersaresmallerthanthecurrentnumber;

/**
 *
 * @author gunda
 */
public class HowManyNumbersAreSmallerThantheCurrentNumber {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int [] ans = new int [nums.length];
        
        for(int i=0; i < nums.length; i++){
            int count = 0;
            
            for(int j=0; j< nums.length; j++){
                if(nums[j] < nums[i] && i!=j) {
                    count++;
                }
            }
            ans[i] = count;
        }
        
        return ans;
    }
    
        public int[] smallerNumbersThanCurrentOptimize(int[] nums) {
            int[] out = new int[101];
            int len = nums.length; 

            for(int i = 0 ; i < len ; i++){
                out[nums[i]]++;
            }

            for(int i = 1; i < 101; i++){
                out[i] += out[i-1];
            }

            for(int i = 0; i < len; i++){
                if(nums[i] > 0){
                    nums[i] = out[nums[i]-1]; 
                } 
            }

            return nums;
    }
    
}
