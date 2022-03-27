/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.indexofindexof;

/**
 *
 * @author gunda
 */
public class IndexOfIndexOf {

    public int IndexOf(String word, char ch){
        for(int i=0; i< word.length(); i++){
            if(word.charAt(i) == ch) {
                return i;
            }
        }
        return -1;
    }
}
