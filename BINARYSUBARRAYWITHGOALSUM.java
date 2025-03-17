class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return func(nums, goal) - func(nums, goal - 1);
    }
    public static int func(int[] arr, int goal) {
        if (goal < 0) return 0; 
        int i = 0, sum = 0, count = 0, n = arr.length;
        for (int j = 0; j < n; j++) {
            sum += arr[j];
            while (sum > goal) { 
                sum -= arr[i];
                i++;
            }
            count += (j - i + 1);
        }
        return count;
    }
}
