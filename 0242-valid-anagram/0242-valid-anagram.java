class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        
        HashMap<Character,Integer> mapS=new HashMap<>();
        HashMap<Character,Integer> mapT=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);
        
       mapS.put(c1,mapS.getOrDefault(c1,0)+1);
       mapT.put(c2,mapT.getOrDefault(c2,0)+1);

        }
        return mapS.equals(mapT);
    }
}