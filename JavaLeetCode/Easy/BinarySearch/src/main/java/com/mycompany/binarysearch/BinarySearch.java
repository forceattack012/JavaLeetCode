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

        int start = 0;
        int end = nums.length - 1;
        
        while(start < end){
            int mid = (start + end) / 2;
            
            if(nums[mid] == target) {
                return nums[mid];
            }
            if(target > nums[mid]) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
