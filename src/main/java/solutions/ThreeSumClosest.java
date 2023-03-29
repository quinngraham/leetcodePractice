package solutions;

import java.util.*;

public class ThreeSumClosest{
    public ThreeSumClosest(){

    }

    public int solution(int[]nums, int target){
        Arrays.sort(nums);
        int ans = nums[0]+nums[1]+nums[2];
        int i, j, k, checker;
        for(i = 0; i < nums.length-2; i++){
            j = i+1;
            k = nums.length-1;
            while(j<k){
                checker = nums[i]+nums[j]+nums[k];
                if(i == 1 && j == 6 && k == 11)
                    System.out.println("hello");

                if(Math.abs(target-ans) >= Math.abs(target-checker)){
                    ans = checker;
                    if(ans == target)
                        return ans;

                }
                if(checker > target)
                    k--;
                else
                    j++;
            }
        }
        return ans;
    }

}
