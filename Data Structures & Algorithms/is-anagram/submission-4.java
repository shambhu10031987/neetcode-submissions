class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;

        }
       // Map<Character,Long> smap=s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
       // Map<Character,Long> tmap=t.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
            HashMap<Character,Integer> smap=new HashMap<>();
            HashMap<Character,Integer> tmap=new HashMap<>();
            for(int i=0;i<s.length();i++){
                smap.put(s.charAt(i),smap.getOrDefault(s.charAt(i),0)+1);
                tmap.put(t.charAt(i),tmap.getOrDefault(t.charAt(i),0)+1);

            }

        return smap.equals(tmap);

    }
}