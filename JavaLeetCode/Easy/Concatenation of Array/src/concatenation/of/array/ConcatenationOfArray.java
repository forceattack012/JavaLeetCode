/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package concatenation.of.array;

/**
 *
 * @author gunda
 */
public class ConcatenationOfArray {

    /**
     * @param nums
     * @return 
     */
    public int[] getConcatenationNormal(int[] nums) {
        int[] ans = new int[2*nums.length];
        int k = 0;
        
        for(int i=0; i < 2; i++){
            for(int j=0; j<nums.length && k < ans.length; j++){
                ans[k] = nums[j];
                k++;
            }
        }
        
        return ans;
    }
    
    
        /**
     * @param nums
     * @return 
     */
    public int[] getConcatenationOptimizeBigO(int[] nums) {
        int[] ans = new int[2*nums.length];
        
        for(int i=0; i< nums.length; i++){
            ans[i+nums.length] = nums[i];
            ans[i] = nums[i];
        }
        
        return ans;
    }
}
