/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.finalvalueofvariableafterperformingoperations;

/**
 *
 * @author gunda
 */
public class FinalValueofVariableAfterPerformingOperations {

    public int finalValueAfterOperationsNornal(String[] operations) {
        int inital = 0;
        String increments = "++";
        String decrements = "--";
        
        for(String operation: operations) {
            operation = operation.replace("X", "");
            if(increments.contains(operation)) {
                inital+= 1;
            }
            if(decrements.contains(operation)) {
                inital-= 1;
            }
        }
        return inital;
    }
    
    
    public int finalValueAfterOperationsOptiomzieBigO(String[] operations) {
        int inital = 0;   
        for(String operation: operations) {   // operations {"++X", "X++", "--X", "X++"} all elements operation has index one ,
            if(operation.charAt(1) == '+') {  // check only index 1 has + or - 
                inital+=1;
            }
            if(operation.charAt(1) == '-') {
                inital-=1;
            }
        }
        return inital;
    }
}
