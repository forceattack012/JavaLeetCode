/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.findgreatestcommondivisorofarray;

/**
 *
 * @author gunda
 */
public class FindGreatestCommonDivisorofArray {

    public int findGCD(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        
        for(int num: nums){
            if(num > max){
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }      
        int gcd = GCD(max, min);
        
        return gcd;
    }

    private int GCD(int a, int b) {
        if(b == 0){
            return a;
        }
        
        return GCD(b, a%b);
    }
}
