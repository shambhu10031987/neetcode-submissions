class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String ,List<String>> hs =new HashMap<>();
        for(String s: strs){
            char a[]=s.toCharArray();

            Arrays.sort(a);
            String sortedString=new String(a);
            hs.putIfAbsent(sortedString,new ArrayList());
            hs.get(sortedString).add(s);
        }
        return new ArrayList<>(hs.values());
    }
}
