class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            int num=target-numbers[i];
            if(hs.containsKey(num)){
          
                return new int[]{hs.get(num),i+1,};
                }
                            hs.put(numbers[i],i+1);

            }
        
        return new int[]{};
        
    }
}
