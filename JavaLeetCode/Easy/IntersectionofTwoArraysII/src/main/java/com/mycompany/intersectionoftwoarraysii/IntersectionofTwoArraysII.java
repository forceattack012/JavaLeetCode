/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.intersectionoftwoarraysii;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author gunda
 */
public class IntersectionofTwoArraysII {

    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int p1 = 0;
        int p2 = 0;
        int m = nums1.length;
        int n = nums2.length;
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        while(p1 < m && p2 < n) {
            if(nums1[p1] == nums2[p2]) {
                arr.add(nums1[p1]);
                p1++;
                p2++;
            }
            else if(nums1[p1] < nums2[p2]) {
                p1++;
            }
            else {
                p2++;
            }
        }
        
        int[] result = new int[arr.size()];
        int i = 0;
        for(int a: arr){
            result[i++] = a;
        }
        
        return result;
    }
}
