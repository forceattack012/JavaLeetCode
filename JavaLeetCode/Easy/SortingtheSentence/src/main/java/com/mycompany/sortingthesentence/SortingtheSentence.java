/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sortingthesentence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author gunda
 */
public class SortingtheSentence {

    public String sortSentence(String s) {
        String[] words = s.split("\\s+");
        List<String> orderWords = new ArrayList<String>(Arrays.asList(words));

        for (String word : words) { 
            char numberOfWord = word.charAt(word.length()-1);
            Integer number = Integer.parseInt(String.valueOf(numberOfWord));  
            String newWord = word.replaceAll("\\d","");         
            orderWords.set(number -1  , newWord);
        }
        
        return String.join(" ",orderWords);
    }
}
