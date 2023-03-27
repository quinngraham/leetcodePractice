package solutions;

public class ContainerWithMostWater{
    public ContainerWithMostWater(){

    }

    public int solution(int[] height){
        int sol = 0;
        int left = 0;
        int right = height.length-1;
        int calc;

        while(left < right){
            if(height[left] <= height[right]){
                calc = height[left]*(right-left);
                left++;
            }
            else{
                calc = height[right]*(right-left);
                right--;
            }
            if(calc > sol) sol = calc;
        }
        return sol;
    }
}
