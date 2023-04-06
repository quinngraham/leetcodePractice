package solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum{
    public FourSum(){

    }
    int len;

    public List<List<Integer>> solution(int[] nums, int target){
        len = nums.length;
        Arrays.sort(nums);
        return ksums(nums, target, 4, 0);
    }

    public ArrayList<List<Integer>> ksums(int[] nums, int t, int k, int idx){
        ArrayList<List<Integer>> res = new ArrayList<>();
        if(idx >= len)
            return res;
        if(k == 2){
            int i = idx, j = len-1;
            while(i<j){
                if(nums[i]+nums[j] == t){
                    List<Integer> inter = new ArrayList<>();
                    inter.add(nums[i]);
                    inter.add(nums[j]);
                    res.add(inter);
                    //not fully sure why we have to remove dupes
                    while(i<j && nums[i] == nums[i+1]) i++;
                    while(i<j && nums[j] == nums[j-1]) j--;
                    i++;
                    j--;
                }
                else if(t - nums[i] > nums[j])
                    i++;
                else
                    j--;
            }
        }
        else{
            for(int i = idx; i < len-k+1; i++){
                ArrayList<List<Integer>> inter = ksums(nums, t - nums[i], k-1, i+1);
                if(inter != null){
                    for(List<Integer> l : inter){
                        l.add(0, nums[i]);
                    }
                    res.addAll(inter);
                }
                //skip 'dupes' again??
                while(i < len-1 && nums[i] == nums[i+1]) i++;
            }
        }
        return res;
    }
}
