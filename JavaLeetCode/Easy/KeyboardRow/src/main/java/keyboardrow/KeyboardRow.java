/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package keyboardrow;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gunda
 */
public class KeyboardRow {

    public String[] findWords(String[] words) {
        String[] keyboardRows = { "qwertyuiop", "asdfghjkl", "zxcvbnm" };
        List<String> ans = new ArrayList();
        
        for(String word: words) {
            String copyWord = word.toLowerCase();
            char[] wordArray = copyWord.toCharArray();
            
            for(String row: keyboardRows){
                if(row.indexOf(wordArray[0]) != -1 && checkWordArrayEachRow(wordArray, row)) {
                    if(checkWordArrayEachRow(wordArray, row)) {
                       ans.add(word);   
                    }
                }
            }
        }
        return ans.toArray(String[]::new);
    }

    private boolean checkWordArrayEachRow(char[] word, String row) {
        for(int i=0; i < word.length; i++){
            if(row.indexOf(word[i]) == -1) {
                return false;
            }
        }
        
        return true;
    }
}
