/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.countitemsmatchingarule;

import java.util.List;

/**
 *
 * @author gunda
 */
public class CountItemsMatchingaRule {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        
        for(List<String> item: items){
            boolean isExists = searchByRuleKey(ruleKey, ruleValue, item);
            if(isExists) {
                count++;
            }
        }
        
        return count;
    }

    private boolean searchByRuleKey(String ruleKey, String ruleValue, List<String> item) {
        if(ruleKey.equals("type") && item.get(0).equals(ruleValue)) {
            return true;
        }
        else if(ruleKey.equals("color") && item.get(1).equals(ruleValue)) {
            return true;
        }
        else if(ruleKey.equals("name") && item.get(2).equals(ruleValue)) {
            return true;
        }
        
        return false;
    }
}
