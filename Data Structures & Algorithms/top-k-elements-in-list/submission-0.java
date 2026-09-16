class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> hs=new HashMap<>();
        for(int num:nums){
            hs.put(num,hs.getOrDefault(num,0)+1);
        }
        List<Integer>[]freq=new List[nums.length+1];
        for(int i=0;i<freq.length;i++){
            freq[i]=new ArrayList<>();
        }
        for(Map.Entry<Integer,Integer> entry:hs.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }
        int res[]=new int[k];
        int j=0;
        for(int i=freq.length-1;i>0&j<k;i--){
            for(int n:freq[i]){
                res[j++]=n;
            }

        }
return res;



        
    }
}
