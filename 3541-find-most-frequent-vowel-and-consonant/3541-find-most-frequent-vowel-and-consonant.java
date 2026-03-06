class Solution {
    public int maxFreqSum(String s) {
        int[] freq=new int[26];
        for(char ch: s.toCharArray()){
            freq[ch-'a']++;
        }
        int maxvowel=0;
        int maxconso=0;
        for(int i=0;i<26;i++){
            char c=(char)(i+'a');
            if(c=='a' || c=='e'|| c=='i' || c=='o' || c=='u'){
                maxvowel= Math.max(maxvowel, freq[i]);

            }
            else{
                maxconso=Math.max(maxconso, freq[i]);
            }
        }
        return maxvowel+maxconso;
    }
}