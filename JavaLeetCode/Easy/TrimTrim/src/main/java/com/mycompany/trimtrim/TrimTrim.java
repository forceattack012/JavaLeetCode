/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.trimtrim;

/**
 *
 * @author gunda
 */
public class TrimTrim {

    public String Trim(String word){
        StringBuilder text = new StringBuilder();
        
        for(int i=1; i< word.length()-1; i++){
            text.append(word.charAt(i));
        }
        
        return text.toString();
    }
}
