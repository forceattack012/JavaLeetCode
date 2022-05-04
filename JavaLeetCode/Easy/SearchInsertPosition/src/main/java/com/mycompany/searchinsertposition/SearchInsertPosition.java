/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.searchinsertposition;

/**
 *
 * @author gunda
 */
public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = 1;
        
        while(start <= end) {
            mid = start + (end - start)/2;
            
            if(nums[mid] == target){
                return mid;
            }
            
            if(nums[mid] > target) {
                end = mid - 1; 
            }
            else {
                start = mid +1;
            }
        }
        
        return start;  
    }
}
