/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuildArrayfromPermutation;

/**
 *
 * @author gunda
 */
public class BuildArrayfromPermutation {
    public int[] buildArray(int[] nums) {
        int [] ans = new int [nums.length];
        
        for(int i : nums){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
