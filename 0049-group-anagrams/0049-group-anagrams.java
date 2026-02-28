class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List>map=new HashMap<>();
        for(String s:strs){
            int[] cnt=new int[26];
            for(char c:s.toCharArray()){
                cnt[c-'a']++;
            }
            StringBuilder sb=new StringBuilder();
            for(int i:cnt){
                sb.append('#');
                sb.append(i);
            }
            String key=sb.toString();
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<String>());
            }
            map.get(key).add(s);

        }
        return new ArrayList(map.values());
    }
}