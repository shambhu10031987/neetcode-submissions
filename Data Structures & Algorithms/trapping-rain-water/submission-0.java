class Solution {
    public int trap(int[] height) {
        int n=height.length-1;
        if(n==0){return 0;}
        int leftMax[]=new int[height.length];
        int rightMax[]=new int[height.length];
         leftMax[0]=height[0] ;
         rightMax[n]=height[n];
        for(int i=1;i<=n;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        for(int i=n-1;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }
        int total=0;
        for(int i=0;i<n;i++){
total+=Math.min(rightMax[i],leftMax[i])-height[i];
        }
        return total;
    }
}
