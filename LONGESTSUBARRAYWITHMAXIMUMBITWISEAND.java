class Solution {
    public int longestSubarray(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int ele:nums){
            max=Math.max(ele,max);
        }
        int count=0;
        int maxCount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==max){
                count++;
                maxCount=Math.max(maxCount,count);
            }
            else{
                count=0;
            }
        }
        return maxCount;
    }
}
