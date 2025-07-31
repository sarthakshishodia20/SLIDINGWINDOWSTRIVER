class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (s == null || s.length() == 0 || words == null || words.length == 0) {
            return result;
        }
        int wordLength = words[0].length();
        int totalWords = words.length;
        int totalWindowSize = wordLength * totalWords;
        if (s.length() < totalWindowSize) {
            return result;
        }
        HashMap<String, Integer> wordMap = new HashMap<>();
        for (String word : words) {
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }
        for (int i = 0; i <= s.length() - totalWindowSize; i++) {
            HashMap<String, Integer> tempMap = new HashMap<>(wordMap);
            int j = i;
            int usedWords = 0;
            while (j < i + totalWindowSize) {
                String currentWord = s.substring(j, j + wordLength);
                if (!tempMap.containsKey(currentWord) || tempMap.get(currentWord) == 0) {
                    break;
                } else {
                    tempMap.put(currentWord, tempMap.get(currentWord) - 1);
                    usedWords++;
                }
                j += wordLength;
            }
            if (usedWords == totalWords) {
                result.add(i);
            }
        }
        return result;
    }
}
