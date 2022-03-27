/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.binarysearch;

/**
 *
 * @author gunda
 */
public class BinarySearch {

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int pivot;
        
        while(left < right) {
            pivot = (right + left)/2;
            
            if(nums[pivot] == target) return pivot;
            else if(target > nums[pivot]) right = right - 1;
            else if(target < nums[pivot]) left = left + 1;
        }
        
        return -1;
    }
}
