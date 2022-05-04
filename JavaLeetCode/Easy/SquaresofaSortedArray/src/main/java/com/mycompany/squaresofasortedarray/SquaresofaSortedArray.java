/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.squaresofasortedarray;

import java.util.Arrays;

/**
 *
 * @author gunda
 */
public class SquaresofaSortedArray {

    public int[] sortedSquares(int[] nums) {
        int i = 0;
        int minIndex = 0;
        
        while(i < nums.length){
            nums[i] = nums[i] * nums[i];
            i++;
        }
        
        Arrays.sort(nums);
        
        return nums;
    }
}
