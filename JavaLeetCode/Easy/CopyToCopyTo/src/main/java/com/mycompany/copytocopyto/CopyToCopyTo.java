/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.copytocopyto;

/**
 *
 * @author gunda
 */
public class CopyToCopyTo {

    public void CopyTo(int sourceIndex, String input, char[] newArray,int destinationIndex, int count) {
        for(int i=sourceIndex; i< input.length() && destinationIndex < count; i++){
            newArray[destinationIndex] = input.charAt(i);
            destinationIndex +=1;
        }
    }
}
