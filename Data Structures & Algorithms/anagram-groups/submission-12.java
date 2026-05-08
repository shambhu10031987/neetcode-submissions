class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> hs=new HashMap<>();
        for(String str:strs){
            int[] count=new int[26];
            for(char c:str.toCharArray()){
                count[c-'a']++;
            }
            String key=Arrays.toString(count);
            hs.putIfAbsent(key,new ArrayList());
            hs.get(key).add(str);
        }
return new ArrayList<>(hs.values());
    }
}
