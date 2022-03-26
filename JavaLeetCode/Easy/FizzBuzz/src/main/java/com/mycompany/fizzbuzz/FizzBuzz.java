/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gunda
 */
public class FizzBuzz {

    public List<String> fizzBuzz(int n) {
        List<String> answes = new ArrayList<>(n);
        
        for(int i=1; i<=n; i++){
            if(i%3 == 0 && i%5 ==0) {
                answes.add(i -1 , "FizzBuzz");
            }
            else if(i%3 == 0) {
                answes.add(i -1 , "Fizz");
            }
            else if(i%5 == 0){
                answes.add(i -1 , "Buzz");
            }
            else {
                answes.add(i-1, String.valueOf(i));
            }
        }
        return answes;
    }
}
