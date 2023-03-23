package solutions;

public class FindMedianSortedArrays{

    public FindMedianSortedArrays(){

    }
    public double solution(int[] nums1, int[] nums2) {
        int mal = nums1.length + nums2.length;
        int[] mergedArray = new int[mal];
        float retVal = 0;
        int arr1Idx = 0;
        int arr2Idx = 0;
        int mergedIdx = 0;

        while(arr1Idx < nums1.length && arr2Idx < nums2.length){
            if(nums1[arr1Idx] < nums2[arr2Idx]){
                mergedArray[mergedIdx++] = nums1[arr1Idx++];
            }
            else
                mergedArray[mergedIdx++] = nums2[arr2Idx++];
        }

        while(arr1Idx < nums1.length)
            mergedArray[mergedIdx++] = nums1[arr1Idx++];
        while(arr2Idx < nums2.length)
            mergedArray[mergedIdx++] = nums2[arr2Idx++];


        if(mal%2 != 0){
            return mergedArray[(mal/2)];
        }
        else
            return (float)(mergedArray[(mal/2)-1] + mergedArray[mal/2])/2F;
    }
}
