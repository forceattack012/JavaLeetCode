/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.createtargetarrayinthegivenorder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author gunda
 */
public class CreateTargetArrayintheGivenOrder {

    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<Integer>(nums.length);
        int[] targets = new int[nums.length];
        
        for(int i=0; i< index.length; i++){
            list.add(index[i], nums[i]);
        }
        
        for(int j=0; j < list.size(); j++) {
            targets[j] = list.get(j);
        }
        return targets;
    }
}
