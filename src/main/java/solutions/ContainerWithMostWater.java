package solutions;

public class ContainerWithMostWater{
    public ContainerWithMostWater(){

    }

    public int solution(int[] height){


        int leftPtr;
        int rightPtr = height.length-1;
        int h1 = height[0];
        int h2 = height[height.length-1];
        int dist = height.length-1;
        int sol = h1>h2 ? h2*dist : h1*dist;
        if(height.length % 2 == 0){
            for(leftPtr = 1; leftPtr < height.length/2; leftPtr++){
                if(height[leftPtr]-h1 > 1 && height[rightPtr]-h2 > 1){
                    h1 = height[leftPtr];
                    h2 = height[rightPtr];
                    sol = h1>h2 ? h2*dist : h1*dist;
                }
                else if(height[leftPtr]-h1 > 1){
                    h1 = height[leftPtr];
                    sol = h1>h2 ? h2*dist : h1*dist;
                }
                else if(height[rightPtr]-h2 > 1){
                    h2 = height[rightPtr];
                    sol = h1>h2 ? h2*dist : h1*dist;
                }
                rightPtr--;
            }
        }
        else{
            for(leftPtr = 0; leftPtr < height.length/2; leftPtr++){

            }
        }
        return sol;
    }
}
