class Solution {
    public int longestSubarray(int[] nums) {
        int i=0;
        int j=0;
        int n=nums.length;
        int maxSize=0;
        int zeroCount=0;
        int k=1;
        while(j<n){
            if(nums[j]==0){
                zeroCount++;
            }
            while(zeroCount>k){
                if(nums[i]==0){
                    zeroCount--;
                }
                i++;
            }
            if(zeroCount<=k){
                maxSize=Math.max(maxSize,(j-i+1));
            }
            j++;
        }
        return maxSize-1;
    }
}
