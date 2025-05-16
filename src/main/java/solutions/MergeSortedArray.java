package solutions;

public class MergeSortedArray{
    public MergeSortedArray(){

    }

    public void Solution(int[] nums1, int m, int[] nums2, int n){
        //Edge cases of both lists being 0.
        if(n == 0)
            return;
        else if(m == 0){
            for(int y = 0; y < n; y++){
                nums1[y] = nums2[y];
            }
            return;
        }

        //Init worker array to store vals on the fly and copy that to nums1 at the end.
        int[] worker = new int[m+n];
        int wrkrPtr = 0;
        int x = 0;
        for(int i = 0; i < m+n; i++){
            while(x < nums2.length){
                if(i >= m || nums1[i] >= nums2[x]){
                    worker[wrkrPtr] = nums2[x];
                    wrkrPtr++;
                    x++;
                }
                else if(nums1[i] < nums2[x]){
                    worker[wrkrPtr] = nums1[i];
                    wrkrPtr++;
                    break;
                }
            }
            if(x == nums2.length && i < m){
                worker[wrkrPtr] = nums1[i];
                wrkrPtr++;
            }

        }
        for(int p = 0; p < m+n; p++)
            nums1[p] = worker[p];
    }
}
