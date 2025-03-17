class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i] % 2;
        }
        return func(arr, k) - func(arr, k - 1);
    }

    public static int func(int[] arr, int goal) {
        if (goal < 0) return 0;  
        int count = 0, sum = 0, i = 0, j = 0, n = arr.length;
        while (j < n) {
            sum += arr[j];
            while (sum > goal) {
                sum -= arr[i];
                i++;
            }
            count += (j - i + 1);
            j++;
        }
        return count;
    }
}
