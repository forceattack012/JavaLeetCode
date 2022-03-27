/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.orderbydesc;

/**
 *
 * @author gunda
 */
public class OrderByDesc {

    public int[] OrderByDESC(int[] nums) {
        int max;
        int indexMax = 0;
        
        for(int i =0; i< nums.length; i++){
            max = nums[i];
            for(int j=i+1; j< nums.length; j++){
                if(nums[j] > max){
                    max = nums[j];
                    indexMax = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[indexMax];
            nums[indexMax] = temp;
        }
        
        return nums;
    }
}
