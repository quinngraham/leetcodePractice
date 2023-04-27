package solutions;

import java.util.Arrays;

public class RemoveElement{
    public RemoveElement(){

    }

    public int solution(int[] nums, int val){
        int counter = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[counter] = nums[i];
                counter++;
            }
        }
        return counter;
    }
}
