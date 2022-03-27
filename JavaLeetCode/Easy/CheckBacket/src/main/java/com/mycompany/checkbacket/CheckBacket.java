/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.checkbacket;

import java.util.Stack;

/**
 *
 * @author gunda
 */
public class CheckBacket {

    public Boolean IsCheckBacket(String input) {
        Stack<String> stack = new Stack<String>();
        
        for(int i=0; i<input.length(); i++){
            if(isOpenBacket(input.charAt(i))) {
                stack.push(String.valueOf(input.charAt(i)));
            }
            else {
                if(stack.isEmpty()) {
                    return false;
                }
                
                String peek = stack.peek();
                if(IsMatchBacket(peek, String.valueOf(input.charAt(i)))){
                    stack.pop();
                }
            }
        }
        
        if(stack.isEmpty()){
            return true;
        }
        
        return false;
    }

    private boolean isOpenBacket(char ch) {
        return ch == '{' || ch == '(' || ch == '[';
    }

    private boolean IsMatchBacket(String peek, String ch) {
        if(peek.equals("{") && ch.equals("}")) {
            return true;
        }
        else if(peek.equals("(") && ch.equals(")")) {
            return true;
        }
        else if(peek.equals("[") && ch.equals("]"))
        {
            return true;
        }
        
        return false;
    }
}
