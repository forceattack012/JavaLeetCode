/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.truncatesentence;

/**
 *
 * @author gunda
 */
public class TruncateSentence {

    public String truncateSentence(String s, int k) {
        StringBuilder sb = new StringBuilder();
        String[] word = s.split(" ");
        
        for(int i=1; i<=k; i++){
            if(i != k){
                sb.append(word[i-1]).append(" ");
            }
            else {
                sb.append(word[i-1]);
            }
        }
        
        return sb.toString();
    }
}
