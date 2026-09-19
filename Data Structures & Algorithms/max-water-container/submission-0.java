class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int max=-1;
        int height=-1;
        while(left<right){
            height=Math.min(heights[left],heights[right]);
            max=Math.max(height*(right-left),max);
            if(heights[left]<heights[right]) left++;
            else right--;
        }
        return max;
    }
}
