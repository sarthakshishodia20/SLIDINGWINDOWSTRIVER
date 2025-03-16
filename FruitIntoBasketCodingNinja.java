import java.util.*;
public class Solution {
    public static int findMaxFruits(int []arr, int n) {
        // Write your code here.
         int i=0;
        int j=0;
        // int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        int maxLen=0;
        while(j<n){
            map.put(arr[j],map.getOrDefault(arr[j],0)+1);
            if(map.size()>2){
                while(map.size()>2){
                    map.put(arr[i],map.get(arr[i])-1);
                    if(map.get(arr[i])==0){
                        map.remove(arr[i]);
                    }
                    i++;
                }
            }
            if(map.size()<=2){
                maxLen=Math.max(maxLen,(j-i+1));
            }
            j++;
        }
        return maxLen;
    }
}
