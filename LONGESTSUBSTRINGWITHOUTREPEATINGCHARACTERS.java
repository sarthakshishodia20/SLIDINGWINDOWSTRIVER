import java.util.*; 
public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int n = s.length();
        int len = 0;
        while (right < n) {
            if (map.containsKey(s.charAt(right))) {
                left = Math.max(left, map.get(s.charAt(right)) + 1);
            }
            map.put(s.charAt(right), right);
            len = Math.max(len, right - left + 1);
            right++;
        }
        return len;
    }
}


// GFG
// User function Template for Java

class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        HashMap<Character,Integer> map=new HashMap<>();
        int maxLen=0;
        int i=0;
        int j=0;
        int n=s.length();
        while(j<n){
            char ch=s.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch)>1){
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
                if(map.get(s.charAt(i))==0){
                    map.remove(s.charAt(i));
                    
                }
                i++;
            }
            if(map.size()==(j-i+1)){
                maxLen=Math.max(maxLen,(j-i+1));
            }
            j++;
        }
        return maxLen;
    }
}
