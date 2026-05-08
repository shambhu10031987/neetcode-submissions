class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet s=new HashSet();
        for(int j:nums){
            s.add(j);

        }
        if(s.size()==nums.length){
            return false;
        }
        else
        return true;
    }
}