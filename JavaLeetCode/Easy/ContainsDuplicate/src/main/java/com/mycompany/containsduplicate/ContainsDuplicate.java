/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.containsduplicate;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author gunda
 */
public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hm = new HashSet<>();
        
        for(int num: nums) {
            if(hm.contains(num)) {
                return true;
            }
            hm.add(num);
        }
        
        return false;
    }
}
