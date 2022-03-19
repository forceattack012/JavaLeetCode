/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.richestcustomerwealth;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author gunda
 */
public class RichestCustomerWealth {

    public int maximumWealthNornal(int[][] accounts) {
        Map<Integer,Integer> customers = new HashMap<Integer,Integer>();
        int max = 0;
        int i =0;
        
        for(int[] account: accounts) {
            int sum = 0;
            for(int money: account) {
                sum+=money;
            }
            customers.put(i+1, sum);
            i++;
        }
        
        for(int j=0; j<i; j++){
            int weather = customers.get(j+1);
            if(weather > max) {
                max = weather;
            }
        }
        
        return max;
    }
    
    
    public int maximumWealth(int[][] accounts) {      
        int max = Integer.MIN_VALUE;
        
        for(int[] account: accounts) {
            int sumOfAccount = 0;
            for(int money: account){
                sumOfAccount+=money;
            }
            max = Math.max(max, sumOfAccount);
        }
        
        return max;
    }
}
