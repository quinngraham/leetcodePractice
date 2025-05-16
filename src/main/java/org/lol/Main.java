package org.lol;


import java.util.HashMap;
import java.util.Map;

public class Main{
    public static void main(String[] args){

    }


    public int[] twoSum(int[]nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        int checker;
        for(int i = 0; i < nums.length; i++){
            checker = target - nums[i];
            if(map.containsKey(checker)){
                return new int[]{map.get(checker), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}