/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.replacereplace;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gunda
 */
public class ReplaceReplace {

    public String Replace(String input, String pattern, String replace) {
        String[] split = split(input, ' ');
//        for(int i=0; i< input.length(); i++){
//            
//        }
        
        return "";
    }
    
    private String[] split(String input, char ch) {
        int count = 0;
        int index = 0;
        List<String> temps = new ArrayList<>();
        
        for(int i =0 ; i < input.length(); i++) {
            if(input.charAt(i) == ch) {
                count++;
            }
        }
        
        for(int i=0; i< count+1 && index < input.length() ; i++){
            String text = "";
            if(input.charAt(index) == ch) {
                index++;
            }
            while(input.charAt(index) != ch && index < input.length()) {
                 text += input.charAt(index);
                 index++;
            }
            if(text != ""){
                temps.add(text);
            }
        }
        return (String[]) temps.toArray();
    }
    
    private Boolean CheckInputInPattern(String pattern, char ch) {
        for(int i =0; i< pattern.length(); i++) {
            if(pattern.charAt(i) == ch) {
                return true;
            }
        }
        return false;
    }
    
    private int getIndexOf(String replace, char input) {
        for(int i =0 ;i <replace.length() ; i++) {
            if(replace.charAt(i) == input) {
                return i;
            }
        }
        return -1;
    }
}
