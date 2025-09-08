
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        int i=0;
        int j=0;
        int n=arr.length;
        ArrayList<Integer> ans=new ArrayList<>();
        int currSum=0;
        while(j<n){
            currSum+=arr[j];
            while(currSum>target){
                currSum=currSum-arr[i];
                i++;
            }
            // currSum+=arr[j];
            if(currSum==target){
                ans.add(i+1);
                ans.add(j+1);
                return ans;
            }
            j++;
        }
        ans.add(-1);
        return ans;
    }
}
