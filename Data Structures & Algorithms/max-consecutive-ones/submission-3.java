class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int counter=0; int maxcounter=0;
        for(int num:nums){
            if(num==1){
             maxcounter=Math.max(maxcounter,++counter);
            }
            else{
                counter=0;
            }
        }
        return maxcounter;

    }
}