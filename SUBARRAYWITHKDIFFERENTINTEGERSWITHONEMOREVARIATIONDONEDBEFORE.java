class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMostK(nums,k)-atMostK(nums,k-1);
    }
    public static int atMostK(int[] arr,int k){
        int i=0;
        int j=0;
        int n=arr.length;
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(j<n){
            map.put(arr[j],map.getOrDefault(arr[j],0)+1);
            while(map.size()>k){
                int leftNum=arr[i];
                map.put(leftNum,map.get(leftNum)-1);
                if(map.get(leftNum)==0){
                    map.remove(leftNum);
                }
                i++;
            }
            if(map.size()<=k){
                count+=(j-i+1);
            }
            j++;
        }
        return count;
    }
}
