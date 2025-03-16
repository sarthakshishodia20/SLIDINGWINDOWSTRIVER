class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0;
        int j=0;
        int n=nums.length;
        int maxLen=0;
        int zeroesCount=0;
        while(j<n){
            if(nums[j]==0){
                zeroesCount++;
            }
            while(zeroesCount>k){
                if(nums[i]==0){
                    zeroesCount--;
                }
                i++;
            }
            if(zeroesCount<=k){
                maxLen=Math.max(maxLen,(j-i+1));
            }
            j++;
        }
        return maxLen;
    }
}
