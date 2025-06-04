import java.util.* ;
import java.io.*; 
public class Solution {
	public static int minSubArrayLen(int arr[], int target, int n) {
		// Write your code here.
		int minLength=Integer.MAX_VALUE;
		int i=0;
		int j=0;
		int currentSum=0;
		while(j<n){
			int element=arr[j];
			currentSum+=element;
			while(currentSum>target){
				minLength=Math.min(minLength,(j-i+1));
				currentSum=currentSum-arr[i];
				i++;
			}
			j++;
		}
		return minLength==Integer.MAX_VALUE?0:minLength;
	}
}
