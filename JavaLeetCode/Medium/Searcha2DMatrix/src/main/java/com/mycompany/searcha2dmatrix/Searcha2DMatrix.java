/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.searcha2dmatrix;

/**
 *
 * @author gunda
 */
public class Searcha2DMatrix {

    public boolean SearchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        
        for(int i=0; i < rows; i++){
            int result = BinarySearch(matrix[i], target);
            
            if(result != -1) {
                return true;
            }
        }
        return false;
    }
    
    public int BinarySearch(int[] nums, int target){
        int low = 0;
        int heigh = nums.length - 1;
        
        while(low <= heigh){
            int pivot = low + (heigh - low)/2;
            
            if(nums[pivot] == target) 
                return nums[pivot];
            else if (target > nums[pivot]) 
                low = pivot + 1;
            else 
                heigh = pivot - 1;
        }
        return -1;
    }
}
