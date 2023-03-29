package solutions;

import java.util.*;

public class ThreeSum{
    public ThreeSum(){
    }

    public List<List<Integer>> solution(int[] nums){

        Set<List<Integer>> ans = new HashSet<>();
        Arrays.sort(nums);
        int i, j, k, checker;
        for(i = 0; i < nums.length-2; i++){
            j = i+1;
            k = nums.length-1;
            while(j<k){
                checker = nums[i]+nums[j]+nums[k];
                if(checker == 0){
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                }
                else if(checker > 0)
                    k--;
                else
                    j++;
            }
        }
        return new ArrayList<>(ans);
    }
}
