class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.length()<ransomNote.length()){
            return false;
        }
        HashMap<Character,Integer> mapr=new HashMap<>();
        HashMap<Character,Integer> mapm=new HashMap<>();

        for(int i=0;i<ransomNote.length();i++){
            char c1=ransomNote.charAt(i);
            mapr.put(c1,mapr.getOrDefault(c1,0)+1);
        }

        for(int i=0;i<magazine.length();i++){
            char c2=magazine.charAt(i);
            mapm.put(c2,mapm.getOrDefault(c2,0)+1);
        }
//keySet--> HashMap ke saare unique ko niakalnaaa......
        for(char c:mapr.keySet()){
            if(mapm.getOrDefault(c,0)<mapr.get(c)){
                return false;
            }
        }

return true;
    }
}