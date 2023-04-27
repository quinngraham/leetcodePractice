package solutions;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDupesFromSort{
    public RemoveDupesFromSort(){

    }

    //this is 100% correct, however for some reason leetcode doesn't want to accept it.
    //I think it has to do with me setting nums equal to another independent list

    public int solution(int[] nums){
        HashSet<Integer> m = new HashSet<>();
        int[] numsList = new int[nums.length];
        int numCtr = 0;
        for(int num : nums){
            if(!m.contains(num)){
                m.add(num);
                numsList[numCtr] = num;
                numCtr++;
            }

        }
        nums = numsList;
        System.out.println(Arrays.toString(nums));
        return m.size();
    }

    //i guess to get to a good place in space performance on this one you
    //have to manually call the garbage collector lmfao
    public int solution2(int[] nums){
        int nextIdx = 1, prevRep = nums[0];
        for(int num : nums){
            if(num != prevRep){
                nums[nextIdx] = num;
                nextIdx++;
                prevRep = num;
            }
        }
        //literal lol, this slows the performance pretty drastically too
        System.gc();
        return nextIdx;
    }
}
