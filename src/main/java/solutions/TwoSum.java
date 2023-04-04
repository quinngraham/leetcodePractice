package solutions;

import java.util.HashMap;
import java.util.Map;

public class TwoSum{
    public TwoSum(){

    }

    public int[] solution(int[] nums, int target){
        Map<Integer, Integer> m = new HashMap<>();
        int checker;
        for(int i = 0; i < nums.length; i++){
            checker = target - nums[i];
            if(m.containsKey(checker))
                return new int[]{m.get(checker), i};
            m.put(nums[i], i);
        }
        return new int[] {};
    }
}
