class Solution {
    public int maxScore(int[] arr, int k) {
        int maxSum=0;
        int lSum=0;
        int rSum=0;
        int n=arr.length;
        for(int i=0;i<k;i++){
            lSum+=arr[i];
        }
        maxSum=lSum;
        int rIndex=n-1;
        for(int i=k-1;i>=0;i--){
            lSum=lSum-arr[i];
            rSum+=arr[rIndex];
            maxSum=Math.max(lSum+rSum,maxSum);
            rIndex--;
        }
        return maxSum;
    }
}
