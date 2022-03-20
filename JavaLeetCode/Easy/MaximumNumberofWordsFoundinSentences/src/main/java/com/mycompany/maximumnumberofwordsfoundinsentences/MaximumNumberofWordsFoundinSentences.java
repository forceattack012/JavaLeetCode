/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.maximumnumberofwordsfoundinsentences;

/**
 *
 * @author gunda
 */
public class MaximumNumberofWordsFoundinSentences {

    public int mostWordsFound(String[] sentences) {
        int max = Integer.MIN_VALUE;
        
        for(String sentence: sentences){
            String[] words = sentence.split("\\s");  // "\\s" use white space
            max = Math.max(words.length, max);
        }
        return max;
    }
}
