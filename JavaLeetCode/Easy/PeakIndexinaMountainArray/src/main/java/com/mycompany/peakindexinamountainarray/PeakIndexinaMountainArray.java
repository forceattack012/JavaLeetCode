/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.peakindexinamountainarray;

/**
 *
 * @author gunda
 */
public class PeakIndexinaMountainArray {

    public int peakIndexInMountainArray(int[] arr) {
        int i = 0;
        
        while(arr[i] < arr[i+1]) {
            i++;
        }
        
        return i;
    }
    
    
    public int peakIndexInMountainArrayBinarySearch(int[] arr) {
        int low = 0;
        int height = arr.length - 1;
        
        while(low < height) {
            int mid = low + (height - low)/2;
            
            if(arr[mid] < arr[mid + 1]){
                low = mid + 1;
            }
            else {
                height = mid;
            }
        }
        
        return low;
    }
}
