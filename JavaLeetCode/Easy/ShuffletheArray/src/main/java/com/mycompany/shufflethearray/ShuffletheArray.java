/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.shufflethearray;

/**
 *
 * @author gunda
 */
public class ShuffletheArray {

    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        
        for(int i= 0; i < n; i++){
            ans[i*2] = nums[i];
            ans[i*2+1] = nums[i+n];
        }
        
        return ans;
    }
}
