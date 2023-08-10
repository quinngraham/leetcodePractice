package solutions;

public class SearchInsert{

    public SearchInsert(){

    }


    public int solution(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target)
                return mid;
            if(nums[mid] > target)
                end = mid-1;
            else
                start = mid+1;
        }
        return start;
    }
}
