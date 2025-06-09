class Solution {
    public int numberOfSubstrings(String s) {
        int[] lastSeen = {-1, -1, -1}; 
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            lastSeen[s.charAt(i) - 'a'] = i; // always update the latest index
            
            // Only if all characters have been seen at least once
            if (lastSeen[0] != -1 && lastSeen[1] != -1 && lastSeen[2] != -1) {
                int minLastSeen = Math.min(lastSeen[0], Math.min(lastSeen[1], lastSeen[2]));
                count += minLastSeen + 1; // all substrings ending at i and starting at 0 to minLastSeen are valid
            }
        }
        
        return count;
    }
}
