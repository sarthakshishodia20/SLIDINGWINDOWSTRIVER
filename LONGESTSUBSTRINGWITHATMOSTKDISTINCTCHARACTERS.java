import java.util.* ;
import java.io.*; 
public class Solution {
	public static int getLengthofLongestSubstring(String s, int k) {
		// Write your code here.
		int i=0;
		int j=0;
		int n=s.length();
		HashMap<Character,Integer> map=new HashMap<>();
		int maxLen=0;
		while(j<n){
			map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
			while(map.size()>k){
				map.put(s.charAt(i),map.get(s.charAt(i))-1);
				if(map.get(s.charAt(i))==0){
					map.remove(s.charAt(i));
				}
				i++;
			}
			if(map.size()<=k){
				maxLen=Math.max(maxLen,(j-i+1));
			}
			j++;
		}
		return maxLen;
	}
}
