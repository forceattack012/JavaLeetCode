/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sumofalloddlengthsubarrays;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gunda
 */
public class SumofAllOddLengthSubarrays {

    public int sumOddLengthSubarrays(int[] arr) {
        int length = arr.length;
        List<Integer> indexOdds = new ArrayList<Integer>();
        int sum = 0;
        
        for(int i=0; i <= length; i++) {
            if(i%2 != 0 && i>1){
                indexOdds.add(i);
            }
        }
        
        for(int ar : arr) {
            sum += ar;
        }
        
        //Window Silding
        for(int j=0; j<indexOdds.size(); j++){
            int windowSize = indexOdds.get(j);
            for(int i=0; i < length - windowSize + 1; i++){
                for(int k=i; k < i + windowSize; k++){
                    sum+= arr[k];
                }
            }
        }
        
        return sum;
    }
}
