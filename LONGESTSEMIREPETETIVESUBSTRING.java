class Solution {
    public int longestSemiRepetitiveSubstring(String s) {
        int maxLength=0;
        if(s.length()==1){
            return 1;
        }
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                String substr=s.substring(i,j+1);
                if(semiRepetetive(substr)){
                    maxLength=Math.max(maxLength,substr.length());
                }
            }
        }
        return maxLength;
    }
    public static boolean semiRepetetive(String str){
        int count=0;
        char previous=str.charAt(0);
        for(int i=1;i<str.length();i++){
            char current=str.charAt(i);
            if(previous==current){
                count++;
            }
            else{
                previous=current;
            }
        }
        return count<=1;
    }
}
