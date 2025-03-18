class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int[] arr=new int[answerKey.length()];
        for(int i=0;i<answerKey.length();i++){
            if(answerKey.charAt(i)=='T'){
                arr[i]=1;
            }
            else{
                arr[i]=0;
            }
        }
        return Math.max(maxConsecutiveOne(arr,k),maxConsecutiveZero(arr,k));
    }
    public static int maxConsecutiveOne(int[] arr,int k){
        int i=0;
        int j=0;
        int n=arr.length;
        int maxLen=0;
        int countOnes=0;
        while(j<n){
            if(arr[j]==1){
                countOnes++;
            }
            while(countOnes>k){
                if(arr[i]==1){
                    countOnes--;
                }
                i++;
            }
            if(countOnes<=k){
                maxLen=Math.max(maxLen,(j-i+1));
            }
            j++;
        }
        return maxLen;
    }
    public static int maxConsecutiveZero(int[] arr,int k){
        int i=0;
        int j=0;
        int n=arr.length;
        int maxLen=0;
        int countZeroes=0;
        while(j<n){
            if(arr[j]==0){
                countZeroes++;
            }
            while(countZeroes>k){
                if(arr[i]==0){
                    countZeroes--;
                }
                i++;
            }
            if(countZeroes<=k){
                maxLen=Math.max(maxLen,(j-i+1));
            }
            j++;
        }
        return maxLen;
    }
}
