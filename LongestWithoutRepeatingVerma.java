import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0;
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        int len = 0; // Fix: Initialize to 0

        while (j < n) {
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);

            // If duplicate characters exist, move 'i' forward
            while (map.size() < (j - i + 1)) {
                map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                if (map.get(s.charAt(i)) == 0) {
                    map.remove(s.charAt(i));
                }
                i++;
            }

            // Update max length if all characters are unique
            len = Math.max(len, j - i + 1);

            j++; // Move right pointer
        }

        return len;
    }
}
